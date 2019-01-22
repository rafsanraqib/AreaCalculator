import java.util.Scanner;

public class AreaCalculator {
  
  public static void main(String [] args) {
    
    Scanner input = new Scanner(System.in);
    
    double pi = 3.14159;
    
    double Area = 0;
    
    
    
    System.out.print("Enter 1 for circle : Enter 2 for Eclipse : Enter 3 for Trapezoid: ");
      
      int shape = input.nextInt();
    
    if ( shape == 1) {
      
      System.out.print("Enter radius: ");
      
      double radius = input.nextDouble();
      
      Area = pi * radius * radius;
      
      System.out.printf("Area of circle is: %.14f " , Area);
      

      
    }
    
    else if (shape == 2) {
      
      System.out.print("Enter major axis: ");
      double maxis = input.nextDouble();
      System.out.print("Enter minor axis: ");
      double miaxis = input.nextDouble();
      
      Area = pi * maxis * miaxis;
      
      System.out.printf("Area of Ellipse is : %.7f " , Area);
      
    }
    
    else if (shape == 3) {
      
      System.out.print("Enter side 1: ");
      
      double side1 = input.nextDouble();
      
      System.out.print("Enter side 2: ");
      
      double side2 = input.nextDouble();
      
      System.out.print("Enter height: ");
      
      double height = input.nextDouble();
      
      Area =  0.5 * (side1 + side2) * height;
      
      System.out.printf("Area of Trapzoid: %.2f" , Area);
      
    }
    
    else {
      
      System.out.print("Wrong Number");
      
    }
  }
  
}
