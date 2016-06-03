//val is a Java final, var is a normal varibale
val msg="Hello!"
val msg1:String = "Hello"
var msg2="hell0!"
msg2 = "Hello"

println(msg)
println(msg1)
println(msg2)

//one line function
def greet()=println("Greetings")

greet()

//proper definition - return type is not always needed and can be inferred if function 
//is not recursive
def max(x:Int,y:Int):Int={
    if(x>y) x
    else y
}

println(max(1,2))
println(max(-1,-2))

//args are strings - and will throw an index out of bounds exception when missing
//println((args(0),args(1)))

//a more safer way to access args
var i = 0
  while (i < args.length) {
    println(args(i))
    i += 1
}

//even better - argument passed to for each is a function
//in this case its an anonymous function
args.foreach(arg => println(arg))

//these do the same thing
args.foreach((arg: String) => println(arg))
args.foreach(println)

//or the old fashioned way
for (arg <- args)
    println(arg)
