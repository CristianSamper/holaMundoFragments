package com.example.holamundofragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment

open class PideNombre : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_saludo, container, false)
        val btn=view.findViewById<Button>(R.id.button)
        val edTxt=view.findViewById<EditText>(R.id.nombre)
        val segundoFragment=Fragmento()
        btn.setOnClickListener{
            val bundle=Bundle()
            bundle.putString("text",edTxt.text.toString())
            segundoFragment.arguments=bundle
            parentFragmentManager.beginTransaction().apply{
                replace(R.id.frameLayout, segundoFragment)
                    .commit()
            }
        }
        return view
    }

}