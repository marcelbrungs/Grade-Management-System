package grademanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentId;
    private String name;
    private List<Integer> grades;

    public Student(String studentId, String name) {
        this.setStudentId(studentId);
        this.setName(name);
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public void displayGrades() {
        System.out.println("Grades for Student: " + name);
        for (Integer grade : grades) {
            System.out.println(grade);
        }
        System.out.println("Average Grade: " + calculateAverageGrade());
    }
    
    public List<Integer> getGrades() {
        return grades;
    }

    public double calculateAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.size();
    }

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void enrollInCourse(Course course1) {
		// TODO Auto-generated method stub
		
	}

	public void displayInfo() {
		// TODO Auto-generated method stub
		
	}

    // Other methods...

    // Getters and setters for studentId and name...

}