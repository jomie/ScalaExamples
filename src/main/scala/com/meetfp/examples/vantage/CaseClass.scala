package com.meetfp.examples.vantage

/**
 * Examples of scala tutorials on http://meetfp.com/
 * Created by dengchunni
 */
object CaseClass extends App {

  abstract class Dept

  case class Math(dean: String, foundedIn: Int) extends Dept

  case class Phys(dean: String, foundedIn: Int, labs: Int) extends Dept

  case class Chem(dean: String, foundedIn: Int, labs: Int) extends Dept

  val math = Math("Gauss", 1921)
  val phys = Phys("Max", 1934, 13)
  val another = phys.copy(dean = "Albert")

  println(math)
  println(phys)
  println(another.foundedIn)
}

object CaseClassPatternMatch extends App {

  abstract class Action

  case class Complaint(stuffId: Int, about: String) extends Action

  case class Consult(topic: String) extends Action

  case class Purchase(itemId: Int, count: Int) extends Action

  def handle(action: Action) = {
    action match {
      case Complaint(id, about) => println(s"handle complaint: employee $id is complaint about $about")
      case Consult(what) => println(s"handle consult: customer consulted $what")
      case Purchase(id, count) => println(s"customer purchased: itemid = $id, count = $count")
    }
  }

  handle(Consult("payment"))
}
