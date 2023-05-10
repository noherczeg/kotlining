package com.example

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RootController {
    @Autowired
    lateinit var helloService: HelloService
    @GetMapping("/")
    fun index(): String {
        return helloService.greet()
    }
}
