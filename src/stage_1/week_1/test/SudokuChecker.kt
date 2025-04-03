package stage_1.week_1.test

import stage_1.week_1.isValidSudoku


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

fun main() {
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
    val checker = SudokuChecker()

    println(checker.validateSudoku(valid9SudokuTestCase, true))
    println(checker.validateSudoku(emptySudokuTestCase, true))
    println(checker.validateSudoku(valid4SudokuTestCase, true))
    println(checker.validateSudoku(valid16SudokuTestCase, true))
    println(checker.validateSudoku(duplicateRow9SudokuTestCase, false))
    println(checker.validateSudoku(duplicateCol9SudokuTestCase, false))
    println(checker.validateSudoku(duplicateSubgrid9SudokuTestCase, false))
    println(checker.validateSudoku(invalid4SudokuTestCase, false))
    println(checker.validateSudoku(inValid16SudokuTestCase, false))
    println(checker.validateSudoku(invalidZero, false))
}


class SudokuChecker {
    fun validateSudoku(grid: List<List<Char>>, expected: Boolean): Boolean {
        return isValidSudoku(grid) == expected
    }
}
fun Int.asCodeToChar(): Char = when {
    this < 10 -> this.digitToChar()
    this in 10..16 -> (this+55).toChar()
    else -> '-'
}