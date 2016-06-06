//since classes cannot have static methods, we can have companion
//objects which can have static methods


//the class
class Adder{
    private var sum = 0
    
    def add(value:Int):Unit = sum+=value
    
    def getSum():Int = return sum
}

//the object

//app trait
object Adder extends App{
        val a = new Adder()
        a.add(1)
        a.add(2)
        a.add(3)
        println(a.getSum())
}

//main method - could be any method actually - see next example
object Adder1{
    def main(args:Array[String]):Unit={
        val a = new Adder()
        a.add(1)
        a.add(2)
        a.add(3)
        println(a.getSum())
    }
}

//methods that are not main
object Adder2{
    def test():Unit={
        val a = new Adder()
        a.add(1)
        a.add(2)
        a.add(3)
        println(a.getSum())
    }
}

//works if you run this like a script
Adder2.test()