package goncharuk.kotlin_in_action

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import goncharuk.kotlin_in_action.basics.Basics

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Basics().runTest()
    }
}
