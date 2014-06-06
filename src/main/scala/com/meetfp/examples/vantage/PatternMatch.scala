package com.meetfp.examples.vantage

/**
 * Examples of scala tutorials on http://meetfp.com/
 * Created by dengchunni
 */
object PatternMatchColl extends App {
  def startWith1(array: Array[Int]) {
    array match {
      case Array(1, _, _) => println("yes, and length is 3")
      case Array(1, _*) => println("yes, other length")
      case _ => println("no")
    }
  }

  val arr1 = Array(1, 2, 3)
  startWith1(arr1)
  //yes, and length is 3
  val arr2 = Array(1, 2)
  startWith1(arr2)
  //yes, other length
  val arr3 = Array(2, 3, 4)
  startWith1(arr3) //no
}

object PatternMatchList extends App {
  @scala.annotation.tailrec
  def printHead(list: List[Int]) {
    list match {
      case head :: Nil => println(head)
      case head :: tail => println(head); printHead(tail)
    }
  }

  printHead(List(2, 3, 4))
}

object PatternMatchTuple extends App {
  def printVotes(tuple: Any) {
    tuple match {
      case (name: String, votes: Int) => println(s"$name: $votes votes")
      case _ => println("invalid votes")
    }
  }

  printVotes(("Tony", 32))
  printVotes((20, "Tim"))
}

object PatternMatchGuard extends App {
  def grade(score: Any) {
    score match {
      case i: Int if i > 90 => println("A")
      case i: Int if i < 90 && i > 80 => println("B")
      case i: Int => println("C")
      case _ => println("Unknown")
    }
  }

  List(95, 70, "E").foreach(grade)
}
