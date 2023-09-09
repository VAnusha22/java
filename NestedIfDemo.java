import java.io.*;
import java.util.*;
public class NestedIfDemo{
public static void main(String[]args){
System.out.println("Enter marks of three subjects");
Scanner sc = new Scanner(System.in);
int M1 = sc.nextInt();
int M2 = sc.nextInt();
int M3 = sc.nextInt();
int total = M1+M2+M3;
float Avg = (float)total/3;
if(Avg>=75)
{
 if(Avg>=95){
  System.out.println("Your Avg is in top 5 percent");
}
else if(Avg>=90)
{
 System.out.println("Your Avg is  in top 10 precent");
}
else(Avg>=75)
{
 System.out.println("Student passed in Distinction");
}
else if(Avg>=40&&Avg<=75)
{
 System.out.println("Student passed in Exam");
}
else(Avg<40)
{
System.out.println("Student failed in Exam");
}
}
}
