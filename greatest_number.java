import java.io.*;
class greatest_number
{
static void greater()throws Exception
{
System.out.println("hii");
InputStreamReader i=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(i);  
System.out.print("Enter a");
int  a=Integer.parseInt(br.readLine());
System.out.print("Enter b");
int b=Integer.parseInt(br.readLine());
System.out.print("Enter c");
 int c=Integer.parseInt(br.readLine());
if(a>b&&a>c)
{
System.out.println("a is greater");
}
else if(b>a&&b>c)
{
System.out.println("b is greater");
}
else
System.out.println("c  is greaer");
}
public static void main(String args[])throws Exception 
 { 
greater();
}
}


