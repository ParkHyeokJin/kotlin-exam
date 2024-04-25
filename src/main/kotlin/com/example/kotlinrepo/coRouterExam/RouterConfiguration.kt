package com.example.kotlinrepo.coRouterExam

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.http.MediaType.TEXT_HTML
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.coRouter

@Configuration
class RouterConfiguration {
    @Bean
    fun mainRouter(userHandler: UserHandler) : RouterFunction<ServerResponse> {
        return coRouter {
            accept(TEXT_HTML).nest {
                (GET("/user/") or GET("/users/")).invoke(userHandler::findAllView)
                GET("/users/{login}", userHandler::findViewById)
            }
            accept(APPLICATION_JSON).nest {
                (GET("/api/user/") or GET("/api/users/")).invoke(userHandler::findAll)
                POST("/api/users/", userHandler::create)
            }
        }
    }
}