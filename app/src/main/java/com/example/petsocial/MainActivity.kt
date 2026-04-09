package com.example.petsocial

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var btnSeguir: Button
    private lateinit var btnMensaje: Button
    private lateinit var btnNotificaciones: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        setupListeners()
    }

    private fun initViews() {
        // Botones del perfil
        btnSeguir = findViewById(R.id.btnSeguir)
        btnMensaje = findViewById(R.id.btnMensaje)

        // Botón del header (include)
        btnNotificaciones = findViewById(R.id.btnNotificaciones)
    }

    private fun setupListeners() {

        btnSeguir.setOnClickListener {
            Toast.makeText(this, "Ahora sigues a Max 🐶", Toast.LENGTH_SHORT).show()
        }

        btnMensaje.setOnClickListener {
            Toast.makeText(this, "Abrir chat 💬", Toast.LENGTH_SHORT).show()
        }

        btnNotificaciones.setOnClickListener {
            Toast.makeText(this, "Abrir notificaciones 🔔", Toast.LENGTH_SHORT).show()
        }
    }
}