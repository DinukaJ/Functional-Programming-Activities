case class Point(x:Int, y:Int)
{
    def a:Int=x
    def b:Int=y

     def +(p:Point)=Point(this.a+p.a, this.b+p.b)

     def move(dx:Int, dy:Int)=Point(this.a+dx, this.b+dy)

     def distance(a:Point, b:Point)=((a.x-b.x),(a.y-b.y))

     def invert=Point(this.y, this.x)
}
object Case extends App{
    val p1 = Point(1,2);
    val p2 = Point(4,5);

    println("Point After Defining:- ");
    println(p1);
    println(p2);

    println("\nAdd Two Points:- ");
    println(p1+p2);

    println("\nMove P1 by dx=5 & dy=8 Distance:- ");
    println(p1.move(5,8))

    println("\nInvert P2:- ")
    println(p2.invert)
}