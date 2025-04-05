import kotlin.math.sqrt

class SudokuValidator {
    fun isValidSudoku(sudoku: Array<Array<Char>>?): Boolean {
        val sudokuPuzzle: Array<Array<Char>> = sudoku ?: return false
        if (!isValidSize(sudokuPuzzle)) return false
        if (!isValidCell(sudokuPuzzle)) return false
        if (!isValidRow(sudokuPuzzle)) return false
        if (!isValidColumn(sudokuPuzzle)) return false
        if (!isValidSub(sudokuPuzzle)) return false
        return true
    }

    private fun isValidSub(sudokuPuzzle: Array<Array<Char>>): Boolean {
        val subSet = mutableSetOf<Char>()
        val sudokuSize = sudokuPuzzle.size - 1
        val subSize = sqrt(sudokuPuzzle.size + 0.0).toInt()
        val startRow = 0
        val startCol = 0
        subSet.clear()
        for (row in 0..sudokuSize) {
            for (column in 0..sudokuSize) {
                subSet.clear()
                for (i in startRow..<startRow + subSize) {
                    for (j in startCol..<startCol + subSize) {
                        val item = sudokuPuzzle[i][j]
                        if (item != '-') {
                            val isAlreadyExist = subSet.add(item)
                            if (!isAlreadyExist) return false
                        }
                    }
                }
            }
        }
        return true
    }

    private fun isValidColumn(sudokuPuzzle: Array<Array<Char>>): Boolean {
        val columnSet = mutableSetOf<Char>()
        val sudokuSize = sudokuPuzzle.size - 1
        for (columnIndex in 0..sudokuSize) {
            columnSet.clear()
            for (rowIndex in 0..sudokuSize) {
                val item = sudokuPuzzle[rowIndex][columnIndex]
                if (item != '-') {
                    val isAlreadyExist = columnSet.add(item)
                    if (!isAlreadyExist) return false
                }
            }
        }
        return true
    }

    private fun isValidRow(sudokuPuzzle: Array<Array<Char>>): Boolean {
        val rowSet = mutableSetOf<Char>()
        for (row in sudokuPuzzle) {
            rowSet.clear()
            for (columnCell in row) {
                if (columnCell != '-') {
                    val isAlreadyExist = rowSet.add(columnCell)
                    if (!isAlreadyExist) return false
                }
            }
        }
        return true
    }

    private fun isValidCell(sudokuPuzzle: Array<Array<Char>>): Boolean {
        for (row in sudokuPuzzle) {
            for (columnCell in row) {
                if (columnCell.isDigit()  && columnCell.code >= 49 && columnCell.code <= 57) continue
                if (columnCell == '-') continue
                if (sudokuPuzzle.size <= 9) return false
                if (sudokuPuzzle.size == 16 && columnCell.code >= 65 && columnCell.code <= 71) continue
                if (sudokuPuzzle.size == 25 && columnCell.code >= 65 && columnCell.code <= 80) continue
                return false
            }
        }
        return true
    }

    private fun isValidSize(sudoku: Array<Array<Char>>): Boolean {
        if (sudoku.isEmpty()) return false
        val sudokuSize = sudoku.size
        val sizeSquareRoot = sqrt(sudokuSize + 0.0)
        if ((sizeSquareRoot * sizeSquareRoot) != (sudokuSize + 0.0)) return false
        for (row in sudoku) {
            if (row.size != sudokuSize) return false
        }
        return true
    }
}