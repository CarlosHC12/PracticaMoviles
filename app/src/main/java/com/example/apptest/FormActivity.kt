package com.example.apptest

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.apptest.databinding.ActivityFormBinding

class FormActivity : AppCompatActivity() {

    companion object {
        const val error_obligatorio = "CAMPO OBLIGATORIO"
    }
    private lateinit var binding: ActivityFormBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityFormBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.btnGuardar.setOnClickListener { guardar() }
        binding.btnCancelar.setOnClickListener { finish() }
    }

    private fun guardar() {
        val modelo = binding.edModelo.text.toString().trim()
        val escala = binding.edEscala.text.toString().trim()

        if (modelo.isEmpty()) {
            binding.edModelo.error = error_obligatorio
            binding.edEscala.requestFocus()
            return
        }
        if (escala.isEmpty()) {
            binding.edModelo.error =  error_obligatorio
            binding.edEscala.requestFocus()
            return
        }
        val grado = binding.spinnerGrado.selectedItem.toString()
        /*val formato = when (binding.grupoFormato.checkedRadioButtonId) {
            R.id.radio_electronico -> getString(R.string.electronico)
            R.id.radio_audiolibro -> getString(R.string.audiolibro)
            else -> getString(R.string.papel)*/

    }
    val leido = binding.checkLeido.isChecked


}
