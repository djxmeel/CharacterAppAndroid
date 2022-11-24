package es.fempa.features.domain.service

import es.fempa.features.domain.model.CharacterDM
import es.fempa.features.domain.repository.ICharacterRepository

class CharacterServiceImpl(private val repository : ICharacterRepository) : ICharacterService {
    override suspend fun getAllCharacters(): List<CharacterDM> {
        return repository.getAllCharacters()
    }
}