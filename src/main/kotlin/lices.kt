fun main() {
    val lices =  11
    val people  = lices % 10
    val person = if (people != 1 || lices == 11) "людям" else "человеку"
    println("Понравилось $lices $person")
}