package com.example.snackbar.domain

import java.util.*

data class Gastos (var descricao: String, var categoria: String, var data: String, var valor: Double  ){

    override fun toString(): String {
        return "Gastos(descricao='$descricao', categoria='$categoria', data='$data', valor=$valor)"
    }
}

// gastos