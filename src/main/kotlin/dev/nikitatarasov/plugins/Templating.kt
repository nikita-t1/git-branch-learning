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
                    h1 { +"Nice... <script>alert('hi')</script>" }
                    h1 { +"Nice2... <script>alert('hi')</script>" }
                    h1 { +"Nice3... <script>alert('hi')</script>" }
                    h1 { +"Nice4... <script>alert('hi')</script>" }
                    h1 { +"HTML" }
                    ul {
                        for (n in 1..10) {
                            li { +"$n" }
                        }
                    }
                }
            }
        }
    }
}
