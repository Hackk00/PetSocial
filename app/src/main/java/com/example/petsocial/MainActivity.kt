package com.example.petsocial

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Perfil
    private lateinit var btnSeguir: Button
    private lateinit var btnMensaje: Button

    // Header
    private lateinit var btnNotificaciones: ImageView
    private lateinit var btnMenu: ImageView

    // Sidebar (ahora son LinearLayout)
    private lateinit var menuPerfil: LinearLayout
    private lateinit var menuFotos: LinearLayout
    private lateinit var menuVideos: LinearLayout
    private lateinit var menuWeb: LinearLayout
    private lateinit var menuBotones: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        setupListeners()
    }

    private fun initViews() {

        // Botones perfil
        btnSeguir = findViewById(R.id.btnSeguir)
        btnMensaje = findViewById(R.id.btnMensaje)

        // Header
        btnNotificaciones = findViewById(R.id.btnNotificaciones)

        // Sidebar
        menuPerfil = findViewById(R.id.menuPerfil)
        menuFotos = findViewById(R.id.menuFotos)
        menuVideos = findViewById(R.id.menuVideos)
        menuWeb = findViewById(R.id.menuWeb)
//        menuBotones = findViewById(R.id.menuBotones)
    }

    private fun setupListeners() {

        // Botones perfil
        btnSeguir.setOnClickListener {
            Toast.makeText(this, "Ahora sigues a Max 🐶", Toast.LENGTH_SHORT).show()
        }

        btnMensaje.setOnClickListener {
            Toast.makeText(this, "Abrir chat 💬", Toast.LENGTH_SHORT).show()
        }

        // Header
        btnNotificaciones.setOnClickListener {
            Toast.makeText(this, "Notificaciones 🔔", Toast.LENGTH_SHORT).show()
        }

//        btnMenu.setOnClickListener {
//            Toast.makeText(this, "Menú lateral", Toast.LENGTH_SHORT).show()
//        }

        // Sidebar
        menuPerfil.setOnClickListener {
            Toast.makeText(this, "Perfil", Toast.LENGTH_SHORT).show()
        }

        menuFotos.setOnClickListener {
            Toast.makeText(this, "Fotos", Toast.LENGTH_SHORT).show()
        }

        menuVideos.setOnClickListener {
            Toast.makeText(this, "Videos", Toast.LENGTH_SHORT).show()
        }

        menuWeb.setOnClickListener {
            Toast.makeText(this, "Web", Toast.LENGTH_SHORT).show()
        }

//        menuBotones.setOnClickListener {
//            Toast.makeText(this, "Botones", Toast.LENGTH_SHORT).show()
//        }
    }
}