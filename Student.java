class Student {
    String name;
    int roll;
    double marks;

    Student(String name,int roll, double marks) {
        this.name=name;
        this.roll=roll;
        this.marks=marks;
    }
    boolean hasPass() {
        return marks >= 40.0;
    }

    void displayReport() {
        System.out.println("Roll no: "+ roll + " | Name: " + name + " | Marks: "+ marks);

         String status;
    if(hasPass()) {
        status = "pass";
    }
    else if(hasPass==40){
        status = "just passed";
    }
    else {
        status = "fail";
    }
    System.out.println("status: "+ status);

    }
}

public class Main {
    public static void main(String[] args) {
        Student s1= new Student("Hi", 20, 80.8);
        Student s2 = new Student("Bye", 11, 10.0);

        s1.displayReport();
        s2. displayReport();
    }
}