class Shape{
    int Sides;
}
class Triangle extends Shape{
   Triangle(int Sides){
    this.Sides=Sides;
   } 
   public void Print(){
    System.out.println("Sides-->"+ Sides);
   }
   public void perimeter(int Sides){
    System.out.println(3*Sides);
   }
}
public class OOPS2 {
    public static void main(String[] args){
        Triangle t1=new Triangle(3);
        t1.Print();
        t1.perimeter(3);
    }
}
