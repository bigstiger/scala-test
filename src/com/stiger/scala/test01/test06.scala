package com.stiger.scala.test01

import java.util.Date

/**
  * 偏应用函数:
  * 使用偏应用函数优化以上方法，绑定第一个 date 参数，
  * 第二个参数使用下划线(_)替换缺失的参数列表，并把这个新的函数值的索引的赋给变量
  */
object test06 {
  def main(args: Array[String]) {
    val date = new Date
    val logWithDateBound = log(date, _ : String)

    logWithDateBound("message1" )
    Thread.sleep(1000)
    logWithDateBound("message2" )
    Thread.sleep(1000)
    logWithDateBound("message3" )
  }

  def log(date: Date, message: String)  = {
    println(date + "----" + message)
  }

}
