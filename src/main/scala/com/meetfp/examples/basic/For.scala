package com.meetfp.examples.basic

/**
 * Examples of scala tutorials on http://meetfp.com/
 * Created by dengchunni
 */
object BasicFor extends App {
  val list = List("Tom", "Jach", "Jimmy", "Abby")

  println("---using to--------------")
  for(i <- 0 to list.length - 1 )
    println(list(i))

  println("---using until-----------")
  for(i <- 0 until list.length )
    println(list(i))

  println("---using item directly---")
  for(item <- list ) {
    println(item)
  }
}

object NestedFor extends App {
  for(i <- 0 to 1; j <- 1 to 2; k <- 2 to 3) {
    println("i = %d, j = %d, k = %d".format(i, j, k))
  }
}

object ConditionalFor extends App {
  for{i <- 0 to 5
      if i % 2 == 0
      j <- 1 to 2} {
    println("i = %d, j = %d".format(i, j))
  }
}

object MidStream extends App {
  val list = List("Html", "XML", "JSON", "text", "md")
  for{ ext <- list
       lower = ext.toLowerCase
       if lower != "html"} {
    println("Accepted data format: " + lower)
  }
}

object Generating extends App {
  val result =
    for(i <- 1 to 3; j <- 2 to 4)
    yield {
      i + j
    }
  println(result)
}
