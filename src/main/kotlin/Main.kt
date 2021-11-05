import test.User;

fun main(args: Array<String>) {

    val user1 = User("Ivan" ,29)

    println(user1.name)
    println(user1.age)

    val user2 = User("Abram",33)

    println(user1 === user2)

}