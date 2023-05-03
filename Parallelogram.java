public class Parallelogram extends Quadrilateral {
    double h;
    Parallelogram(double a, double b, double h){
        super(a , b);
        this.h = h;
    }
    double area(){
        return a * h;
    }
}
