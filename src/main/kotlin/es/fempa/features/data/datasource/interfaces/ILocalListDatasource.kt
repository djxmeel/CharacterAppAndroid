package es.fempa.features.data.datasource.interfaces

import es.fempa.features.data.datasource.dto.CharacterDTO

interface ILocalListDatasource {
    suspend fun getAllCharacters(): List<CharacterDTO>
}