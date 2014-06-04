package com.meetfp.examples.basic

/**
 * Examples of scala tutorials on http://meetfp.com/
 * Created by dengchunni
 */
object Break extends App {
  import scala.util.control.Breaks._

  val list = List("functions.md", "menu.json", "index.html", "data.xml")

  var found = false
  breakable {
    for(item <- list) {
      if(item.endsWith("html")) {
        found = true
        break
      }
    }
  }

  if(found)
    println("There is at least one html file in the list")
  else
    println("There is no html file in the list")

}

object AvoidingBreak extends App {
  val list = List("functions.md", "menu.json", "index.html", "data.xml")

  def hasHtml(input: List[String]): Boolean = {
    input match {
      case Nil => false
      case x :: sub => {
        if(x.endsWith("html")) return true
        else hasHtml(sub)
      }
    }
  }

  if(hasHtml(list)) println("There is at least one html file in the list")
  else println("There is no html file in the list")
}
