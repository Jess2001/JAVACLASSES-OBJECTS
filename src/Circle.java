import java.awt.*;
import java.util.Scanner;

public class Circle {

    double radius;

    Circle(){}
    Circle(  double radius){
        this.radius= radius;
    }

    double getPerimeter(){
        return 2* Math.PI * radius;
    }

    double getArea(){
        return Math.PI * radius* radius;
    }
        public static void main(String[] args) {
            Scanner scanner= new Scanner(System.in);
            System.out.println("Enter the radius");
            double radius = scanner.nextDouble();





        }

}
