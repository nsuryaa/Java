import java.util.*;

public class StringBuilder extends Object{

  public static void main(String[] args) {

    String helloWorld = "Hello" + "World";
    helloWorld.concat(" and Goodbye");

    //StringBuilder helloWorldBuilder = new StringBuilder("Hello World");

    printInformation(helloWorld);
    // printInformation(helloWorldBuilder);

    StringBuilder emptyStart = new StringBuilder();
    //emptyStart.append("a".repeat(17));
    //StringBuilder emptyStart32 = new StringBuilder(32);

    printInformation(emptyStart);
    //printInformation(emptyStart32);


    
  }
  public static void printInformation(String string)
  {
    System.out.println("String =" + string);
    System.out.println("String length = " + string.length());
  }
  public static void printInformation(StringBuilder builder)
  {
    System.out.println("StringBuilder = " + builder);
    //System.out.println("capacity = " + builder.capacity());
    // System.out.println("length = " + builder.length());
  }
  
}
