object evenOdd extends App{
    def isEven(n:Int) :Boolean = n match {
        case 0 => true
        case _ => isOdd(n-1)
    }

    def isOdd(n:Int):Boolean = !(isEven(n))

    if(isEven(3))
        println("Even")
    else
        println("Odd")
}