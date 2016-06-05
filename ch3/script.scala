//In Scala, you can instantiate objects, or class instances, using new. When you instantiate an //object in Scala, you can parameterize it with values and types. Parameterization means //"configuring" an instance when you create it. You parameterize an instance with values by passing //objects to a constructor in parentheses. For example, the following Scala code instantiates a new //java.math.BigInteger and parameterizes it with the value "12345":

val big = new java.math.BigInteger("12345")

//You parameterize an instance with types by specifying one or more types in square brackets

val greetings = new Array[String](3)
//or if you are in the mood
//val greetStrings: Array[String] = new Array[String](3)

//although the array itself is a val - final - you can assign to the elements
greetings(0) = "Hello"
greetings(1) = ","
greetings(2) = "World!"

for(i<- 0 to 2)
 println(greetings(i))

 //below code is same as the one above
val greetStrings = new Array[String](3)

greetStrings.update(0, "Hello")
greetStrings.update(1, ", ")
greetStrings.update(2, "world!\n")

for (i <- 0.to(2))
 print(greetStrings.apply(i))

 //another way
val numNames = Array("zero", "one", "two")
numNames.foreach(println)

//lists
//scala lists are immutable
val oneTwo = List(1, 2)
val threeFour = List(3, 4)
val oneTwoThreeFour = oneTwo ::: threeFour
println(""+ oneTwo +" and "+ threeFour +" were not mutated.")
println("Thus, "+ oneTwoThreeFour +" is a new list.")

//::: list concatenation operator
//:: is the cons operator - means to add at the start of the list and return the new list
val twoThree = List(2, 3)
val oneTwoThree = 1 :: twoThree
println(oneTwoThree)

//same result as above
val oneTwoThree1 = 1 :: 2 :: 3 :: Nil
println(oneTwoThree1)

//tuples
val pair = (99, "Luftballons")
//if you have N elements in the tuple then you can go all the way to _N
println(pair._1)
println(pair._2)

//sets and maps - we have both mutable and immutable in 
//scala.collection.mutable and scala.collection.immutable
//default is immutbale

var jetSet = Set("Boeing", "Airbus")
jetSet += "Lear"
println(jetSet.contains("Cessna"))

//mutable - explicit
import scala.collection.mutable.Set
  
    val movieSet = Set("Hitch", "Poltergeist")
    movieSet += "Shrek"
    println(movieSet) 

//read lines from a file
import scala.io.Source
  
    if (args.length > 0) {
  
      for (line <- Source.fromFile(args(0)).getLines)
        println(line.length +" "+ line)
    }
    else
      Console.err.println("Please enter filename")
//read lines and do some formatting too

import scala.io.Source
  
    def widthOfLength(s: String) = s.length.toString.length
  
    if (args.length > 0) {
  
      val lines = Source.fromFile(args(0)).getLines.toList
  
      val longestLine = lines.reduceLeft(
        (a, b) => if (a.length > b.length) a else b 
      ) 
      val maxWidth = widthOfLength(longestLine)
  
      for (line <- lines) {
        val numSpaces = maxWidth - widthOfLength(line)
        val padding = " " * numSpaces
        println(padding + line.length +" | "+ line)
      }
    }
    else
      Console.err.println("Please enter filename")

