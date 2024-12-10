package com.example.firstboot

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

data class Message(
    val massage : String
)

@RestController
class GreetingController {
    @GetMapping("/hello")
    fun hello():Message = Message("Hello World!")
}