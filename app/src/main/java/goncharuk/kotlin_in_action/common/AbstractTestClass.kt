package goncharuk.kotlin_in_action.common

import android.util.Log

abstract class AbstractTestClass(private val logTag: String) {

    fun logging(message: String) {
        Log.d(Constants.Debug.TAG, "$logTag | $message")
    }
}