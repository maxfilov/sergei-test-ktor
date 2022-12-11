package com.example.plugins

import com.example.Request
import com.example.Response
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*
import java.util.Stack

private fun solve(input: String): String {
    val s = Stack<Char>()
    for (ch in input){
        when (ch) {
            '#' -> {
                if (!s.isEmpty()) {
                    s.pop()
                }
            }
            else -> s.push(ch)
        }
    }
    return String(s.toCharArray())
}

val x = Response("adsf")
fun Application.configureRouting() {

    routing {
        post("/solve") {
            call.respond(x)
        }
    }
}
