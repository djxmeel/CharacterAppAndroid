package es.fempa.features.data

import es.fempa.features.data.datasource.dto.CharacterDTO

object CharacterList {
    val listOfCharacters = listOf(
        CharacterDTO(1,"Character1", "Lore1"),
        CharacterDTO(2,"Character2", "Lore2"),
        CharacterDTO(3,"Character3", "Lore3"),
        CharacterDTO(4,"Character4", "Lore4")
    )
}