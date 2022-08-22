fun main(args: Array<String>){
    println("hello")
    val q = Question()
    q.Answer = "244"
//    q.Question = ""

    q.display()
    println("the answer to ${q.Question} is ${q.Answer}")
}

class Question {
    var Answer:String = ""
    val Question:String ="what is the answer to...?"

    fun display(){
        println("you said $Answer")
    }
}
