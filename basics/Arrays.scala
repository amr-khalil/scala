object Arrays {
  def main(args:Array[String]): Unit ={
    var myArray = Array(1,2,3,4,5,6,7,8)
    for (x <- myArray){
      println(x)
    }


    println()
    var mySecond = new Array[String](3)
    mySecond(0) = "Amr"
    mySecond(1) = "Khalil"
    mySecond(2) = "Scala"

    for (x <- mySecond){
      println(x)
    }

    println()
    println(mySecond(0))
  }
}
