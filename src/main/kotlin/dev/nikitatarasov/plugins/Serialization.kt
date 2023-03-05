package dev.nikitatarasov.plugins

import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureSerialization() {
    install(ContentNegotiation) {
        json()
    }
    routing {
        get("/json/kotlinx-serialization") {
            call.respond(mapOf("hello" to "world"))
        }

        get("/json/foobar") {
            call.respond(mapOf("foo" to "bar"))
        }

        get("/json/carpet") {
            call.respond(mapOf("car" to "pet"))
        }
    }
}
