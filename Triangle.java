public class Triangle extends Figure {
     double base;
     double height;
    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    double area(){
        return 0.5 * base * height;
    }
}