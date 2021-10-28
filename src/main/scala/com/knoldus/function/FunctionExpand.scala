package com.knoldus.function

class FunctionExpand {

  val add: Function2[Int,Int,Int] = new Function2[Int, Int, Int] {
    override def apply(num: Int, num1: Int): Int = num + num1
  }

  val sumOfList: Function1[List[Int],Int]= new Function1[List[Int], Int]{
    override def apply(List1: List[Int]): Int = List1.sum
  }

  def higherOrderFunction(f:Int => Int, num : Int) : Int = {
    def apply(num: Int):Int = f(num)
    apply(num)
  }

}