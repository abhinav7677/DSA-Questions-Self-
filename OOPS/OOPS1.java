class pen{
    String Colour;
    String Brand;

    pen(String Colour,String Brand){
        this.Colour=Colour;
        this.Brand=Brand;
    }
    public void info(){
        System.out.println("Brand is -->"+Brand+" Colour is -->"+Colour);
    }
}
public class OOPS1 {
    public static void main(String[] args){
        pen p1=new pen("RED","ADD GEL");
        p1.info();
    }
}
