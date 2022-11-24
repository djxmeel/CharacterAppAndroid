package es.fempa.features.domain.service

import es.fempa.features.domain.model.CharacterDM

interface ICharacterService {
    suspend fun  getAllCharacters() : List<CharacterDM>
}