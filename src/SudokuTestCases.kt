enum class SudokuTestCases(
    val value: Array<Array<Char>>,
    val userMessage: String
) {
    /** Success Sudoku 16*16 */
    SUCCESS_TEST_CASE_1(
        value = arrayOf(
            arrayOf('1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G'),
            arrayOf('5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', '1', '2', '3', '4'),
            arrayOf('9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', '1', '2', '3', '4', '5', '6', '7', '8'),
            arrayOf('D', 'E', 'F', 'G', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C'),

            arrayOf('2', '1', '4', '3', '6', '5', '8', '7', 'A', '9', 'C', 'B', 'E', 'D', 'G', 'F'),
            arrayOf('6', '5', '8', '7', 'A', '9', 'C', 'B', 'E', 'D', 'G', 'F', '2', '1', '4', '3'),
            arrayOf('A', '9', 'C', 'B', 'E', 'D', 'G', 'F', '2', '1', '4', '3', '6', '5', '8', '7'),
            arrayOf('E', 'D', 'G', 'F', '2', '1', '4', '3', '6', '5', '8', '7', 'A', '9', 'C', 'B'),

            arrayOf('3', '4', '1', '2', '7', '8', '5', '6', 'B', 'C', '9', 'A', 'F', 'G', 'D', 'E'),
            arrayOf('7', '8', '5', '6', 'B', 'C', '9', 'A', 'F', 'G', 'D', 'E', '3', '4', '1', '2'),
            arrayOf('B', 'C', '9', 'A', 'F', 'G', 'D', 'E', '3', '4', '1', '2', '7', '8', '5', '6'),
            arrayOf('F', 'G', 'D', 'E', '3', '4', '1', '2', '7', '8', '5', '6', 'B', 'C', '9', 'A'),

            arrayOf('4', '3', '2', '1', '8', '7', '6', '5', 'C', 'B', 'A', '9', 'G', 'F', 'E', 'D'),
            arrayOf('8', '7', '6', '5', 'C', 'B', 'A', '9', 'G', 'F', 'E', 'D', '4', '3', '2', '1'),
            arrayOf('C', 'B', 'A', '9', 'G', 'F', 'E', 'D', '4', '3', '2', '1', '8', '7', '6', '5'),
            arrayOf('G', 'F', 'E', 'D', '4', '3', '2', '1', '8', '7', '6', '5', 'C', 'B', 'A', '9')
        ),
        userMessage = "Success Sudoku 16*16"
    ),

    /** Success Sudoku 9*9 */
    SUCCESS_TEST_CASE_2(
        value = arrayOf(
            arrayOf('5', '-', '4', '-', '-', '-', '9', '-', '2'),
            arrayOf('6', '7', '-', '1', '-', '5', '3', '4', '8'),
            arrayOf('1', '-', '8', '-', '4', '-', '-', '-', '-'),

            arrayOf('-', '5', '9', '7', '-', '1', '4', '-', '3'),
            arrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
            arrayOf('-', '1', '-', '9', '2', '-', '8', '5', '-'),

            arrayOf('9', '-', '-', '-', '3', '7', '2', '8', '4'),
            arrayOf('-', '-', '7', '-', '1', '-', '-', '3', '-'),
            arrayOf('3', '4', '5', '2', '-', '6', '1', '7', '-')
        ),
        userMessage = "Success Sudoku 9*9"
    ),

    /** Success Sudoku 4*4 */
    SUCCESS_TEST_CASE_3(
        value = arrayOf(
            arrayOf('1', '-', '4', '-'),
            arrayOf('3', '4', '-', '1'),
            arrayOf('4', '-', '2', '-'),
            arrayOf('-', '2', '1', '3')
        ),
        userMessage = "Success Sudoku 4*4"
    ),

    /** Success Sudoku 9*9 empty one
     *
     * */

    SUCCESS_TEST_CASE_4(
        value = arrayOf(
            arrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
            arrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
            arrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),

            arrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
            arrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
            arrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),

            arrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
            arrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
            arrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-')
        ),
        userMessage = "Success Sudoku 9*9 empty one"
    ),

    /** Failure Sudoku 9*9 duplicate number in row */
    FAIL_TEST_CASE_1(
        value = arrayOf(
            arrayOf('5', '-', '4', '4', '-', '-', '9', '-', '2'),
            arrayOf('6', '7', '-', '1', '-', '5', '3', '4', '8'),
            arrayOf('1', '-', '8', '-', '4', '-', '-', '-', '-'),

            arrayOf('-', '5', '9', '7', '-', '1', '4', '-', '3'),
            arrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
            arrayOf('-', '1', '-', '9', '2', '-', '8', '5', '-'),

            arrayOf('9', '-', '-', '-', '3', '7', '2', '8', '4'),
            arrayOf('-', '-', '7', '-', '1', '-', '-', '3', '-'),
            arrayOf('3', '4', '5', '2', '-', '6', '1', '7', '-')
        ),
        userMessage = "Failure Sudoku 9*9 duplicate number in row"
    ),

    /** Failure Sudoku 9*9 duplicate number in column */
    FAIL_TEST_CASE_2(
        value = arrayOf(
            arrayOf('5', '-', '4', '-', '-', '-', '9', '-', '2'),
            arrayOf('6', '7', '-', '1', '-', '5', '3', '4', '8'),
            arrayOf('1', '-', '8', '-', '4', '-', '-', '-', '-'),

            arrayOf('-', '5', '9', '7', '-', '1', '4', '-', '3'),
            arrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
            arrayOf('-', '1', '-', '9', '2', '-', '8', '5', '-'),

            arrayOf('6', '-', '-', '-', '3', '7', '2', '8', '4'),
            arrayOf('-', '-', '7', '-', '1', '-', '-', '3', '-'),
            arrayOf('3', '4', '5', '2', '-', '6', '1', '7', '-')
        ),
        userMessage = "Failure Sudoku 9*9 duplicate number in column"
    ),

    /** Failure Sudoku 9*9 duplicate number in sub */
    FAIL_TEST_CASE_3(
        value = arrayOf(
            arrayOf('6', '-', '4', '-', '-', '-', '9', '-', '2'),
            arrayOf('-', '6', '-', '1', '-', '5', '3', '4', '8'),
            arrayOf('1', '-', '8', '-', '4', '-', '-', '2', '-'),

            arrayOf('-', '5', '9', '7', '-', '1', '4', '-', '3'),
            arrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
            arrayOf('-', '1', '-', '9', '2', '-', '8', '5', '-'),

            arrayOf('9', '-', '-', '-', '3', '7', '2', '8', '4'),
            arrayOf('-', '-', '7', '-', '1', '-', '-', '3', '-'),
            arrayOf('3', '4', '5', '2', '-', '6', '1', '7', '-')
        ),
        userMessage = "Failure Sudoku 9*9 duplicate number in sub"
    ),

    /** Failure Sudoku 9*3 row size not equal column size */
    FAIL_TEST_CASE_4(
        value = arrayOf(
            arrayOf('5', '-', '4'),
            arrayOf('6', '7', '-'),
            arrayOf('1', '-', '8'),

            arrayOf('-', '5', '9'),
            arrayOf('4', '-', '-'),
            arrayOf('-', '1', '-'),

            arrayOf('9', '-', '-'),
            arrayOf('-', '-', '7'),
            arrayOf('3', '4', '5')
        ),
        userMessage = "Failure Sudoku 9*3 row size not equal column size"
    ),

    /** Failure Sudoku 9*9 with characters  */
    FAIL_TEST_CASE_5(
        value = arrayOf(
            arrayOf('5', '-', '4', '-', 'A', '-', '9', '-', '2'),
            arrayOf('6', '7', '-', '1', '-', '5', '3', '4', '8'),
            arrayOf('1', '-', '8', '-', '4', '-', '-', '-', '-'),

            arrayOf('-', '5', '9', '7', '-', '1', '4', '-', '3'),
            arrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
            arrayOf('-', '1', '-', '9', '2', '-', '8', '5', '-'),

            arrayOf('9', '-', '-', '-', '3', '7', '2', '8', '4'),
            arrayOf('-', '-', '7', '-', '1', '-', '-', '3', '-'),
            arrayOf('3', '4', '5', '2', '-', '6', '1', '7', '-')
        ),
        userMessage = "Failure Sudoku 9*9 with characters"
    ),

    /** Failure Sudoku 7*7 can not be sudoku as there is no sub  */
    FAIL_TEST_CASE_6(
        value = arrayOf(
            arrayOf('5', '-', '4', '-', '_', '-', '_'),
            arrayOf('6', '7', '-', '1', '-', '5', '3'),
            arrayOf('1', '-', '_', '-', '4', '-', '-'),

            arrayOf('-', '5', '_', '7', '-', '1', '4'),
            arrayOf('4', '-', '-', '_', '-', '3', '-'),
            arrayOf('-', '1', '-', '_', '2', '-', '_'),
            arrayOf('_', '-', '-', '-', '3', '7', '2')
        ),
        userMessage = "Failure Sudoku 7*7 can not be sudoku as there is no sub"
    ),

    /** Failure Sudoku empty */
    FAIL_TEST_CASE_7(
        value = arrayOf(arrayOf(), arrayOf()),
        userMessage = "Failure Sudoku empty"
    ),

    /** Failure Sudoku 9*9 with missing element  */
    FAIL_TEST_CASE_8(
        value = arrayOf(
            arrayOf('5', '-', '4', '-', '_', '-', '9', '-'),
            arrayOf('6', '7', '-', '1', '-', '5', '3', '4', '8'),
            arrayOf('1', '-', '8', '-', '4', '-', '-', '-', '-'),

            arrayOf('-', '5', '9', '7', '-', '1', '4', '-', '3'),
            arrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
            arrayOf('-', '1', '-', '9', '2', '-', '8', '5', '-'),

            arrayOf('9', '-', '-', '-', '3', '7', '2', '8', '4'),
            arrayOf('-', '-', '7', '-', '1', '-', '-', '3', '-'),
            arrayOf('3', '4', '5', '2', '-', '6', '1', '7', '-')
        ),
        userMessage = "Failure Sudoku 9*9 with missing element"
    ),

    /** Failure Sudoku 9*9 with number not between 1 and 9*/
    FAIL_TEST_CASE_9(
        value = arrayOf(
            arrayOf('5', '-', '4', '-', '_', '-', '9', '-','0'),
            arrayOf('6', '7', '-', '1', '-', '5', '3', '4', '8'),
            arrayOf('1', '-', '8', '-', '4', '-', '-', '-', '-'),

            arrayOf('-', '5', '9', '7', '-', '1', '4', '-', '3'),
            arrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
            arrayOf('-', '1', '-', '9', '2', '-', '8', '5', '-'),

            arrayOf('9', '-', '-', '-', '3', '7', '2', '8', '4'),
            arrayOf('-', '-', '7', '-', '1', '-', '-', '3', '-'),
            arrayOf('3', '4', '5', '2', '-', '6', '1', '7', '-')
        ),
        userMessage = "Failure Sudoku 9*9 with number not between 1 and 9"
    );

    ;

    companion object {
        fun getSuccessCases(): List<SudokuTestCases> {
            val successItems: MutableList<SudokuTestCases> = mutableListOf()
            for (item in entries) {
                if (item.name.contains("SUCCESS", true)) {
                    successItems.add(item)
                }
            }
            return successItems.toList()
        }

        fun getFailureCases(): List<SudokuTestCases> {
            val failureItems: MutableList<SudokuTestCases> = mutableListOf()
            for (item in entries) {
                if (item.name.contains("FAIL", true)) {
                    failureItems.add(item)
                }
            }
            return failureItems.toList()
        }
    }
}



