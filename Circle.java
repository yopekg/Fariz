/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

import java.io.*;
import java.util.Scanner;
import java.lang.*;

/**
 *
 * @author farizprabuallam
 */
/*
 * The Circle class models a circle with a radius and color.
 */
public class Circle {    // Save as "Circle.java"
   // Private instance variables
   private double radius;
   private String color;
    private int sin60;
   
   // Constructors (overloaded)
   public Circle() {                   // 1st Constructor
      radius = 1.0;
      color = "red";
   }
   public Circle(double r) {           // 2nd Constructor
      radius = r;
      color = "red";
   }
   public Circle(double r, String c) { // 3rd Constructor
      radius = r;
      color = c;
   }
   
   // Public methods
   public double Radius() {
      return radius;
   }
   public String Color() {
      return color;
   }
   public double Area() {
      return radius * radius * Math.PI;
   }
   
   public double Diameter()  {
     double diameter = radius * radius;
     return diameter;
   }
     
   public double Circumference()   {
     double circumference = 2 * Math.PI * radius;
     return circumference;
   }
   
   public double Segment()   {
      double segment = 0.5 * ( 60 - sin60 ) * radius * radius ;
      return segment;
   }
   
   public double Sector()   {
      double sector =   Math.PI * radius * radius * 1 / 6 ;
      return sector;
   }
     public double Arc()   {
      double arc =  2 * Math.PI * radius * 1 / 6 ;
      return arc;
   }
     
     
     
     
}
