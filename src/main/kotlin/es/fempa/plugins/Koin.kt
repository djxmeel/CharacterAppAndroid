package es.fempa.plugins

import es.fempa.di.appModule
import io.ktor.server.application.*
import org.koin.ktor.plugin.Koin


fun Application.configureKoin() {
    install(Koin) {
        modules(appModule)
    }
}