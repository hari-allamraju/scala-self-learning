class Adder{
    private var sum = 0
    
    def +(value:Int) {sum+=value}
    
    def ~():Int = return sum
}

val a = new Adder()
a + 5
println(a~)