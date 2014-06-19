package com.meetfp.examples.vantage

/**
 * Examples of scala tutorials on http://meetfp.com/
 * Created by dengchunni
 */

object SInterpolator extends App {
  val name = "Tony"
  val age = 32
  val sayHi = s"Hi, my name is $name, and I am $age years old"
  val sayHiFormat = "Hi, my name is %s, and I am %d years old".format(name, age)
  println(sayHi) //Hi, my name is Tony, and I am 32 years old
  println(sayHiFormat) //Hi, my name is Tony, and I am 32 years old
}

object FInterpolator extends App {
  val count = 6
  val price = 4.25
  val totalStr = f" Unit Price: $price%5.2f\n      Count: $count%5d\nTotal Price: ${price * count}%5.2f"
  val totalFormat = " Unit Price: %5.2f\n      Count: %5d\nTotal Price: %5.2f"
     .format(price, count, price * count)
  println(totalStr)
  println(totalFormat)
}

object RawInterpolator extends App {
  val name = "Abby"
  val escaped = s"$name wants two literal chars \n here"
  val noEscap1 = s"$name wants two literal chars \\n here"
  val noEscap2 = """%s wants two literal chars \n here""".format(name)
  val noEscap3 = raw"$name wants two literal chars \n here"

  println(escaped)
  println(noEscap1)
  println(noEscap2)
  println(noEscap3)
}
