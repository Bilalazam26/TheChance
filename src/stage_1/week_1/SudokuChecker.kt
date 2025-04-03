package stage_1.week_1

import kotlin.math.sqrt

fun isValidSudoku(grid: List<List<Char>>): Boolean {
    val size = grid.size
    val subgridSize = sqrt(size.toDouble()).toInt()

    return (grid.all(::isValidSet) &&
            (0 until size).all { col -> isValidSet(grid.map { it[col] }) } &&
            (0 until size step subgridSize).all { row ->
                (0 until size step subgridSize).all { col ->
                    /*
                    (0,0) (0,3) (0,6)
                    (3,0) (3,3) (3,6)
                    (6,0) (6,3) (6,6)
                    */
                    isValidSet(collectSubgrid(grid, row, col, subgridSize))
                }
            })
}

// Helper function to check for duplicates
private fun isValidSet(elements: List<Char>) =
    elements.filter { it != '-' }.let { it.size == it.toSet().size }

// Extracts values from a subgrid
private fun collectSubgrid(grid: List<List<Char>>, row: Int, col: Int, subgridSize: Int) =
    List(subgridSize * subgridSize) { i -> grid[row + i / subgridSize][col + i % subgridSize] }

fun Int.asCodeToChar(): Char = when {
    this < 10 -> this.digitToChar()
    this in 10..16 -> (this+55).toChar()
    else -> '-'
}