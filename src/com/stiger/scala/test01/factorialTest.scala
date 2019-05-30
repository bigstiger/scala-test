package com.stiger.scala.test01

/**
  * 阶乘
  */
object factorialTest {
  def main(args: Array[String]){
    for (i <- 1 to 10)
      println(i + "的阶乘为: =" + factorial(i) )
  }

  def factorial(n: BigInt): BigInt = {
    if (n <= 1)
      1
    else
      n * factorial(n - 1)
  }
}
