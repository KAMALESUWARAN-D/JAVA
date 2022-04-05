import java.io.*;
import java.util.Scanner; 
class EBbill_calculator
{
public static void main(String args[])
{
int cons_no; String cons_name; double prev_mon; double curr_mon; int conn_type=0; double units=0;;
double s1=0,s2=0,s3=0,billpay=0;
Scanner reader = new Scanner(System.in); 
System.out.println("Enter the consumer no:");
cons_no = reader.nextInt(); 
System.out.println("Enter the consumer name:"); 
cons_name=reader.next();
System.out.println("Enter the previous month reading:"); 
prev_mon=reader.nextInt();
System.out.println("Enter the current month reading:"); 
curr_mon=reader.nextInt();
units=curr_mon-prev_mon;
System.out.println("Enter the connection type 1.Domestic 2.Commercial"); 
conn_type = reader.nextInt();
System.out.println(conn_type); 
switch(conn_type)
{
case 1:
{
if(units<=100)
{
billpay=units*1;
}
else if (units>100 && units<=200)
{
s1 =100*1;
billpay=s1+(units-100)*2.50;
}
else if(units>200 && units<=500)
{
s1 =100*1; s2=100*2.50;
billpay=s1+s2+(units-200)*4; } else
{
s1 =100*1; s2=100*2.50; s3=300*4;
billpay= s1+s2+s3+(units-500)*6;
}
System.out.println("Consumer no="+cons_no);
 System.out.println("Consumer name="+cons_name); 
 System.out.println("Previous month reading="+prev_mon);
System.out.println("Current month reading="+curr_mon); 
System.out.println("Total units consumed="+units); 
System.out.println("Total bill to pay for domestic type= " + billpay);
 
break; 
}
 case 2:
{
if(units<=100)
{
billpay=units*2;
}
else if (units>100 && units<=200)
{
s1 =100*2;
billpay=s1+(units-100)*4.50;
}
else if(units>200 && units<=500)
{
s1 =100*2; s2=100*4.50;
billpay=s1+s2+(units-200)*6;
}
else
{
s1 =100*2; s2=100*4.50; s3=300*6;
billpay=s1+s2+s3+(units-500)*7;
}
System.out.println("Consumer no="+cons_no); System.out.println("Consumer name="+cons_name); System.out.println("Previous month reading="+prev_mon); System.out.println("current month reading="+curr_mon); System.out.println("Total units consumed="+units);
System.out.println("Total bill to pay for commercial connection = " + billpay); break; }
}
}
}
