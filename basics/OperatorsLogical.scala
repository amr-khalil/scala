object OperatorsLogical {
    def main(ags:Array[String]): Unit ={
      var num1 = true
      var num2 = false

      println(!num1)
      println(num1 && num2)
      println(num1 || num2)
      println(!(num1 && num2))
    }
}
