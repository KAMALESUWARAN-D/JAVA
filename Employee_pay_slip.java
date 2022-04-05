import java.util.Scanner;
class Employee
{
String emp_name,emp_id,address,mail_id,des,mobile_no;
double da,hra,pf,clubfund;
Scanner get = new Scanner(System.in);
Employee()
{
System.out.println("\n\nEnter Name of the Employee:"); 
emp_name = get.nextLine();
System.out.println("Enter ID of the Employee:"); 
emp_id = get.nextLine();
System.out.println("Enter Address of the Employee:");
 address=get.nextLine();
System.out.println("Enter Mail Id:"); 
mail_id = get.nextLine();
System.out.println("Enter mobile number of the Employee:"); 
mobile_no = get.nextLine();
}
void display()
{
System.out.println("==============================\n ABC CONSULTANCY SERVICES\n I.T. High Way,Chennai.\n Pay Slip for the Month of July	2018\n==============================\n");
System.out.println("Employee Name: "+emp_name);
 System.out.println("Employee ID: "+emp_id); 
System.out.println("Address:"+address);
System.out.println("Mail ID: "+mail_id); 
System.out.println("Mobile No: "+mobile_no);
}
}
class programmer extends Employee
{ 
double basicpay;
 programmer()
{
System.out.println("\n****Programmer Details****\n");
des="Programmer";
System.out.println("Enter basic pay:");
 basicpay = get.nextDouble(); 
da=0.97*basicpay;
hra=0.1*basicpay; 
pf=0.12*basicpay; 
clubfund=0.01*basicpay;
}
void display()
{
super.display();
System.out.println("Basic Pay: "+basicpay); 
System.out.println("Designation: "+des); 
System.out.println("DA: "+da); 
System.out.println("HRA: "+hra); 
System.out.println("PF: "+pf);
System.out.println("Staff Club Fund "+clubfund);
}
}
class assistantprofessor extends Employee
{
 double basicpay; 
assistantprofessor()
{
System.out.println("\n****Assistant Professor****\n"); 
des="Assistant Professor";
System.out.println("Enter basic pay:");
 basicpay = get.nextDouble(); 
da=0.97*basicpay;
hra=0.1*basicpay;
 pf=0.12*basicpay; 
clubfund=0.01*basicpay;
}
void display()
{
super.display();
System.out.println("Basic Pay: "+basicpay);
 System.out.println("Designation: "+des);
 System.out.println("DA: "+da); 
System.out.println("HRA: "+hra); 
System.out.println("PF: "+pf);
System.out.println("Staff Club Fund "+clubfund);
 }
}
class associateprofessor extends Employee
{
 double basicpay; associateprofessor()
{
System.out.println("\n****Associate Professor****\n"); 
des="Associate Professor";
System.out.println("Enter basic pay:");
 basicpay = get.nextDouble(); 
da=0.97*basicpay;
hra=0.1*basicpay; 
pf=0.12*basicpay; 
clubfund=0.01*basicpay;
}
void display()
{
super.display();
System.out.println("Basic Pay: "+basicpay); 
System.out.println("Designation: "+des);
 System.out.println("DA: "+da); 
System.out.println("HRA: "+hra);
 System.out.println("PF: "+pf); 
System.out.println("Staff Club Fund "+clubfund);
}
}
class professor extends Employee
{ double basicpay; professor()
{
System.out.println("\n****Professor****\n");
 des="Professor";
System.out.println("Enter basic pay:"); 
basicpay = get.nextDouble(); 
da=0.97*basicpay;
hra=0.1*basicpay; 
pf=0.12*basicpay; 
clubfund=0.01*basicpay;
}
void display()
{
super.display();
System.out.println("Basic Pay: "+basicpay); 
System.out.println("Designation: "+des);
 System.out.println("DA: "+da); 
System.out.println("HRA: "+hra);
 System.out.println("PF: "+pf);
 System.out.println("Staff Club Fund "+clubfund);
}
}
class Employee_pay_slip
{
 public static void main(String args[])
{
programmer pr=new programmer(); 
pr.display();
assistantprofessor ap=new assistantprofessor(); 
ap.display();
associateprofessor acp=new associateprofessor();
acp.display();
professor p=new professor(); 
p.display();
}
}
