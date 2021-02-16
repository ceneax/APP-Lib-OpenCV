package ceneax.app.opencv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import org.opencv.android.OpenCVLoader

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, OpenCVLoader.initDebug().toString(), Toast.LENGTH_SHORT).show()
    }

}