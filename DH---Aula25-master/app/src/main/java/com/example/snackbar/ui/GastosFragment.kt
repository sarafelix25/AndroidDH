package com.example.snackbar.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.core.content.getSystemService
import com.example.snackbar.R
import kotlinx.android.synthetic.main.fragment_gasto.*
import kotlinx.android.synthetic.main.fragment_gasto.view.*

class GastosFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val view = inflater.inflate(R.layout.fragment_gasto, container, false)


        view.btn_cadastrar.setOnClickListener{
            val desc = view.ed_descricao.text.toString()
            val cat = view.ed_categoria.text.toString()
            val data = view.ed_data.text.toString()
            val valor = view.ed_valor.text.toString()

        }

        return view
    }

    companion object{
        fun newInstance() = GastosFragment()
    }








}