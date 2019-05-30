package com.stiger.scala.test01

object test01 {
  def main(args: Array[String]) {
    //println( "Returned Value : " + addInt(5,7) );
    //printlnValue(5);
    //printlnValue(9)
    printlnString()
  }
  def printlnValue(i: Int): Unit = {
    if (i < 7){
      println("5")
    }else{
      println("7")
      println("6")
    }
  }
  def addInt( a:Int, b:Int ) : Int = {
    var sum:Int = 0
    sum = a + b
    return sum
  }

  def printlnString(): Unit= {
    val stringValue: String = "abc"
    //stringValue = "bcs";
    println(stringValue);
  }
}
