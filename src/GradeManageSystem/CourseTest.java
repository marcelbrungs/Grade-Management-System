package GradeManageSystem; // Adjust the package name accordingly

import static org.junit.Assert.*;
import org.junit.Test;

import grademanagementsystem.Course;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CourseTest {

    @Test
    public void testDisplayInfo() {
        Course course = new Course("C001", "Java Programming");

        String expectedOutput = "Course ID: C001\nCourse Name: Java Programming\n";
        assertEquals(expectedOutput, getConsoleOutput(course::displayInfo));
    }

    private String getConsoleOutput(Runnable action) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        action.run();

        System.setOut(System.out); 
        return outputStream.toString().trim();
    }
}
