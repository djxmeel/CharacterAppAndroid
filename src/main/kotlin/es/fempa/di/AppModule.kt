package es.fempa.di

import es.fempa.features.data.CharacterList
import es.fempa.features.data.datasource.LocalListDatasourceImpl
import es.fempa.features.data.datasource.interfaces.ILocalListDatasource
import es.fempa.features.data.repository.CharacterRepositoryImpl
import es.fempa.features.domain.repository.ICharacterRepository
import es.fempa.features.domain.service.CharacterServiceImpl
import es.fempa.features.domain.service.ICharacterService
import org.koin.dsl.module

val appModule = module {
    single<CharacterList>{
        CharacterList
    }

    single<ILocalListDatasource>{
        LocalListDatasourceImpl(get())
    }

    single<ICharacterRepository> {
        CharacterRepositoryImpl(get())
    }

    single<ICharacterService> {
        CharacterServiceImpl(get())
    }
}