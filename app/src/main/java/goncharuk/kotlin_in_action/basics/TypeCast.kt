package goncharuk.kotlin_in_action.basics

import goncharuk.kotlin_in_action.common.AbstractTestClass

class TypeCast : AbstractTestClass("TypeCast") {

    fun runTest() {
        receiveIntButAny(createAnyButString())
        receiveIntButAny(createAnyButInteger())

        receiveStringButAny(createAnyButString())
        receiveStringButAny(createAnyButInteger())

        receiveWhateverBuyAny(createAnyButString())
        receiveWhateverBuyAny(createAnyButInteger())
    }

    private fun receiveIntButAny(input: Any) {
        (input as? Int)?.apply {
            val integer = this + 69
            logging("integer : $integer")
        }
    }

    private fun receiveStringButAny(input: Any) {
        (input as? String)?.apply {
            val string = this + "omegalul"
            logging("string : $string")
        }
    }

    private fun receiveWhateverBuyAny(input: Any) {
        when (input) {
            is String -> logging("input is String : $input")
            is Int -> logging("input is Int : $input")
        }
    }

    private fun createAnyButString(): Any = "kekw"
    private fun createAnyButInteger(): Any = 228
}