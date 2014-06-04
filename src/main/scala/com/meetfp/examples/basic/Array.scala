package com.meetfp

/**
 * Examples of scala tutorials on http://meetfp.com/
 * Created by dengchunni
 */
object ArrayEx extends App {
  //generic
  def printArray[T](arr: Array[T]) {
    println(arr.mkString("Array(", ",", ")"))
  }

  val nums = new Array[Int](3)
  for(i <- 0 until nums.length) nums(i) = i
  printArray(nums)  //Array(0,1,2)

  val nums1 = Array(1,2,3)
  printArray(nums1) //Array(1,2,3)

  val nums2 = nums1.map( _ * 2)
  printArray(nums2) //Array(2,4,6)

  val nums3 = nums1.filter(_ % 2 == 0)
  printArray(nums3) //Array(2)

  val nums4 = for(n <- nums1 if n % 2 != 0) yield n * 2
  printArray(nums4) //Array(2,6)

  println(nums4.sum) //8

  val strs = Array("Beijing", "New York", "London")
  val strs1 = strs.reverse
  printArray( strs1)  //Array(London,New York,Beijing)
}

object ArrayBufferEx extends App {
  import scala.collection.mutable.ArrayBuffer

  val buffer = ArrayBuffer(1)
  println(buffer)

  buffer += 2
  println(buffer)

  buffer += (3,4,5)
  println(buffer)

  buffer.prepend(0)
  println(buffer)

  buffer.trimEnd(2)
  println(buffer)

  buffer ++= Array(7,8)
  println(buffer)

  buffer.insert(4,4,5,6)
  println(buffer)

  val a = buffer.toArray
  println(a.getClass.getSimpleName)
}