package grademanagementsystem;

public class GradeManagementSystem {
    public static void main(String[] args) {
    	
        Course course1 = new Course("C001", "Java Programming");
        Course course2 = new Course("C002", "Database Management");

        Student student1 = new Student("S001", "John");
        Student student2 = new Student("S002", "Jane");

        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);
        student2.enrollInCourse(course1);

       // System.out.println("Student Information:");
       // System.out.println("---------------------");
       // student1.displayInfo();
       // System.out.println("---------------------");
       // student2.displayInfo();

        System.out.println("\nCourse Information:");
        System.out.println("--------------------");
        course1.displayInfo();
        System.out.println("--------------------");
        course2.displayInfo();
    }
}
