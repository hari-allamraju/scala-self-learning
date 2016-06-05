//similar to Java
class Sum{
    var sum = 0
}


//s is a val - final
val s = new Sum()
//but the variable in S is not a val so can be assigned
s.sum=5
println(s.sum)

//this will fail
//s = new Sum()

//if we want to protect the variables we make them val or make them
//private var
class Sum1{
    private var sum = 0
}

val s1 = new Sum1()

//this will fail if we try to run
//s1.sum = 5

class Sum2{
    private var sum = 0
    
    //def add(b:Int):Unit = sum+=b
    //def add(b:Int){sum+=b}
    def add(b:Int):Unit={
        //b is  val here
        sum+=b
    }
    
    def getSum():Int={
        return sum
    }
}

