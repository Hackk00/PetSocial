package com.example.petsocial

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.WindowInsetsControllerCompat

class MainActivity : AppCompatActivity() {

    private lateinit var btnNotificaciones: ImageView
    private lateinit var sidebar: View

    private lateinit var menuPerfil: View
    private lateinit var menuFotos: View

    private lateinit var iconPerfil: ImageView
    private lateinit var iconFotos: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        setupListeners()

        // 🔥 CARGA INICIAL
        replaceFragment(PerfilFragment())
        setActiveIcon(iconPerfil)
    }

    private fun initViews() {

        btnNotificaciones = findViewById(R.id.btnNotificaciones)

        sidebar = findViewById(R.id.sidebarLayout)

        menuPerfil = sidebar.findViewById(R.id.menuPerfil)
        menuFotos = sidebar.findViewById(R.id.menuFotos)

        iconPerfil = sidebar.findViewById(R.id.iconPerfil)
        iconFotos = sidebar.findViewById(R.id.iconFotos)
    }

    private fun setupListeners() {

        btnNotificaciones.setOnClickListener {
            Toast.makeText(this, "Notificaciones 🔔", Toast.LENGTH_SHORT).show()
        }

        menuPerfil.setOnClickListener {
            replaceFragment(PerfilFragment())
            setActiveIcon(iconPerfil)
        }

        menuFotos.setOnClickListener {
            replaceFragment(FotosFragment())
            setActiveIcon(iconFotos)
        }
    }

    private fun replaceFragment(fragment: androidx.fragment.app.Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.contenedor, fragment)
            .commit()
    }

    private fun resetIcons() {
        val color = getColor(R.color.text_secondary)
        iconPerfil.setColorFilter(color)
        iconFotos.setColorFilter(color)
    }

    private fun setActiveIcon(icon: ImageView) {
        resetIcons()
        icon.setColorFilter(getColor(R.color.primary))
    }
}