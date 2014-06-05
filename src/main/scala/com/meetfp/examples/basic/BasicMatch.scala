package com.meetfp.examples.basic

/**
 * Examples of scala tutorials on http://meetfp.com/
 * Created by dengchunni
 */
object BasicMatch extends App {
  def score(grade: Char) = {
    grade match {
      case 'A' => println("85~100")
      case 'B' => println("70~84")
      case 'C' => println("60~69")
      case 'D' => println("45~60")
      case 'E' => println("<45")
      case _ => println("Input error")
    }
  }

  def passed_?(grade: Char) = {
    grade match {
      case 'A' | 'B' | 'C' => true
      case _ => false
    }
  }

  score('B')

  if(passed_?('B')) println("Congrats!")
  else println("Uh~ oh, we are sorry...")
}
