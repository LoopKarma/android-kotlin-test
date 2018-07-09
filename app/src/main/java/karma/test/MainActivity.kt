package karma.test

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val refreshButton = findViewById<Button>(R.id.refreshButton)
        val resetButton = findViewById<Button>(R.id.resetButton)

        val textView = findViewById<TextView>(R.id.textView)

        refreshButton.setOnClickListener(createRefreshButtonOnClickListener(textView))
        resetButton.setOnClickListener(createResetButtonOnClickListener(textView, textView.text))
    }

    private fun createRefreshButtonOnClickListener(textView: TextView): View.OnClickListener {
        return View.OnClickListener {
            textView.text = java.util.UUID.randomUUID().toString()
        }
    }

    private fun createResetButtonOnClickListener(textView: TextView, text: CharSequence): View.OnClickListener {
        return View.OnClickListener {
            textView.text = text
        }
    }
}
