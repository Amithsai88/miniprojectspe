package Calc;
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;
public class Calculate
{
 private static final Logger logger = LogManager.getLogger(Calculate.class);
 public Calculate() {}
 public static void main(String[] args) 
 {
   try
   {
   Calculate calculator=new Calculate();
   Scanner scanner=new Scanner(System.in);
   System.out.println("Hii, Welcome to Scientific Calculator!!");
   System.out.println("Choose which operation to do, by selecting the corresponding number");
   System.out.println("Press 1 to get square root \nPress 2 to get factorial\nPress 3 to get natural logarithm\nPress 4 to get power function");
   int input=scanner.nextInt();
   if(input==1)
   {
   System.out.println("Enter the number");
   System.out.println("Square root result is : " + calculator.root(scanner.nextDouble()));
   }
   else if(input==3)
   {
   System.out.println("Enter the number");
   System.out.println("Natural logarithm result is : " + calculator.log(scanner.nextDouble()));
   }
   else if(input==2)
   {
   System.out.println("Enter the number");
   System.out.println("Factorial result is : " + calculator.factorial(scanner.nextInt()));
   }
   else if(input==4)
   {
   System.out.println("Enter the numbers");
   System.out.println("Power function result is : " + calculator.power(scanner.nextDouble(),scanner.nextDouble()));
   }
   else
   System.out.println("No corresponding operation for the given input :(");
   System.out.println("Done, Bye!!");
   }
   catch(InputMismatchException error)
   {
   System.out.println("Invalid input, Entered input is not of the expected type");
   logger.error("Invalid input, Entered input is not of the expected type");
   }
 }
//These functions are not defined over the entire real range. So, for inputs out of the domains, nan is returned.
 public double root(double number1) 
 {
  logger.info("[ROOT] - " + number1);
  double return_val = Math.sqrt(number1);
  logger.info("[RESULT - ROOT] - " + return_val);
  return return_val;
 }
 public double factorial(int number1) 
 {
  logger.info("[FACTORIAL] - " + number1);
  if(number1<0)
   return Double.NaN;
  double fact=1;  
  for(int i=1;i<=number1;i++)    
   fact=fact*i;   
  logger.info("[RESULT - FACTORIAL] - " + fact);
  return fact;
 }
 public double log(double number1) 
 {
  logger.info("[LOG] - " + number1);
  double return_val = Math.log(number1);
  logger.info("[RESULT - LOG] - " + return_val);
  return return_val;
 }
 public double power(double number1, double number2) 
 {
  logger.info("[POWER] - " + number1 + ", " + number2);
  double return_val = Math.pow(number1 , number2);
  logger.info("[RESULT - POWER] - " + return_val);
  return return_val;
 }
}
