package com.example.firstapp.model

class Produto(val produto_id: Int = 0, val nome: String="", val quantidade: Int = 0, val preco: Double = 0.0) {
    override fun toString(): String {
        return "Produto(product_id=$produto_id, nome='$nome', quantidade=$quantidade, preco=$preco)"
    }
}