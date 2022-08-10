object PatternMatching {
  def main(args:Array[String]): Unit ={
    var num = 501;

    num match {
      case 500 => println("500")
      case 1000 => println("1000")
      case 1500 => println("1500")
      case 2000 => println("2000")
      case _ => println("unknown")
    }
  }
}
