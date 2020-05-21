object bookCost extends App{
    def booksFullAmount(bCount:Integer):Double=bCount*24.95;
    def discount(price:Double):Double=price*0.4;
    def shipping(bCount:Integer):Double=3+(bCount-50)*0.75;

    printf("%.2f",booksFullAmount(60)-discount(booksFullAmount(60))+shipping(60));
}