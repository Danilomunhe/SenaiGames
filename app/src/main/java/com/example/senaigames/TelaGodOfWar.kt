package com.example.senaigames

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.concurrent.schedule

class TelaGodOfWar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela3)

        Timer().schedule(2000){abrirMain()}
    }

    private fun abrirMain() {

        val intent = Intent(this, TelaDescricao::class.java)
        startActivity(intent)
        finish()
    }
}