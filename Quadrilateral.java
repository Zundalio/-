public class Quadrilateral  extends Figure{
    double a;
    double b;
    Quadrilateral(double a, double b){
        this.a = a;
        this.b = b;
    }
    double area(){
        return a * b;
    }
}
