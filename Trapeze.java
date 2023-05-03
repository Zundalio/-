public class Trapeze  extends Quadrilateral{
    double h;
    Trapeze(double a, double b, double h){
        super( a , b);
        this.h = h;
    }
    double area(){
        return 0.5 * (a + b) * h;
    }
}
