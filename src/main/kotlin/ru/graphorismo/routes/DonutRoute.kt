package ru.graphorismo.routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import ru.graphorismo.model.Donut

// For browser test
//private const val BASE_URL = "http://localhost:8100"
// For android emulator
private const val BASE_URL = "http://10.0.2.2:8100"

private val donuts =
    listOf(
        Donut("Blueberry", "Delicious blueberry donut",
            "$BASE_URL/donuts/donut1.JPEG"),
        Donut("Cinnamon", "Crispy donut with cinnamon",
            "$BASE_URL/donuts/donut2.JPEG"),
        Donut("Strawberry", "Juicy donut with strawberry filling",
            "$BASE_URL/donuts/donut3.JPEG" ),
        Donut("Coconut", "Deep-fried donut with abundant coconut sprinkles",
            "$BASE_URL/donuts/donut4.JPEG" ),
        Donut("Sugar", "Regular donat with classic sugar topping",
            "$BASE_URL/donuts/donut5.JPEG" ),
        Donut("Chocolate", "Excellent chocolate donat",
            "$BASE_URL/donuts/donut6.JPEG" )
    )

fun Route.randomDonut(){
    get("/randomdonut"){
        call.respond(
            HttpStatusCode.OK,
            donuts.random()
        )

    }
}