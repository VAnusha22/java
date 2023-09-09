import java.io.*;
public class CmdLineArgsDemov3 extends Object {
    public static void main(String[] args)
    {
        CmdLineArgsDemov3 Obj = new CmdLineArgsDemov3();
        if(args.length!=2)
        {
            System.out.println("Invalid no.of arguments \n you need to pass two  interger less than 10000 ");
        }
        else
        {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = x+y;
        System.out.println("The class name is -- " +Obj.getClass());
        System.out.println(" Sum of " +  x + " and "+ y +" is "+ z);
        }
        
    }
}
