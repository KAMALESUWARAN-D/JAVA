import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class addition{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader input=new InputStreamReader(System.in);
        BufferedReader inp=new BufferedReader(input);      
        System.out.println("Enter two value");
        int a=inp.read();
        int b=inp.read();
        int add=a+b;
        System.out.println("Addition=" +add);
    }
}