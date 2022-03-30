package BinaryToDecimal;

import java.util.Scanner;


public class BinaryToDecimal {

  public static void main(String[] args) {
  Scanner input=new Scanner(System.in);
  System.out.println("Enter the Binary value");
  String BinaryNumber=input.nextLine();
  
  int DecimalNumber=Integer.parseInt(BinaryNumber, 2);
  System.out.println("Decimal value is:"+DecimalNumber);
  
  }
  
}