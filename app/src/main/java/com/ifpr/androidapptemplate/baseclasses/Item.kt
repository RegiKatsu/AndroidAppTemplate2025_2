package com.ifpr.androidapptemplate.baseclasses

data class Item(
    var endereco: String? = null,
    var franquia: String? = null,
    var modelo: String? = null,
    val base64Image: String? = null,
    val imageUrl: String? = null
)
