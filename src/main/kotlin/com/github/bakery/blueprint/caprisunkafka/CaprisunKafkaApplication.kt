package com.github.bakery.blueprint.caprisunkafka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CaprisunKafkaApplication

fun main(args: Array<String>) {
    runApplication<CaprisunKafkaApplication>(*args)
}
