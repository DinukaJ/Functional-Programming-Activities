object fibonacci extends App{
    def getFib(n:Int):Int = n match{
        case 0 => 0
        case 1 => 1 
        case _ => getFib(n-1) + getFib(n-2)
    }

    def printFib(n:Int):Unit = {
        if(n>0) printFib(n-1)
        println(getFib(n))
    }

    printFib(10)
}