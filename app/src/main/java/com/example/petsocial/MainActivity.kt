package com.example.petsocial

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.activity.OnBackPressedCallback
import androidx.core.view.GravityCompat

class MainActivity : AppCompatActivity() {

    // Perfil
    private lateinit var btnSeguir: Button
    private lateinit var btnMensaje: Button

    // Header
    private lateinit var btnNotificaciones: ImageView

    // Drawer
    private lateinit var drawerLayout: DrawerLayout

    // Menú lateral
    private lateinit var menuInicio: TextView
    private lateinit var menuFotos: TextView
    private lateinit var menuVideos: TextView
    private lateinit var menuPerfil: TextView
    private lateinit var btnMenu: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        setupListeners()

        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                    drawerLayout.closeDrawer(GravityCompat.START)
                } else {
                    finish()
                }
            }
        })
    }

    private fun initViews() {

        // Drawer
        drawerLayout = findViewById(R.id.drawerLayout)

        // Botones perfil
        btnSeguir = findViewById(R.id.btnSeguir)
        btnMensaje = findViewById(R.id.btnMensaje)

        // Header
        btnNotificaciones = findViewById(R.id.btnNotificaciones)

        // Sidebar menú
        menuInicio = findViewById(R.id.menuInicio)
        menuFotos = findViewById(R.id.menuFotos)
        menuVideos = findViewById(R.id.menuVideos)
        menuPerfil = findViewById(R.id.menuPerfil)
        btnMenu = findViewById(R.id.btnMenu)
        drawerLayout = findViewById(R.id.drawerLayout)
    }

    private fun setupListeners() {

        // Botones perfil
        btnSeguir.setOnClickListener {
            Toast.makeText(this, "Ahora sigues a Max 🐶", Toast.LENGTH_SHORT).show()
        }

        btnMensaje.setOnClickListener {
            Toast.makeText(this, "Abrir chat 💬", Toast.LENGTH_SHORT).show()
        }

        // Header → abre menú lateral
        btnNotificaciones.setOnClickListener {
            drawerLayout.openDrawer(Gravity.LEFT)
        }

        // Menú lateral
        menuInicio.setOnClickListener {
            Toast.makeText(this, "Inicio", Toast.LENGTH_SHORT).show()
            drawerLayout.closeDrawers()
        }

        menuFotos.setOnClickListener {
            Toast.makeText(this, "Fotos", Toast.LENGTH_SHORT).show()
            drawerLayout.closeDrawers()
        }

        menuVideos.setOnClickListener {
            Toast.makeText(this, "Videos", Toast.LENGTH_SHORT).show()
            drawerLayout.closeDrawers()
        }

        menuPerfil.setOnClickListener {
            Toast.makeText(this, "Perfil", Toast.LENGTH_SHORT).show()
            drawerLayout.closeDrawers()
        }

        btnMenu.setOnClickListener {
            drawerLayout.openDrawer(android.view.Gravity.START)
        }
    }
}