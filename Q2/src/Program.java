import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Calculator c = new Calculator();
        Scanner s = new Scanner(System.in);
 
        System.out.print("Please enter some number: ");
        int num = s.nextInt();
        int x = num;
        System.out.println("The number you entered is: "+num);

        if(c.isSymmetric(num)== true){
            System.out.println("The number "+num+" is symmetric");
        } 
        else{
            System.out.println("The number "+num+" is not symmetric");
            c.isSymmetric(num);
            while (c.isSymmetric(num) == false) {
                num = num + 1;
            }
            System.out.println("The first symmetric number after "+x+" is "+num);
        }
    }
}
