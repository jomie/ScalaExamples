package com.meetfp.examples.basic

/**
 * Examples of scala tutorials on http://meetfp.com/
 * Created by dengchunni
 */
object Properties extends App {
  class Address {
    val country = "China" //readonly

    private var _city = ""
    def city = _city  //readonly, since no setter defined

    var address = ""  //will have both getter and setter

    //Self-defined getter and setter
    private var _zipCode = ""
    def zipCode = _zipCode
    def zipCode_= (v: String) {
      if (v.length == 6) {
        _zipCode = v
        _city = if(v(0) == '1') "Beijing" else "Shanghai"
      }
      else {
        _zipCode = "000000"
        _city = "Other"
      }
    }
  }


  val addr = new Address
  addr.zipCode = "100128"
  addr.address = "Suite 101"
  println(addr.address)
  println(addr.city)
}

object BeanProperties extends App {
  import scala.beans.BeanProperty

  class Student {
    @BeanProperty
    var name = ""
  }

  val stu = new Student
  stu.name = "Tony"
  println(stu.name)

  stu.setName("Abby")
  println(stu.getName)
}
