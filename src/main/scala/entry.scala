import scala.collection.immutable.HashMap

/**
 * Created by ivanhoe on 09/01/15.
 */
object entry {
  def main(args: Array[String]) {
    val fileToRead = "resources/pg236.txt"
    val source = scala.io.Source.fromFile(fileToRead)
    val tokens = source.mkString.split("\\s+")
    source.close()
//    println(lines.count("\n"))
    //    println(lines)

    println(fileToRead + " contains " + tokens.size.toString() + " words")

    var unique:HashMap[String,Int] = new HashMap()


    for (x <- tokens ) {
      val y = unique.get(x).getOrElse(0)
      unique += x -> (y + 1)

    }
    println("and has " + unique.keys.size.toString() + " unique words")

    val sortedArray = unique.toArray.sortWith( {(e1,e2) => (e1._2 > e2._2) } )

    for (x <- sortedArray) {
      println(x)
    }
  }
}
