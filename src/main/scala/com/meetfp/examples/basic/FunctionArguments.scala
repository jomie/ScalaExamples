package com.meetfp

/**
 * Created by dengchunni on 14-5-30.
 */
object FunctionArguments extends App {
  def addUser(name: String, age: Int, phone: String) = {
    println("User added, name: %s, age: %d, phone number: %s".format(name, age, phone))
  }

  addUser("Tony", 35, "702-201-1234")
  addUser(name = "Tim", phone = "702-201-2345", age = 33)
  addUser("Abby", phone = "702-201-3456", age = 28)
  addUser("Abby",  age = 28, "702-201-3456")
  //addUser("Abby", "702-201-3456", age = 28)
  // above line won't compile
  // Error: parameter 'age' is already specified at parameter position 2
}

object DefaultParameters extends App {
  def log(msg: String, severity: String = "Info", time: Long = System.currentTimeMillis()) {
    println("[%d] <%s> %s".format(time,severity, msg))
  }

  val t = System.currentTimeMillis() + 200
  log("use default parameters")
  log("specify severity", "Warn")
  log("specify time", time = t)
  log("specify both severity and time", "Warn", t)
}

object RepeatedParameters extends App {
  def log(msgs: String*) = {
    println(msgs.getClass.getName)
    println(msgs.mkString(","))
  }

  log()
  log("one","two","three")
  val array = Array("one","two","three")
  //log(array)
  //above line wouldn't compile, type mismatch, expected String
  log(array: _*)
}