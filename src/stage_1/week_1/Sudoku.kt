package stage_1.week_1

import kotlin.math.sqrt


fun isValidSudoku(grid: List<List<Char>>): Boolean {
    val size = grid.size
    val subgridSize = sqrt(size.toDouble()).toInt()

    return (
            //validate rows
            //grid.all(::isValidGroup) &&
            grid.all {row -> isValidGroup(row) } &&
                    //validate columns
            (0..<size).all { col -> isValidGroup(grid.map { it[col] }) } &&
                    //validate subgrids
            (0..<size step subgridSize).all { row ->
                (0..<size step subgridSize).all { col ->
                    /*
                    (0,0) (0,3) (0,6)
                    (3,0) (3,3) (3,6)
                    (6,0) (6,3) (6,6)
                    */
                    isValidGroup(extractSubgrid(grid, row, col, subgridSize))
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
private fun extractSubgrid(grid: List<List<Char>>, row: Int, col: Int, subgridSize: Int) =
    List(subgridSize * subgridSize) { index ->
        val rowShift = index / subgridSize
        val colShift = index % subgridSize
        grid[row + rowShift][col + colShift]
    }

/*
        ('5', '3', '-',   '-', '7', '-',   '-', '-', '-'),
        ('6', '-', '-',   '1', '9', '5',   '-', '-', '-'),
        ('-', '9', '8',   '-', '-', '-',   '-', '6', '-'),


        ('8', '-', '-',   '-', '6', '-',   '-', '-', '3'),
        ('4', '-', '-',   '8', '-', '3',   '-', '-', '1'),
        ('7', '-', '-',   '-', '2', '-',   '-', '-', '6'),


        ('-', '6', '-',   '-', '-', '-',   '2', '8', '-'),
        ('-', '-', '-',   '4', '1', '9',   '-', '-', '5'),
        ('-', '-', '-',   '-', '8', '-',   '-', '7', '9')

        the subgrid starts from 0,0
        takes 3 steps in row and 3 steps in column

        row shift -> i / 3 = 0   0   0   1   1   1   2   2   2
        col shift -> i % 3 = 0   1   2   0   1   2   0   1   2

        0,0   0,1   0,2

        1,0   1,1   1,2

        2,0   2,1   2,2


*/
