object String {
  def main(args:Array[String]): Unit ={
    var name = "Amr"

    name += " Khalil"
    println("My name is: " + name)

    var name1 = "Elon"
    var name2 = "Musk"
    var name3 = "Elon"
    var name4 = "Elona"

    println(name1 == name2)
    println(name1 == name3)

    println(name1.equals(name3))

    println(name1.compareTo(name4))

    println(name1.concat(name2))

    println(name1.substring(1,3))

    println(s"My name is $name1 $name2")
    println(f"My name is $name1 $name2")


  }
}


