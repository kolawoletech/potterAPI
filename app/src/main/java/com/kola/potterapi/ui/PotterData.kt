package com.kola.potterapi.ui

class PotterData {
}


data class Characters(
    val results: List<Result>
)

data class Result(
    val characterId: Int,
    val wand: String,
    val house : String,
    val patronus: String,
    val species: String,
    val bloodStatus: Double,
    val role: String,
    val key: String
)