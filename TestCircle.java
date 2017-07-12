/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

/**
 *
 * @author farizprabuallam
 */
public class TestCircle {
   
   public static void main(String[] args) {   
      // C1 Declare and Construct
      Circle c1 = new Circle(2.0, "blue");  
      System.out.println("Radius of c1 is: " + c1.Radius());  
      System.out.println("Color of c1 is: " + c1.Color());
      System.out.printf("Area of c1 is: %.2f%n", c1.Area());
      System.out.printf("Diameter of c1: %.2f %n", c1.Diameter());
      System.out.printf("Circumference of c1: %.2f %n", c1.Circumference());
      System.out.printf("Segment of c1 is: %.2f %n", c1.Segment());
      System.out.printf("Sector of c1 is : %.2f %n", c1.Sector());
      System.out.printf("Arc of c1 is: %.2f %n", c1.Arc());
   
       // C2 Declare and Construct
      Circle c2 = new Circle(2.0);  // Use 2nd constructor
      System.out.println("Radius of c2 is: " + c2.Radius());
      System.out.println("Color of c2 is: " + c2.Color());
      System.out.printf("Area of c2 is: %.2f%n", c2.Area());
      System.out.printf("The Aiameter of c2 is: %.2f %n", c2.Diameter());
      System.out.printf("Circumference of c2 is : %.2f %n", c2.Circumference());
      System.out.printf("Segment of c2 is : %.2f %n", c2.Segment());
      System.out.printf("Sector of c2 is : %.2f %n", c2.Sector());
      System.out.printf("Arc of c2 is: %.2f %n", c2.Arc());
   
   
       // C3 Declare and Construct
      Circle c3 = new Circle();  // Use 1st constructor
      System.out.println("Radius of c3 is: " + c3.Radius());
      System.out.println("Color of c3 is: " + c3.Color());
      System.out.printf("Area of c3 is: %.2f%n", c3.Area());
      System.out.printf("Diameter of c3 is : %.2f %n", c3.Diameter());
      System.out.printf("Circumference of c3 is: %.2f %n", c3.Circumference());
      System.out.printf("Segment of c3 is: %.2f %n", c3.Segment());
      System.out.printf("Sector of c3 is: %.2f %n", c3.Sector());
      System.out.printf("Arc of c3 is: %.2f %n", c3.Arc());
   
   }
}
    
    

