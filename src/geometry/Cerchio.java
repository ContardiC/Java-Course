package geometry;

public class Cerchio {
    double r;
    public Cerchio(double r){
        this.r=r;
    }
    public double area(){
        double res;
        res=r*r*Math.PI;
        return res;
    }
    public double perimetro(){
        double res;
        res=2*r*Math.PI;
        return res;
    }

}
