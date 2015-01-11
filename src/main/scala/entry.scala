/**
 * Created by ivanhoe on 09/01/15.
 */

// http://twitter.github.io/effectivescala/
// http://programminghistorian.org/lessons/topic-modeling-and-mallet

object entry {
  def main(args: Array[String]) {

    val filenameToRead = "resources/pg236.txt"
    val contents = scala.io.Source.fromFile(filenameToRead)
    val tokens = contents.mkString.split("\\s+")
    contents.close()


    println(filenameToRead + " contains " + tokens.size.toString() + " words")

    //groupBy each token in tokens, sort by number of instances of a token, and print the result
    val unique = tokens.groupBy(t => t).mapValues(_.size).toArray.sortWith({(a,b) => (a._2 > b._2) } ).map({a => println(a)})

//
    dupa.main()
  }

}

object dupa {
  def main(): Unit = {
    print("dupa is here")
  }
}
