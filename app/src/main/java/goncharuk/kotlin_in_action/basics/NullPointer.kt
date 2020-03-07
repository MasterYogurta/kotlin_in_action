package goncharuk.kotlin_in_action.basics

import goncharuk.kotlin_in_action.common.AbstractTestClass

class NullPointer : AbstractTestClass("NullPointer") {

    fun runTest() {
        method()
    }

    private fun method() {
        val string: String? = null
        string?.toCharArray()
        string ?: return
        string.toCharArray()
    }
}