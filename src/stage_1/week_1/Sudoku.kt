package stage_1.week_1

import kotlin.math.sqrt

//sudoku grid possible representations:
//1. list of strings and each string represents a row
//2. 2d Array (list of lists) -> used

//drawbacks of the first representation:
//in 16 * 16 grid the needs to numbers that exceeds one digit comes out
//This make it hard to split the string (row) into solo cells

// solution :
// represent 10 -> 16 as capital A -> G

/*
* Test case scenarios:
* 1. valid
* 2. duplicate in row
* 3. duplicate in column
* 4. duplicate in a subgrid
*/

fun isValidSudoku(grid: List<List<Char>>): Boolean {
    val size = grid.size
    val subgridSize = sqrt(size.toDouble()).toInt()

    return (
            //validate rows
            //grid.all(::isValidGroup) &&
            grid.all {row -> isValidGroup(row) } &&
                    //validate columns
            (0..<size).all { column -> isValidGroup(grid.map { it[column] }) } &&
                    //validate sub-grids
            (0..<size step subgridSize).all { row ->
                (0..<size step subgridSize).all { column ->
                    /*
                    starting sub-grids:
                    (0,0) (0,3) (0,6)
                    (3,0) (3,3) (3,6)
                    (6,0) (6,3) (6,6)
                    */
                    isValidGroup(extractSubgrid(grid, row, column, subgridSize))
                }
            })
}

// Helper function to check validation of specific groups (rows, columns, sub-grids)
private fun isValidGroup(group: List<Char>): Boolean {
    //check for duplicates
    return if (isDuplicateInGroup(group)){
        false
    } else {
        //check for zeros
        return !group.contains('0')
    }
}

private fun isDuplicateInGroup(group: List<Char>): Boolean =
    group.filter { it != '-' }.let { groupWithoutEmptyCells ->
        groupWithoutEmptyCells.size != groupWithoutEmptyCells.toSet().size
    }
/*ist -> [1,2,3,4,4] size = 5
set  -> [1,2,3,4]   size = 4
*/

// Extracts values from a subgrid
private fun extractSubgrid(grid: List<List<Char>>, row: Int, column: Int, subgridSize: Int) =
    List(subgridSize * subgridSize) { index ->
        val rowShift = index / subgridSize
        val colShift = index % subgridSize
        grid[row + rowShift][column + colShift]
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
