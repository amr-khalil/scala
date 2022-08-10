object IfStatement {
  def main(args:Array[String]): Unit = {

    var salary = 1000;
    if (salary < 1000){
      println("Salary less that " + 1000)
    } else if(salary == 1000){
      println("Salary is equal " + 1000);
    } else {
      println("Salary greater than " + 1000)
    }
  }
}
