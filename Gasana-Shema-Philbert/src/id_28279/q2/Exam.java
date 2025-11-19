package id_28279.q2;

import java.time.LocalDate;

public class Exam extends Course {
    private String examName;
    private int maxMarks;
    private LocalDate examDate;

    public Exam(int id, LocalDate createdDate, LocalDate updatedDate,
            String schoolName, String address, String schoolPhone, String schoolEmail,
            String departmentName, String departmentCode,
            String teacherName, String subject, String teacherEmail, String teacherPhone,
            String studentName, int rollNumber, String grade, String studentContact,
            String courseName, String courseCode, int creditHours,
            String examName, int maxMarks, LocalDate examDate) throws Exception {
        super(id, createdDate, updatedDate, schoolName, address, schoolPhone, schoolEmail,
                departmentName, departmentCode, teacherName, subject, teacherEmail, teacherPhone,
                studentName, rollNumber, grade, studentContact, courseName, courseCode, creditHours);

        if (examName.isEmpty())
            throw new Exception("Exam name cannot be empty");
        if (maxMarks <= 0)
            throw new Exception("Max marks must be > 0");
        if (examDate == null)
            throw new Exception("Exam date cannot be null");

        this.examName = examName;
        this.maxMarks = maxMarks;
        this.examDate = examDate;
    }

    public String getExamName() {
        return examName;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public LocalDate getExamDate() {
        return examDate;
    }
}
