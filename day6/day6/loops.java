import java.util.Scanner;
class Loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
        int i=0;
        while (i<5) {
            if(i==3){
                continue;
            }else if(i==4){
                break;
            }
            i++;
            System.out.println(i);
        }
    }    
}
