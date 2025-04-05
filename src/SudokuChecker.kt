class SudokuChecker {
    fun check(
        userMessage: String,
        actualResult: Boolean,
        expectedResult: Boolean
    ) {
        println("-------------------")
        println("$userMessage: ")
        if (actualResult == expectedResult) {
            println("SUCCESS")
        } else {
            println("FAILED")
        }
        println("-------------------")
    }

}