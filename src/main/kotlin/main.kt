fun main() {
    val likes = 112

    val peopleSome = "человеку"
    val peopleMany = "людям"

    val people = if (likes % 10 == 1 && (likes < 11 || likes > 20)) peopleSome else peopleMany

    println("Понравилось $likes $people")

}