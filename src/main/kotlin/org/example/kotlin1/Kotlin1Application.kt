package org.example.kotlin1

import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Kotlin1Application

fun main() {
	println("Enter your city…")
	val city = readLine()
	println("User lives in $city")
}
