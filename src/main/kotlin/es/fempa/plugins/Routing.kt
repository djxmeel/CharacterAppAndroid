package es.fempa.plugins

import es.fempa.features.domain.service.ICharacterService
import es.fempa.features.presentation.getAllCharacters
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.http.content.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*
import org.koin.ktor.ext.inject

fun Application.configureRouting() {
    val characterService : ICharacterService by inject()

    routing {
        getAllCharacters(characterService)
        // Static plugin. Try to access `/static/index.html`
        static("/static") {
            resources("static")
        }
    }
}
