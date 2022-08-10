object Functions {

 def showName(): Unit ={
   println("Amr Khalil")
 }

  def showNumbers(): Int ={
    var x = 1
    var y = 10
    x+y
  }

  def showNumbers(x:Int, y:Int): Int ={
    x+y
  }
  
  def main(args:Array[String]): Unit ={
    showName()
    println(showNumbers()  + 1)
    println(showNumbers(2,4)  + 1)
  }
}
