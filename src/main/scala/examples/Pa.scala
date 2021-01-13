package examples

object Pa extends App {
  args.foreach(arg => println(arg))
  args.foreach((arg: String) => println(arg))
  args.foreach(println)
}
