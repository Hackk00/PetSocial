package com.example.petsocial

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment

class FotosFragment : Fragment(R.layout.fragment_fotos){

    private lateinit var fabAgregar: com.google.android.material.floatingactionbutton.FloatingActionButton

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fabAgregar = view.findViewById(R.id.fabAgregar)

        fabAgregar.setOnClickListener {
            Toast.makeText(requireContext(), "Agregar foto 📸", Toast.LENGTH_SHORT).show()
        }
    }
}