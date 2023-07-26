/*java program to display values of all primitive data*/
import java.lang.*;
class Default_Values
{
int i;
byte b;
short s;
long l;
float f;
double d;
char ch;
String str;
Boolean bl;
public void display()
{
System.out.println("Integer default value is:"+i);
System.out.println("Byte default value is:"+b);
System.out.println("Short default value is:"+s);
System.out.println("Long default value is:"+l);
System.out.println("Float default value is:"+f);
System.out.println("Double default value is:"+d);
System.out.println("Character default value is:"+ch);
System.out.println("String default value is:"+str);
System.out.println("Boolean default value is:"+bl);
}
}
class DefValues 
{
public static void main(String args[])
{
Default_Values obj=new Default_Values();
obj.display();
}
}