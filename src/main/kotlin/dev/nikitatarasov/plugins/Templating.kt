package dev.nikitatarasov.plugins

import io.ktor.server.html.*
import kotlinx.html.*
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureTemplating() {

    routing {
        get("/html-dsl") {
            call.respondHtml {

                body {
                    h1 { +"HTML" }
                    ul {
                        for (n in 1..10) {
                            li { +"$n" }
                        }
                    }
                }
            }
        }
        get("/html-dsl/hi") {
            call.respondHtml {

                body {
                    h1 { +"Hello" }
                }
            }
        }
        get("/html-dsl/kenobi") {
            call.respondHtml {

                body {
                    h1 { +"Hello there, General Kenobi" }
                }
            }
        }
        get("/html-dsl/_") {
            call.respondHtml {

                body {
                    h1 {
                        for (n in 1..100) {
                            +"_"
                        }
                    }
                }
            }
        }
    }
}
