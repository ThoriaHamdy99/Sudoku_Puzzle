//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    handleSudokuCases(SudokuTestCases.getSuccessCases(), true)
    handleSudokuCases(SudokuTestCases.getFailureCases(), false)
}

private fun handleSudokuCases(sudokuItems: List<SudokuTestCases>, expectedResult: Boolean) {
    for (sudokuItem in sudokuItems) {
        SudokuChecker().check(
            sudokuItem.userMessage,
            SudokuValidator().isValidSudoku(sudokuItem.value),
            expectedResult
        )
    }
}