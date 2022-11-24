package es.fempa.features.data.repository

import es.fempa.features.data.datasource.interfaces.ILocalListDatasource
import es.fempa.features.data.datasource.mapper.toCharacterDM
import es.fempa.features.domain.model.CharacterDM
import es.fempa.features.domain.repository.ICharacterRepository

class CharacterRepositoryImpl(val localList : ILocalListDatasource) : ICharacterRepository{
    override suspend fun getAllCharacters(): List<CharacterDM> {
        return localList.getAllCharacters().map{
            it.toCharacterDM()
        }
    }
}