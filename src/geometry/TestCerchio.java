package geometry;

public class TestCerchio {
    public static void main(String[] args) {
        System.out.println("Prepariamo un cerchio......");
        Cerchio c=new Cerchio(5);
        System.out.println("Area: "+c.area());
        System.out.println("Perimetro: "+c.perimetro());
    }
}
