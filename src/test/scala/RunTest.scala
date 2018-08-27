object RunTest {
  def abs(n: Int): Int =
    if (n < 0) -n
    else n

  def fib(n: Int) = {
    @annotation.tailrec
    def go(first: Int, second: Int, count: Int): Int = {
      if (count < 0)
        first
      else
        go(second, first + second, count - 1)
    }

    if (n == 1) {
      0
    } else if (n == 2) {
      1
    } else {
      go(0, 1, n - 2)
    }
  }

  def factorial(n: Int): Int = {
    @annotation.tailrec
    def go(n: Int, acc: Int): Int = {
      if (n <= 0) acc
      else go(n - 1, n * acc)
    }

    go(n, 1)
  }


  private def formatResult(name: String, n: Int, f: Int => Int) = {
    val msg = "The %s of %d is %d."
    msg.format(name, n, f(n))
  }

  def main(args: Array[String]): Unit = {
    println(formatResult("absolute value", -42, abs))
    println(formatResult("fibonacci", 7, fib))
    println(formatResult("factorial", 7, factorial))
  }
}
