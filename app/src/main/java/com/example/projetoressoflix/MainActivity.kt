package com.example.projetoressoflix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.projetoressoflix.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        bind.btentrada.setOnClickListener {
            if (bind.loginentrada.text.toString() == "admin" && Integer.parseInt(
                    bind.senhaentrada.text.toString()) == 123)

                bind.btentrada.setOnClickListener {
                    var tela = Intent(this, homeresso::class.java)
                    startActivity(tela)

                }else{
                android.widget.Toast.makeText(applicationContext, "Email e Senha ivalido", Toast.LENGTH_LONG).show()
                bind.loginentrada.text.clear()
                bind.senhaentrada.text.clear()
                bind.loginentrada.requestFocus()
                bind.senhaentrada.requestFocus()
            }

        }
    }
}



