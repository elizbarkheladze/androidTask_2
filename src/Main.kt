import kotlin.test.assertNotNull


fun main() {
    var firstPoint = Point(x = 5, y = 5
    )
    var secondPoint = Point(x = 5, y = 5
    )
    var thirdPoint = Point(x = 9, y = 10
    )
    //    ******************************************      DAVALEBA 1        **************************************************
//    println(firstPoint.equals(secondPoint))
//    println(firstPoint.equals(thirdPoint))
//    println(firstPoint.distance(thirdPoint))
//    println(firstPoint.toString())
//    firstPoint.setToCenter()
//    println(firstPoint.toString())
//    ******************************************            DAVALEBA 2          ************************************************
    val factory : AircraftFactory = Boeing777.Factory
    val boeing777 = factory.create("Boeing777")
    assertNotNull(boeing777)
//    boeing777.fly()
    //    **********************************************************************************************************
    val factory2 : AircraftFactory = Boeing737.Factory
    val boeing737 = factory.create("Boeing737")
    assertNotNull(boeing737)
//    boeing737.fly()
    //    **********************************************************************************************************
    val carFactory1 : CarFactory = Audi.Factory
    val audi = carFactory1.create("Audi")
    assertNotNull(audi)
//    audi.drive()
    //    **********************************************************************************************************
    val carFactory2 : CarFactory = Audi.Factory
    val maserati = carFactory2.create("Maseratti")
    assertNotNull(audi)
//    audi.drive()
    //    **********************************************************************************************************
}