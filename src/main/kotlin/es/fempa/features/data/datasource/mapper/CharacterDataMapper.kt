package es.fempa.features.data.datasource.mapper

import es.fempa.features.data.datasource.dto.CharacterDTO
import es.fempa.features.domain.model.CharacterDM

fun CharacterDTO.toCharacterDM() : CharacterDM {
    return CharacterDM(id, name, lore)
}