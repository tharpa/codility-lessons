object Ex02 {
  def main(args: Array[String]): Unit = {
    fib(200)
  }

  def fib(n: Int) = {
    var a = 0
    var b = 1
    while (a <= n) {
      println(a)
      val c = a + b
      a = b
      b = c
    }
  }
}
