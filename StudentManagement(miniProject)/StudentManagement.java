import java.util.*;

class Student {
    int roll;
    String name;
    Student(int roll, String name){
        this.roll = roll;
        this.name = name;
    }
}

public class StudentManagement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        while(true){
            System.out.println("\n1.Add  2.Display  3.Search  4.Exit");
            int ch = sc.nextInt();

            switch(ch){
                case 1:
                    System.out.print("Enter Roll: ");
                    int r = sc.nextInt();
                    System.out.print("Enter Name: ");
                    String n = sc.next();
                    list.add(new Student(r,n));
                    break;

                case 2:
                    for(Student s : list){
                        System.out.println(s.roll+" "+s.name);
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll: ");
                    int key = sc.nextInt();
                    for(Student s : list){
                        if(s.roll == key){
                            System.out.println("Found: "+s.name);
                        }
                    }
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}
