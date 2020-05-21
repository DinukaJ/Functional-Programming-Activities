object bestTicketPrice extends App{
    def attendCount(price:Int):Int=120+(15-price)/5*20;
    def revenue(price:Int):Int=attendCount(price)*price;
    def totalCost(price:Int):Int=500+attendCount(price)*3;
    def totalProfit(price:Int):Int=revenue(price)-totalCost(price);
    def bestTPrice():Int={
        var bestPrice:Int=totalProfit(5);
        var bestPrice2:Int=totalProfit(5)
        var ticketPrice:Int=5;
        while(bestPrice>=bestPrice2)
        {
            ticketPrice+=5;
            bestPrice=totalProfit(ticketPrice);
            if(bestPrice>bestPrice2)
            {
                bestPrice2=bestPrice;
            }
        }   
        ticketPrice-=5;
        ticketPrice;
    }

    printf("Best Ticket Price:- %d",bestTPrice());
}