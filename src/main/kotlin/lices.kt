fun main() {
    val lices =  101
    val people  = lices % 10
    val eleven = lices % 100
    val person = if (people != 1 || eleven == 11) "людям" else "человеку"
    println("Понравилось $lices $person")
}