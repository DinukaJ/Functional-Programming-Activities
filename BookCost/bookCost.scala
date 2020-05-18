object bookCost extends App{
    //def findBookCost(bc:Int):Double=(24.95*60)*(1-0.4);
    def findBookCost(bc:Int):Double={
        var x=(24.95*60)*(0.6);
        if(bc>50)
        {
            x=x+(bc-50)*0.75;
        }
        x=x+3;
        x
    }
    var va=findBookCost(60);
    println(f"$va%.2f");
}