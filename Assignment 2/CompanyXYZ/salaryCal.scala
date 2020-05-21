object salaryCal extends App{
    def normalHrs(h:Integer):Double=h*150;
    def otHrs(h:Integer):Double=h*75;
    def totIncome(normal:Integer,ot:Integer):Double=normalHrs(normal)+otHrs(ot);
    def taxAmount(tot:Double):Double=tot*0.1;
    def takeHome(normal:Integer,ot:Integer):Double=totIncome(normal,ot)-taxAmount(totIncome(normal,ot));

    printf("%.2f",takeHome(40,20));
}