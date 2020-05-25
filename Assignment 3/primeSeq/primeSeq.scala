object primeSeq extends App{
    def prime(a:Int,n:Int=2,count:Int=0):Boolean = n match {
        case x if(count>=1) => false
        case x if(x==a) => true
        case x if(a%n==0) => prime(a,n+1,count+1)
        case x => prime(a,n+1,count);
    }

    def primeSeq(n:Int,a:Int=2): Unit = a match{
        case a if(a==n) => return
        case a if(prime(a)) => println(a); primeSeq(n,a+1)
        case _ => primeSeq(n,a+1)
    }

    primeSeq(10)
}