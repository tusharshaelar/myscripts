**
 * @author: Tushar
 * @description: Program to Calculate area of Triangle in Java
 * with user interaction. Program will prompt user to enter the 
 * base width and height of the triangle.
 */

import java.util.Scanner;
class AreaTriangleDemo {
   public static void main(String args[]) {   
      Scanner scanner = new Scanner(System.in);

      System.out.println("Enter the width of the Triangle:");
      double base = scanner.nextDouble();

      System.out.println("Enter the height of the Triangle:");
      double height = scanner.nextDouble();

      //Area = (width*height)/2
      double area = (base* height)/2;
      System.out.println("Area of Triangle is: " + area);      
   }
}
