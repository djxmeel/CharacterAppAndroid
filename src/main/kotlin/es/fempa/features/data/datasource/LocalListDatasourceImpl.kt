package es.fempa.features.data.datasource

import es.fempa.features.data.CharacterList
import es.fempa.features.data.datasource.dto.CharacterDTO
import es.fempa.features.data.datasource.interfaces.ILocalListDatasource

class LocalListDatasourceImpl(private  val localList : CharacterList): ILocalListDatasource {

    override suspend fun getAllCharacters() : List<CharacterDTO>{
        return localList.listOfCharacters
    }

}