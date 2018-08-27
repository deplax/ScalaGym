// https://github.com/fpinscala/fpinscala

object Fibonacci {

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

  def main(args: Array[String]) = {
    /* 0 1 1 2 3 5 8 13 */
    print(fib(8))
  }
}
