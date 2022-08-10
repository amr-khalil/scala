object LoopFor {
  def main(args:Array[String]): Unit ={
    for(x <- 1 to 5){
      println(x)
    }
    println()
    for (x <- 1 until 5){
      println(x)
    }

    println()
    for (x <- 1 until 5 if x%2==0){
      println(x)
    }

    println()
    var myList: List[Int] = List(1, 2, 3, 4, 5)
    for (x <- myList){
      println(x)
    }

    println()
    myList.foreach(println)

    println()
    myList.foreach(
      (e:Int)=>println("element " + e)
    )

    println()
    myList

    println()
    println(myList.sum)

  }
}
