object PatternMatching {
  def main(args: Array[String])= {
    println("Enter an integer: ")
    val num = scala.io.StdIn.readLine().toInt

    val negativeOrZero: () => Unit = () => println("Negative/ Zero is input")
    val evenNumber: () => Unit = () => println("Even number is given")
    val oddNumber: () => Unit = () => println("Odd number is given")

    num match {
      case n if n <= 0 => negativeOrZero()
      case n if n % 2 == 0 => evenNumber()
      case _ => oddNumber()
    }
  }
}
