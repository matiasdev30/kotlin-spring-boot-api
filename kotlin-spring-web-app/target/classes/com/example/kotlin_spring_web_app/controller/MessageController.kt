package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController() {
    @GetMapping("/getMessage")
    fun index(): String= "service.findMessages()"

    @PostMapping("/createMessage")
    fun post(@RequestBody message: String) : String {
        return message
    }
}