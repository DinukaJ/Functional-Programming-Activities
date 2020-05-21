object bookCost extends App{
    def booksFullAmount(bCount:Integer):Double=bCount*24.95;
    def discount(price:Double):Double=price*0.4;
    def shipping(bCount:Integer):Double={
        var shipping:Double=3;
        if(bCount>50)
        {
            shipping=shipping+(bCount-50)*0.75;
        }
        shipping;
    }

    printf("%.2f",booksFullAmount(60)-discount(booksFullAmount(60))+shipping(60));
}