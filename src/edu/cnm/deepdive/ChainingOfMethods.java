package edu.cnm.deepdive;

public class ChainingOfMethods {

  public static void main(String[] args) {
    String start = "  Java  ";
    String trimmed = start.trim();
    System.out.println("trimmed = " + trimmed);
    String lowerCase = trimmed.toLowerCase();
    System.out.println("trimmed and lowerCase = " + lowerCase);
    String result = lowerCase.replace('j', 'K');
    System.out.println("result = " + result);
    System.out.println();

    //doing it with method chaining:
    String anotherResult = start.trim().toLowerCase().replace('j', 'K');
    System.out.println("anotherResult = " + anotherResult);
    System.out.println("result is equal to anotherResult? : " + result.equals(anotherResult));
    System.out.println();

    String a = "abc";
    String b = a.toUpperCase();//this produces a new String, doesn't change the a variable.
    String c = b.replace('B', 'b').replace('C','c');//produces a new String
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("c = " + c);

    if (a.equalsIgnoreCase(b)) {
      System.out.println("Strings are equal");//this will be printed
    }

    if (a.toLowerCase().trim().equals(b.toLowerCase().trim())) {
      System.out.println("Equal");//will print Equal
    }

  }

}
