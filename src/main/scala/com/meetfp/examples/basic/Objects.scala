package com.meetfp.examples.basic

/**
 * Examples of scala tutorials on http://meetfp.com/
 * Created by dengchunni
 */
object Standalone extends App {
  import scala.collection.mutable.ListBuffer

  object Logger {
    private val list = new ListBuffer[String]()
    println("list is created")

    def log(msg: String) {
      list += msg
    }

    def flush() {
      list.foreach(println)
    }
  }

  println("Process started.")
  Logger.log("The first call") //This is when Logger got created
  Logger.log("The second call")
  Logger.log("The third call")
  println("Let's print out what the logger gets")
  Logger.flush()

}

object Companion extends App {
  object Connection {
    private val connString = "localhost"

    //Better do lazy init in real project
    private val items = Array(new Connection("C1"),new Connection("C2"))

    def get(): Connection = {
      for (c <- items) {
        if (c.isFree) {   //accessed private member isFree
          println("Dispatch " + c.name)
          return c
        }
      }

      //Should handle this properly, not this rude way
      println("Force release and dispatch C1")
      items(0).release()
      items(0)
    }
  }

  class Connection private(val name: String)  {
    private var isFree = true

    def connect() {
      //accessed private member connString
      println(name + " connected to " + Connection.connString)
      isFree = false
    }

    def release() {
      isFree = true
    }
  }

  val conn1 = Connection.get()
  conn1.connect()

  val conn2 = Connection.get()
  conn2.connect()

  val conn3 = Connection.get()
  conn3.connect()

}
