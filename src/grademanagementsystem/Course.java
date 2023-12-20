package grademanagementsystem;

public class Course {
    private String courseId;
    private String name;
    private int maxGrade;

    public Course(String courseId, String name) {
        this.setCourseId(courseId);
        this.setName(name);
        this.maxGrade = 100;
    }

    public void setMaximumGrade(int maxGrade) {
        this.maxGrade = maxGrade;
    }

    public int getMaximumGrade() {
        return maxGrade;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + name);
    }

    // Getters and other methods as needed
}
