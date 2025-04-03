package stage_1.week_1

import kotlin.math.sqrt


fun isValidSudoku(grid: List<List<Char>>): Boolean {
    val size = grid.size
    val subgridSize = sqrt(size.toDouble()).toInt()

    return (grid.all(::isValidGroup) &&
            (0..<size).all { col -> isValidGroup(grid.map { it[col] }) } &&
            (0..<size step subgridSize).all { row ->
                (0..<size step subgridSize).all { col ->
                    /*
                    (0,0) (0,3) (0,6)
                    (3,0) (3,3) (3,6)
                    (6,0) (6,3) (6,6)
                    */
                    isValidGroup(collectSubgrid(grid, row, col, subgridSize))
                }
            })
}

// Helper function to check for duplicates
private fun isValidGroup(group: List<Char>): Boolean {
    //check for duplicates
    return if (!isDuplicateInGroup(group)){
        //check for zeros
        return !group.contains('0')
    } else {
        false
    }
}

private fun isDuplicateInGroup(group: List<Char>): Boolean =
    group.filter { it != '-' }.let { it.size != it.toSet().size }
// Extracts values from a subgrid
private fun collectSubgrid(grid: List<List<Char>>, row: Int, col: Int, subgridSize: Int) =
    List(subgridSize * subgridSize) { i -> grid[row + i / subgridSize][col + i % subgridSize] }
