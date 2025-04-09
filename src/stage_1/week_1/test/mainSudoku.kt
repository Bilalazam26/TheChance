package stage_1.week_1.test

import stage_1.week_1.isValidSudoku


val valid9SudokuTestCase = listOf(
    listOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
    listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
    listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
    listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
    listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
    listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
    listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
    listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
    listOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
)
val emptySudokuTestCase = List(9) { List(9) { '-' } } // Empty Sudoku
val duplicateRow9SudokuTestCase = listOf(
    listOf('3', '4', '1', '-', '5', '-', '-', '4', '-'),
    listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
    listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
    listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
    listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
    listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
    listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
    listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
    listOf('-', '-', '-', '-', '-', '-', '-', '-', '-')
)
val duplicateCol9SudokuTestCase = listOf(
    listOf('7', '-', '-', '-', '-', '-', '-', '-', '-'),
    listOf('4', '-', '-', '-', '-', '-', '-', '-', '-'),
    listOf('2', '-', '-', '-', '-', '-', '-', '-', '-'),
    listOf('8', '-', '-', '-', '-', '-', '-', '-', '-'),
    listOf('4', '-', '-', '-', '-', '-', '-', '-', '-'),
    listOf('7', '-', '-', '-', '-', '-', '-', '-', '-'),
    listOf('5', '-', '-', '-', '-', '-', '-', '-', '-'),
    listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
    listOf('-', '-', '-', '-', '-', '-', '-', '-', '-')
)
val duplicateSubgrid9SudokuTestCase = listOf(
    listOf('5', '3', '5', '-', '-', '-', '-', '-', '-'),
    listOf('6', '-', '-', '-', '-', '-', '-', '-', '-'),
    listOf('-', '7', '-', '-', '-', '-', '-', '-', '-'),
    listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
    listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
    listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
    listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
    listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
    listOf('-', '-', '-', '-', '-', '-', '-', '-', '-')
)
val valid4SudokuTestCase = listOf(
    listOf('1', '2', '3', '4'),
    listOf('3', '4', '1', '2'),
    listOf('2', '1', '4', '3'),
    listOf('4', '3', '2', '1')
)
val invalid4SudokuTestCase = listOf(
    listOf('1', '2', '3', '4'),
    listOf('3', '4', '1', '2'),
    listOf('2', '1', '3', '3'),
    listOf('4', '3', '2', '1')
)
val valid16SudokuTestCase = listOf(
    listOf('1','2','3','4',  '5', '6', '7',  '8',  '9', 'A', 'B', 'C',  'D', 'E', 'F', 'G'),
    listOf('5','6','7','8',  '9', 'A', 'B',  'C',  'D', 'E', 'F', 'G',  '1', '2', '3', '4'),
    listOf('9','A','B','C',  'D', 'E', 'F',  'G',  '1', '2', '3', '4',  '5', '6', '7', '8'),
    listOf('D','E','F','G',  '1', '2', '3',  '4',  '5', '6', '7', '8',  '9', 'A', 'B', 'C'),

    listOf('3','4','1','2',  '7', '8', '5',  '6',  'B', 'C', '9', 'A',  'F', 'G', 'D', 'E'),
    listOf('7','8','5','6',  'B', 'C', '9',  'A',  'F', 'G', 'D', 'E',  '3', '4', '1', '2'),
    listOf('B','C','9','A',  'F', 'G', 'D',  'E',  '3', '4', '1', '2',  '7', '8', '5', '6'),
    listOf('F','G','D','E',  '3', '4', '1',  '2',  '7', '8', '5', '6',  'B', 'C', '9', 'A'),

    listOf('2','1','4','3',  '-', '-', '-',  '-',  '-', '-', '-', '-',  '-', '-', '-', '-'),
    listOf('6','5','8','7',  '-', '-', '-',  '-',  '-', '-', '-', '-',  '-', '-', '-', '-'),
    listOf('A','9','C','B',  '-', '-', '-',  '-',  '-', '-', '-', '-',  '-', '-', '-', '-'),
    listOf('E','D','G','F',  '-', '-', '-',  '-',  '-', '-', '-', '-',  '-', '-', '-', '-'),

    listOf('4','3','2','1',  '-', '-', '-',  '-',  '-', '-', '-', '-',  '-', '-', '-', '-'),
    listOf('8','7','6','5',  '-', '-', '-',  '-',  '-', '-', '-', '-',  '-', '-', '-', '-'),
    listOf('C','B','A','9',  '-', '-', '-',  '-',  '-', '-', '-', '-',  '-', '-', '-', '-'),
    listOf('G','F','E','D',  '-', '-', '-',  '-',  '-', '-', '-', '-',  '-', '-', '-', '-')
)
val inValid16SudokuTestCase = List(16) { row -> List(16) { col -> ((row + col) % 16 + 1).asCodeToChar() } }
val invalidZero = listOf(
    listOf('0', '2', '3', '4'),
    listOf('3', '4', '1', '2'),
    listOf('2', '1', '4', '3'),
    listOf('4', '3', '2', '1')
)


fun main() {


    checkSudoku(
        name = "valid 9 x 9 Sudoku Test Case",
        grid = valid9SudokuTestCase,
        expected = true
    )
    checkSudoku(
        name = "valid 9 x 9 empty Sudoku Test Case",
        grid = emptySudokuTestCase,
        expected = true
    )
    checkSudoku(
        name = "invalid 9 x 9 duplicate in row Sudoku Test Case",
        grid = duplicateRow9SudokuTestCase,
        expected = false
    )
    checkSudoku(
        name = "invalid 9 x 9 duplicate in column Sudoku Test Case",
        grid = duplicateCol9SudokuTestCase,
        expected = false
    )
    checkSudoku(
        name = "invalid 9 x 9 duplicate in subgrid Test Case",
        grid = duplicateSubgrid9SudokuTestCase,
        expected = false
    )
    checkSudoku(
        name = "valid 4 x 4 Sudoku Test Case",
        grid = valid4SudokuTestCase,
        expected = true
    )
    checkSudoku(
        name = "invalid 4 x 4 Sudoku Test Case",
        grid = invalid4SudokuTestCase,
        expected = false
    )
    checkSudoku(
        name = "valid 16 x 16 Sudoku Test Case",
        grid = valid16SudokuTestCase,
        expected = true
    )
    checkSudoku(
        name = "invalid 16 x 16 Sudoku Test Case",
        grid = inValid16SudokuTestCase,
        expected = false
    )
    checkSudoku(
        name = "invalid Zero values Sudoku Test Case",
        grid = invalidZero,
        expected = false
    )


}



fun checkSudoku(name: String, grid: List<List<Char>>, expected: Boolean) {
    println("$name:")
    println(
        if (isValidSudoku(grid) == expected) {
            "passed\n"
        } else {
            "failed\n"
        }
    )
}

fun Int.asCodeToChar(): Char = when {
    this < 10 -> this.digitToChar()
    this in 10..16 -> (this+55).toChar()
    else -> '-'
}