object StringFormatter {
  def main(args: Array[String])= {

    def toUpper(name: String): String = name.toUpperCase

    def toLower(name: String): String = name.toLowerCase

    def formatNames(name: String)(formatFunction: String => String): String = {
      formatFunction(name)
    }

    println(formatNames("Benny")(toUpper))
    println(formatNames("Niroshan")(name => name.substring(0, 2).toUpperCase + name.substring(2).toLowerCase))
    println(formatNames("Saman")(toLower))
    println(formatNames("Kumara")(name => name.substring(0, 1).toUpperCase + name.substring(1, 5).toLowerCase + name.substring(5).toUpperCase))
  }
}
