package id_28279.q2;

import java.time.LocalDate;

public class Course extends Student {
    private String courseName;
    private String courseCode;
    private int creditHours;

    public Course(int id, LocalDate createdDate, LocalDate updatedDate,
            String schoolName, String address, String schoolPhone, String schoolEmail,
            String departmentName, String departmentCode,
            String teacherName, String subject, String teacherEmail, String teacherPhone,
            String studentName, int rollNumber, String grade, String studentContact,
            String courseName, String courseCode, int creditHours) throws Exception {
        super(id, createdDate, updatedDate, schoolName, address, schoolPhone, schoolEmail,
                departmentName, departmentCode, teacherName, subject, teacherEmail, teacherPhone,
                studentName, rollNumber, grade, studentContact);

        if (courseName.isEmpty())
            throw new Exception("Course name cannot be empty");
        if (courseCode.isEmpty())
            throw new Exception("Course code cannot be empty");
        if (creditHours <= 0)
            throw new Exception("Credit hours must be > 0");

        this.courseName = courseName;
        this.courseCode = courseCode;
        this.creditHours = creditHours;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getCreditHours() {
        return creditHours;
    }
}
