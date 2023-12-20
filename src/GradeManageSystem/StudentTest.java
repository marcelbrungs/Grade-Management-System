package GradeManageSystem; 

import static org.junit.Assert.*;
import org.junit.Test;

import grademanagementsystem.Student;

public class StudentTest {

    @Test
    public void testAddGrade() {
        Student student = new Student("S001", "John");
        student.addGrade(90);
        student.addGrade(85);

        assertEquals(2, student.getGrades().size());
    }

    @Test
    public void testCalculateAverageGrade() {
        Student student = new Student("S001", "John");
        student.addGrade(90);
        student.addGrade(85);

        assertEquals(87.5, student.calculateAverageGrade(), 0.01);
    }

    @Test
    public void testCalculateAverageGradeNoGrades() {
        Student student = new Student("S002", "Jane");

        assertEquals(0.0, student.calculateAverageGrade(), 0.01);
    }

    @Test
    public void testCalculateAverageGradeSingleGrade() {
        Student student = new Student("S003", "Bob");
        student.addGrade(75);

        assertEquals(75.0, student.calculateAverageGrade(), 0.01);
    }
}
