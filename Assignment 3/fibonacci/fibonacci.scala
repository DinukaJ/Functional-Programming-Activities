object fibonacci extends App{
    def getFib(n:Int):Int = n match{
        case 0 => 0
        case 1 => 1 
        case _ => getFib(n-1) + getFib(n-2)
    }

    def printFib(n:Int, m:Int=0):Unit = m match {
        case m if(m==n) =>
        case m => println(getFib(m)); printFib(n,m+1)
    }

    printFib(10)
}