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


