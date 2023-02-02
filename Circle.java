/**
 * @class: Circle
 * @author: Kevin Vergara
 * @verison 1.0
 * @course: ITEC 2140 - 04, Spring 20023
 * @written: January 26, 2023
 * description: This program computes the area and perimeter of a circle with the radius of 9.5
 */
public class Circle {
    public static void main(String[] args){
        double radius = 9.5;
        double area = radius * radius * Math.PI;
        double perimeter = 2 * radius * Math.PI;
        System.out.println("Area of this circle: " + area);
        System.out.println("Perimeter of this circle: " + perimeter);

    }
}
