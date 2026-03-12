import java.util.ArrayList;
import java.util.Scanner;
class Student{
    int id;
    String name;
    int age;

    Student(int id,String name, int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<Student>students=new ArrayList<>();

        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1 Add Student");
            System.out.println("2 View Student");
            System.out.println("3 Update Student");
            System.out.println("4 Delete Student");
            System.out.println("5 Exit");

            System.out.println("Enter your choice:");
            int choice=sc.nextInt();

            if(choice==1){
                System.out.println("Enter id:");
                int id=sc.nextInt();
                sc.nextLine();

                System.out.println("Enter name:");
                String name=sc.nextLine();

                System.out.println("Enter Age:");
                int age=sc.nextInt();

                Student s=new Student(id, name, age);
                students.add(s);
                System.out.println("Student added Successfully");
            }
            else if(choice==2){
                if(students.isEmpty()){
                    System.out.println("No Students found");
                }else{
                    for(Student s : students){
                        System.out.println("ID: "+s.id);
                        System.out.println("Name: "+s.name);
                        System.out.println("Age: "+s.age);
                    }
                }
            }
            else if(choice==3){
                 System.out.println("Enter ID to update:");
                 int id=sc.nextInt();
                 sc.nextLine();

                 boolean found=false;
                 for(Student s:students){
                    if(s.id==id){

                        System.out.println("Enter new name:");
                        s.name=sc.nextLine();

                        System.out.println("Enter new age:");
                        s.age=sc.nextInt();

                        System.out.println("Student Updated");
                        found=true;
                        break;
                    }
                 }

                 if(!found){
                    System.out.println("Student not found");
                 }
            }

            else if(choice==4){
                System.out.println("Enter ID to delete:");
                int id=sc.nextInt();

                boolean removed=false;

                for(Student s:students){
                    if(s.id==id){
                        students.remove(s);
                        System.out.println("Student removed");
                        removed=true;
                        break;
                    }
                }
                if(!removed){
                    System.out.println("Student not found");
                }
            }else if(choice==5){
                System.out.println("Exiting program");
                break;
            }
            else{
                System.out.println("Invalid Choice");
            }
        }
    }
}