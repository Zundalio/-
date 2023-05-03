public class IsoscelesTriangle extends Triangle {
    double side;
    IsoscelesTriangle(double base, double height, double side){
        super(base, height);
        this.side = side;
    }
    double area(){
        return 0.5 * base * height;
    }
}
