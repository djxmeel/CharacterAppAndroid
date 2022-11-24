package es.fempa.features.presentation.mapper

import es.fempa.features.domain.model.CharacterDM
import es.fempa.features.presentation.model.Character

fun CharacterDM.toCharacter() : Character{
    return Character(id, name, lore)
}