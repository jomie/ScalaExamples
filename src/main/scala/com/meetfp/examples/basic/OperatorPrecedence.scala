package com.meetfp.examples.basic

/**
 * Examples of scala tutorials on http://meetfp.com/
 * Created by dengchunni
 */
object OperatorPrecedence extends App {
  println("1 + 2 * 3 = " + (1 + 2 * 3))     //1 + 2 * 3 = 7
  println("(1 + 2) * 3 = " + ((1 + 2) * 3))     //(1 + 2) * 3 = 9

  println("1 + 2 << 1 = " + (1 + 2 << 1))     //1 + 2 << 1 = 6
  println("1 + (2 << 1) = " + (1 + (2 << 1)))     //1 + (2 << 1) = 5

  println("2 == 3 && 1 >= 4 " + (2 == 3 && 1 >= 4))     //2 == 3 && 1 >= 4 false

  var x = 2
  x *= 2 + 3
  println("x = " + x)     //x = 10
}

object OperatorAss extends App {
  def list1 = {println("Evaluate list 1");List(1)}
  def list2 = {println("Evaluate list 2");List(2)}

  val ret1 = list1 ::: list2   //Evaluate list1 first
  println("list1 ::: list = " + ret1)

  val ret2 = list2.:::(list1)  //Evaluate list2 first
  println("list2.:::(list1) = " + ret2 )

  def list3 = {println("Evaluate list 3");List(3)}

  val ret3 = list1 ::: list2 ::: list3
  println("list1 ::: list2 ::: list3 = " + ret3)

}