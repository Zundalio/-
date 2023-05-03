public class Main {
    public  static void main(String[] args) {
        Figure f = new Figure();
        Triangle t = new Triangle(10, 5);
        IsoscelesTriangle it = new IsoscelesTriangle(6, 4, 5);

        //System.out.println("Площадь Фигуры: " + f.area());
        System.out.println("Площадь Треугольника: " + t.area());
        System.out.println("Площадь Равнобедренного треугольника: " + it.area());
    }

}
