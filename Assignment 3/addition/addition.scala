object addition extends App{
    def add(n:Int,s:Int=1):Int= s==n match {
        case true => s
        case false => s+add(n,s+1)
    }

    println(add(5))
}