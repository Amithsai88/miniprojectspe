package Calc;
import java.lang.Math;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
   System.out.println("Thanks for coming!!");
   System.out.println("Select the option");
   System.out.println("Select 1 for square root of a number\nSelect 2 for factorial of a number\nSelect 3 for logarithm base e of a number\nSelect 4 for power of two numbers");
   int input=scanner.nextInt();
   if(input==1)
   {
   System.out.println("Present your number");
   System.out.println("Square root result is : " + calculator.root(scanner.nextDouble()));
   }
   else if(input==2)
   {
       System.out.println("Present your number");
       System.out.println("Factorial result is : " + calculator.factorial(scanner.nextInt()));
   }
   else if(input==3)
   {
       System.out.println("Present your number");
       System.out.println("Natural logarithm result is : " + calculator.log(scanner.nextDouble()));
   }
   else if(input==4)
   {
       System.out.println("Present your number");
       System.out.println("Power function result is : " + calculator.power(scanner.nextDouble(),scanner.nextDouble()));
   }
   else
   System.out.println("No possible operation");
   }
   catch(InputMismatchException error)
   {
   System.out.println("Input type not valid");
   logger.error("Input type not valid");
   }
 }
 public double root(double number1)
 {
  logger.info("[ROOT] - " + number1);
  double sqrt = Math.sqrt(number1);
  logger.info("[RESULT - ROOT] - " + sqrt);
  return sqrt;
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
  double lne = Math.log(number1);
  logger.info("[RESULT - LOG] - " + lne);
  return lne;
 }
 public double power(double number1, double number2) 
 {
  logger.info("[POWER] - " + number1 + ", " + number2);
  double pwr = Math.pow(number1 , number2);
  logger.info("[RESULT - POWER] - " + pwr);
  return pwr;
 }
}
