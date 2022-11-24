package es.fempa.features.domain.repository

import es.fempa.features.domain.model.CharacterDM

interface ICharacterRepository {
    suspend fun getAllCharacters() : List<CharacterDM>
}