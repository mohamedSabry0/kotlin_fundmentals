import com.rsk.Person

fun main(args: Array<String>){
    println("hello, world")

    var kevin = Person("kevin")

    println("Name is ${kevin.Name}")

    kevin.Name = "test"

    println("Name is ${kevin.Name}")

    kevin.displayWithLambda(::printName)
    kevin.display()
}

fun printName(name: String) {
    println(name)
}
