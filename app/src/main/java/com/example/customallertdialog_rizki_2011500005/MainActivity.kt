package com.example.customallertdialog_rizki_2011500005

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AlertDialog


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnKenalan= findViewById<Button>(R.id.btnKenalan)
        btnKenalan.setOnClickListener{
            val infLateView=layoutInflater.inflate(R.layout.layout_alert,null)
            val etNama=infLateView.findViewById<EditText>(R.id.etNama)
            val alb =AlertDialog.Builder(this@MainActivity)
            with(alb){

                setTitle("Mau Kenalan?")
                setIcon(R.drawable.logo_babar)
                setView(infLateView)
                setCancelable(false)
                setPositiveButton("Selesai"){_,_->
                    val nama = if ("${etNama.text}".isNotEmpty())"${etNama.text}" else "orang asing"
                    Toast.makeText(this@MainActivity, "Salam Kenal, $nama!", Toast.LENGTH_SHORT).show()
                }
                setNegativeButton("Siapa Lu?"){_,_->
                    Toast.makeText(this@MainActivity,"Sombong amat sih",Toast.LENGTH_SHORT).show()
                }

                setNeutralButton("Maaf ,cuma numpang lewat", null)
                create().show()

            }
        }

    }
}