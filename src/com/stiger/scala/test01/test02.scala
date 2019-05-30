package com.stiger.scala.test01

object test02 {
  def main(args: Array[String]): Unit = {
    delayed(time());
  }

  def time() = {
    println("获取时间，单位为纳秒")
    System.nanoTime()
  }
  def delayed(t: => Long) = {
    println("在 delayed 方法内")
    println("参数： " + t)
    t
  }

}
