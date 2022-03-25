interface Car {
    fun drive();
}

class Audi : Car {
    companion object Factory : CarFactory() {
        fun create() = Audi()
    }
    override fun drive() {
        println("Drive Audi!")
    }
}

class Maserati : Car {
    companion object Factory : CarFactory() {
        fun create() = Maserati()
    }
    override fun drive() {
        println("Drive Maserati!")
    }
}

abstract class CarFactory {
    fun create(type: String): Car? {
        return when (type) {
            "Audi" -> Audi()
            "Maserati" -> Maserati()
            else -> null
        }
    }
}
