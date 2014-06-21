package com.meetfp.examples.basic

/**
 * Examples of scala tutorials on http://meetfp.com/
 * Created by dengchunni
 */
package object packages {
  val pi = 3.14159

  type Order = Order.Value
  object Order extends Enumeration {
    val Asc = Value(1)
    val Desc = Value(-1)
  }

  def printLog(msg: String) = {
    println("Main thread:" + msg)
  }
}
