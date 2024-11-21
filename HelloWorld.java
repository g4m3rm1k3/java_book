public class HelloWorld {
  public static void main(String[] args) {
    String greeting = "Hello, World!";
    System.out.println(greeting);

    int number = 5;
    int doubled = doubledNumber(number);
    System.out.println("The doubled number is: " + doubled);
  }
  public static int doubledNumber(int input){
    return input * 2;
  }
}
