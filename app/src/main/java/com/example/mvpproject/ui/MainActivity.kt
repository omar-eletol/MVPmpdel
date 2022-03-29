package com.example.mvpproject.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.mvpproject.R
import com.example.mvpproject.pojo.DataModel
import org.w3c.dom.Text

class MainActivity : AppCompatActivity(), View.OnClickListener, ViewModel {

    private lateinit var textView: TextView
    private lateinit var button: Button
    private lateinit var presenter: MoviePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById<TextView>(R.id.text_name)
        button = findViewById<Button>(R.id.get_name)
        presenter = MoviePresenter(this)
        buttonClicked()

    }

    fun buttonClicked() {
        button.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        if (view?.id == R.id.get_name) {
            presenter.getName()
        }
    }

    override fun getMovieName(name: String) {
        textView.text = name
    }


}


