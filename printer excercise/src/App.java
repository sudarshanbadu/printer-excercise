public class App {
    public static void main(String[] args) throws Exception {
       /*  System.out.println("Hello, World!");
        System.out.println("My name is sudarshan badu");
        */
        String creator = "sudarshan badu";
        System.out.println("The app is made by "+ creator);
        int number1 = 5;
        int number2 = 7;
       // System.out.println("The value of number1 is " + number1);
        number1 = 5;
        System.out.println("The value of number1 is " + number1);
        number2 = 3;
        System.out.println("The value of number2 is " + number2);
        int multiplication;
        multiplication = number1* number2;
        System.out.println(number1 +" * " +number2 +" =" + multiplication);
        int add = number1 + number2;
        System.out.println(number1 +" + " +number2 +" =" + add);
        int sub =  number1 - number2;
        System.out.println(number1 +" - " +number2 +" =" + sub);
        int div =  number1 % number2;
        System.out.println(number1 +" % " +number2 +" =" + div);
  }
}
