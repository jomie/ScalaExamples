package com.meetfp.examples.vantage

/**
 * Examples of scala tutorials on http://meetfp.com/
 * Created by dengchunni
 */
object Extractor extends App {

  object UrlParas {
    def apply(map: Map[String, String]) = new Paras(map)

    def unapply(s: String): Option[Map[String, String]] = {
      val idx = s.indexOf("?")
      if (idx == -1) {
        None
      }
      else {
        val m = collection.mutable.Map[String, String]()
        s.substring(idx + 1).split('&')
          .foreach(a => {
          val pair = a.split('=')
          if (pair.length == 2) m += ((pair(0), pair(1)))
        })
        if (m.isEmpty) None
        else Some(m.toMap)
      }
    }
  }

  class Paras(map: Map[String, String]) {
    def get(k: String) = map(k)
  }

  def testParas(url: String) = url match {
    case UrlParas(map) => map.foreach(println)
    case _ => println("no parameters")
  }

  val a = "abc".split('d')

  testParas("http://meetfp.com/tryout?lang=scala&code=extractor")
  testParas("http://meetfp.com/")
}
