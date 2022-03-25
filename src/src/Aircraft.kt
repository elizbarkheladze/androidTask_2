import kotlin.test.DefaultAsserter.assertEquals
import kotlin.test.DefaultAsserter.assertNotNull
import kotlin.test.assertNotNull

interface Aircraft {
    fun fly()
}

class Boeing737 : Aircraft {
    companion object Factory : AircraftFactory() {
        fun create() = Boeing737()
    }
    override fun fly() {
        println("Fly Boeing737!")
    }
}

class Boeing777 : Aircraft {
    companion object Factory : AircraftFactory(){
        fun create() = Boeing777()
    }
    override fun fly() {
        println("Fly Boeing777!")
    }
}

abstract class AircraftFactory {
     fun create(type: String): Aircraft? {
        return when (type) {
            "Boeing737" -> Boeing737()
            "Boeing777" -> Boeing777()
            else -> null
        }
    }

}