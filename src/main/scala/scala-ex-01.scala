object Ex01 {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")
    val i = 5
    println(i)
  }
}

class Rational(x: Int, y: Int) {
  def this(x: Int) = this(x, 1)

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  private val g = gcd(x, y)
  def numer = x / g
  def denom = y / g

  def + (r: Rational) =
    new Rational(
      numer * r.denom + r.numer * denom,
      denom * r.denom
    )
}

object Rational {
  def apply(x: Int, y: Int) = new Rational(x, y)
}
