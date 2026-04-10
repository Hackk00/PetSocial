package com.example.petsocial

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

class PerfilFragment : Fragment(R.layout.fragment_perfil) {

    private lateinit var btnSeguir: Button
    private lateinit var btnMensaje: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnSeguir = view.findViewById(R.id.btnSeguir)
        btnMensaje = view.findViewById(R.id.btnMensaje)

        btnSeguir.setOnClickListener {
            Toast.makeText(requireContext(), "Ahora sigues a Max 🐶", Toast.LENGTH_SHORT).show()
        }

        btnMensaje.setOnClickListener {
            Toast.makeText(requireContext(), "Abrir chat 💬", Toast.LENGTH_SHORT).show()
        }
    }
}