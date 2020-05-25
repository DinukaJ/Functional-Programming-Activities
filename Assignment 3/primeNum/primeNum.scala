object primeNum extends App{
    def prime(a:Int,n:Int=2,count:Int=0):Boolean = n match {
        case x if(count>=1) => false
        case x if(x==a) => true
        case x if(a%n==0) => prime(a,n+1,count+1)
        case x => prime(a,n+1,count);
    }

    println(prime(5));
    println(prime(8));
}