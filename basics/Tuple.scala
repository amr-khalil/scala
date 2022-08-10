object Tuple {
  def main(args:Array[String]): Unit ={
    val myTuple = (100,2,3,4,5,6)
    val names = ("Amr", "Khalil", 2022)
    val total = (1,2,3,4,"Amr", "Khalil", 5,6)

    println(total)

    println()
    myTuple.productIterator.foreach(println)

    println()
    println(myTuple._1)
    println(myTuple._4)
  }
}
