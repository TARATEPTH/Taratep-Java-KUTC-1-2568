public class Scanner {
    public static  void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter your number: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.println("Hello " + name + ", you are " + age + " years old.");

        input.close(); // Close the scanner to prevent resource leaks
    }
}
