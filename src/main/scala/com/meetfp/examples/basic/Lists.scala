package com.meetfp.examples.basic

/**
 * Examples of scala tutorials on http://meetfp.com/
 * Created by dengchunni
 */
object Lists extends App {
  val nums1 = List(1,2,3)
  val strs1 = List("Beijing", "Shanghai", "Guangzhou")
  println(nums1)
  println(strs1)

  val nums2 = 1 :: 2 :: 3 :: Nil
  val strs2 = "Beijing" :: "Shanghai" :: "Guangzhou" :: Nil
  println(nums2)
  println(strs2)

  val nums3 = List.range[Int](1,6,2)  //from 1 to 6, with step 2
  val chars = List.range[Char]('a','c')
  println(nums3)
  println(chars)

  val fill = List.fill(3)("original")
  println(fill)
}

object ListOperation extends App {
  println(Nil.isEmpty) //true

  val nums = List(1, 2, 3, 4, 5)
  println(nums.length) //5
  println(nums.head) //1
  println(nums.tail) //List(2, 3, 4, 5)
  println(nums.last) //5
  println(nums.init) //List(1, 2, 3, 4)
  println(nums.reverse) //List(5, 4, 3, 2, 1)
  println(nums(3)) //4
  println(nums.drop(2)) //List(3, 4, 5)
  println(nums.take(2)) //List(1, 2)
  println(nums.takeWhile(_ % 2 != 0 )) //List(1)
  println(nums.dropWhile(_  % 2 != 0)) ////List(2, 3, 4, 5)
  println(nums.exists(_ == 3)) //true
  println(nums.forall(_ % 2 ==0)) //false
  println(nums.filter(_ % 2 ==0)) //List(2, 4)
  println(nums.mkString("Numbers[", ",", "]")) //Numbers[1,2,3,4,5]
  println(nums.splitAt(3)) //(List(1, 2, 3),List(4, 5))
  println(nums.sortWith((x,y) => x > y))

  val nums2 = List(6,7)
  println(nums ::: nums2) //List(1, 2, 3, 4, 5, 6, 7)
}

object ListBuffer extends App {
  import scala.collection.mutable.ListBuffer

  val buffer = new ListBuffer[Int]
  buffer += 2
  buffer ++= List(3,4)
  buffer.+=:(1) // equals to '1 +=: buffer'
  val list = buffer.toList
  println(list)
}
