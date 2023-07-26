/*java program to demonstrate vector*/
import java.util.*;
class VectorDemo
public static voidmain(String args[])
{
vector fruits = new vector();
fruits.add("Apple");                         
fruits.add("Banana");
fruits.add("Cherry");
fruits.add("Orange");
Iterator itr = fruits.Iterator();
while(itr.hasNext())
{
System.out.println(itr.next())
}
}
}