package com.meetfp.examples.basic

/**
 * Examples of scala tutorials on http://meetfp.com/
 * Created by dengchunni
 */
object Exceptions extends App {
  import java.io._
  import java.lang.SecurityException

  try {
    val file = new File("myfile")
    val stream = new FileInputStream(file)
    // use the stream
  }
  catch {
    case ex: FileNotFoundException => println("File not found")
    case ex: SecurityException => println("You don't have read access to the file")
    case _: Throwable => println("Other exception happened")
  }
}
