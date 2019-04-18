package edu.washington.alkwan.activityspy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

private const val TAG = "ActivityState"

class MainActivity : AppCompatActivity() {
    var event = ""
    private val msg: String
            get() = "on$event event fired"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = "Application loaded."
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()

        event = "Create"
        Log.i(TAG, msg)
    }

    public override fun onStart() {
        super.onStart()
        event = "Start"
        Log.i(TAG, msg)
    }

    public override fun onResume() {
        super.onResume()
        event = "Resume"
        Log.i(TAG, msg)
    }

    public override fun onPause() {
        super.onPause()
        event = "Pause"
        Log.i(TAG, msg)
    }

    override fun onStop() {
        super.onStop()
        event = "Stop"
        Log.i(TAG, msg)
    }

    override fun onRestart() {
        super.onRestart()
        event = "Restart"
        Log.i(TAG, msg)
    }

    override fun onDestroy() {
        val errorMsg = "We're going down, Captain!"
        Log.e(TAG, errorMsg)
        super.onDestroy()
    }
}
