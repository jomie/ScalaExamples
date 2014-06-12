package com.meetfp.examples.vantage

/**
 * Examples of scala tutorials on http://meetfp.com/
 * Created by dengchunni
 */

object Fold extends App {
  val nums = Array(1, 2, 3)
  val sum = nums.fold(0)(_ + _)
  val sum1 = (0 /: nums)(_ + _)
  println("sum = " + sum)

  val res = nums.fold("")(_ + _.toString + ",")
  println(res)

  val friends = List("Jimmy", "Sarah", "Tony")
  val hello = friends.foldLeft("Hello, ")(_ + _ + ", ")
  println(hello)
  //lets print out the process
  val hello2 = friends.foldLeft("Hello, ")((result, item) => {
    println(result);
    result + item + ", "
  })
  println(hello2)

  /*def operation(ret: String,item: String) : String  = ret + item + ", "
  def simuFoldLeft(starting: String, list: List[String]): String = {
    list match {
      case Nil => starting
      case x :: Nil => operation(starting, x )
      case x :: tail => simuFoldLeft(operation(starting,x), tail)
    }
  }
  val simu = simuFoldLeft("Hello, ", friends)
  println(simu)

  val like = friends.fold("")((result, friend) => s"${result}I like $friend and $friend likes me. ")
  println(like)
  */
}



object FoldRight extends App {
  val friends = List("Jimmy", "Sarah", "Tony")
  val helloRight = friends.foldRight("hello")(_ + ", " + _)
  println(helloRight)

  //lets print out the process
  val helloRight2 = friends.foldRight("hello")((item, result) => {
    println(result);
    item + ", " + result
  })
  println(helloRight2)

  /*var resultRight = "hello"
  var j = 0
  while(j < friends.length) {
    resultRight = friends(i) + ", " + resultRight
    i += 1
  }
  println(result)*/
}