package es.fempa.features.presentation

import es.fempa.features.domain.service.ICharacterService
import es.fempa.features.presentation.util.PresentationConsts.GET_ALL_CHARACTERS
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.getAllCharacters(characterService : ICharacterService){
    get(GET_ALL_CHARACTERS) {
        characterService.getAllCharacters().also { characterList ->
            if(characterList.isEmpty()){
                call.respond(status = HttpStatusCode.OK, message = emptyList<Unit>())
                return@get
            }

            call.respond(status = HttpStatusCode.OK, message = characterList)
        }
    }
}