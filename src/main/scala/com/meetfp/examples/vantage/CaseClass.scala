package com.meetfp.examples.vantage

/**
 * Examples of scala tutorials on http://meetfp.com/
 * Created by dengchunni
 */
object CaseClass extends App {
  abstract class Action
  case class Complaint(empId: Int, about: String) extends Action
  case class Consult(topic: String) extends Action
  case class Purchase(itemId: Int, count: Int) extends Action


  val a1 = Complaint(11, "not have been polite ")
  val a2 = Consult("shipping")
  val a3 = a1.copy(empId = 12)

  println(a1)
  println(a2)
  println(a3.about)
}

object CaseClassPatternMatch extends App {
  abstract class Action
  case class Complaint(stuffId: Int, about: String) extends Action
  case class Consult(topic: String) extends Action
  case class Purchase(itemId: Int, count: Int) extends Action

  def handle(action : Action) = {
    action match {
      case Complaint(id, about) => println(s"handle complaint: employee $id is complaint about $about")
      case Consult(what) => println(s"handle consult: customer consulted $what")
      case Purchase(id, count) => println(s"customer purchased: itemid = $id, count = $count")
    }
  }

  handle(Consult("payment"))
}
