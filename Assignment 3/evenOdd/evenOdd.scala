object evenOdd extends App{
    def isEven(n:Int):Boolean = if(n%2==0) true else false

    def evenOddCheck(n:Int, m:Int=1):Unit ={
        if(m==n) 
            return
        else
        {
            if(isEven(m)) println("Even "+m) else println("Odd "+m)

            evenOddCheck(n,m+1)
        }
    }

    evenOddCheck(10);
}