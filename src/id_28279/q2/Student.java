package id_28279.q2;

import java.time.LocalDate;

public class Student extends Teacher {
    private String studentName;
    private int rollNumber;
    private String grade;
    private String contactNumber;

    public Student(int id, LocalDate createdDate, LocalDate updatedDate,
            String schoolName, String address, String phoneNumber, String email,
            String departmentName, String departmentCode,
            String teacherName, String subject, String teacherEmail, String teacherPhone,
            String studentName, int rollNumber, String grade, String contactNumber) throws Exception {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
                departmentName, departmentCode, teacherName, subject, teacherEmail, teacherPhone);

        if (rollNumber <= 0)
            throw new Exception("Roll number must be > 0");
        if (grade.isEmpty())
            throw new Exception("Grade cannot be empty");
        if (!contactNumber.matches("\\d{10}"))
            throw new Exception("Student contact must be 10 digits");

        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.contactNumber = contactNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getGrade() {
        return grade;
    }

    public String getStudentContact() {
        return contactNumber;
    }
}
