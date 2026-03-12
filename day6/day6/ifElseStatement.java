import java.util.Scanner;

//Class name - First letter capital
class IfElse{
    //Fun Name- First letter small;
    public static void main(String[] args) {

        //Creating a scanner object
        Scanner sc=new Scanner(System.in);

        //To print something
        System.out.println("Enter your age:");

        //Using the scanner object
        int age=sc.nextInt();

        //If- Below 18 then unvalid

        if (age<18) {
            System.out.println("Not eligible");
        }else if(age>18 && age<25){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }
        sc.close();
    }
}