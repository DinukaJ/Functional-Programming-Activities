object evenAddition extends App{
    def isEven(n:Int):Boolean = if(n%2==0) true else false

    def getEvenAddition(n:Int, m:Int=1):Int = m match {
        case m if(m==n) => 0
        case m if(isEven(m)) => m+getEvenAddition(n,m+1)
        case m => getEvenAddition(n,m+1)
    }

    println(getEvenAddition(10))
}