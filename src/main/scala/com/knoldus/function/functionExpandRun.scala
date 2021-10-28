package com.knoldus.function

object FunctionExpandRun{

  def main (args: Array[String] ): Unit = {

    val a = new FunctionExpand
    println(a.add.apply(10,20))
    println(a.sumOfList.apply(List(1,2,3,4)))
    println(a.higherOrderFunction(num => num, 5))

  }

}
