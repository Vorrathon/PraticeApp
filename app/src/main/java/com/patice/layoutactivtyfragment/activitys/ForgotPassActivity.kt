package com.patice.layoutactivtyfragment.activitys
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.patice.layoutactivtyfragment.R

class ForgotPassActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_pass)

        val btnReturnLogin = findViewById<Button>(R.id.btnReturnLogin)

        btnReturnLogin.setOnClickListener {
            finish()
        }
    }
}