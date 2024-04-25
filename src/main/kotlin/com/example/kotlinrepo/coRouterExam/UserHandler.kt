package com.example.kotlinrepo.coRouterExam

import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.bodyValueAndAwait

@Component
class UserHandler {

    suspend fun findAllView(serverRequest: ServerRequest) : ServerResponse {
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValueAndAwait("1234")
    }

    suspend fun findViewById(serverRequest: ServerRequest) : ServerResponse{
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValueAndAwait("1234")
    }

    suspend fun findAll(serverRequest: ServerRequest) : ServerResponse{
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValueAndAwait("1234")
    }

    suspend fun create(serverRequest: ServerRequest) : ServerResponse{
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValueAndAwait("1234")
    }
}