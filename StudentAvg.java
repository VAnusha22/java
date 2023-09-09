import java.io.*;
import java.util.*;
public class StudentAvg{
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
  System.out.println("Student passed in distinction");
}
else if(Avg>=60&&Avg<75)
{
 System.out.println("Student passed in First class");
}
else if(Avg>=50&&Avg<60)
{
 System.out.println("Student passed in Second class");
}
else if(Avg>=40&&Avg<50)
{
 System.out.println("Student passed in Third class");
}
else
{
System.out.println("Student failed in Exam");
}
}
}

  
