
class Point  (x: Int = 0, y: Int = 0) {
    private var x = 0
    private var y = 0
    init {
        doX(x)
        doY(y)
    }

    fun doX(x: Int) {
        if (x >= 0) {
            this.x = x
        }
    }
    fun doY(y: Int) {
        if (y >= 0) {
            this.y = y
        }
    }
    //    "მეთოდი, რომელებიც სათავის მიმართ სიმეტრიულად გადაიტანს წერტილს" --- es nawili ver mivxvdi, centrshi ganvatavseb ubralod wertils, sxva ganmartreba ver mivcvdi
    fun setToCenter(){
        x = 0
        y = 0
    }
    fun distance(p2: Point): Double {
        val dx = x - p2.x
        val dy = y - p2.y
        return Math.sqrt((dx * dx + dy * dy).toDouble())
    }
    fun equals(other: Point): Boolean {
        if (other == null) return false
        if (other === this) return true
        val p2 = other
        return x == p2.x && y == p2.y
    }
    override fun toString(): String {
        return "(" + x + "," + y + ")"
    }
}
