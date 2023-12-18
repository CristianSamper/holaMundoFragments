package com.example.holamundofragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

open class Fragmento : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view= inflater.inflate(R.layout.fragment_hola, container, false)
        val txtView=view.findViewById<TextView>(R.id.holaUsuario)
        val data=arguments
        txtView.text="Hola "+data?.getString("text")
        return view
    }

}