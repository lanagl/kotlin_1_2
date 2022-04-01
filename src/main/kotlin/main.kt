fun main() {
    val likes = 112
    val likes2 = 11
    val likes3 = 12
    val likes4 = 1
    val likes5 = 125
    val likes6 = 25
    val likes7 = 3
    val likes8 = 1123
    val likes9 = 1121

    println("Понравилось $likes ${calculatePeople(likes)}")
    println("Понравилось $likes2 ${calculatePeople(likes2)}")
    println("Понравилось $likes3 ${calculatePeople(likes3)}")
    println("Понравилось $likes4 ${calculatePeople(likes4)}")
    println("Понравилось $likes5 ${calculatePeople(likes5)}")
    println("Понравилось $likes6 ${calculatePeople(likes6)}")
    println("Понравилось $likes7 ${calculatePeople(likes7)}")
    println("Понравилось $likes8 ${calculatePeople(likes8)}")
    println("Понравилось $likes9 ${calculatePeople(likes9)}")


}


fun divideTen(
    number: Int
): Int {
    return if (number > 100) divideTen(number % 10) else number % 10
}

fun calculatePeople(number: Int): String {

    val peopleSome = "человеку"
    val peopleMany = "людям"

    return if (divideTen(number) == 1 && (number < 11 || number > 20)) peopleSome else peopleMany
}
