package id_28279.q2;

public class Result extends Exam {
    private int obtainedMarks;
    private String remarks;

    public Result(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
            String schoolName, String address, String schoolPhone, String schoolEmail,
            String departmentName, String departmentCode,
            String teacherName, String subject, String teacherEmail, String teacherPhone,
            String studentName, int rollNumber, String grade, String studentContact,
            String courseName, String courseCode, int creditHours,
            String examName, int maxMarks, java.time.LocalDate examDate,
            int obtainedMarks, String remarks) throws Exception {
        super(id, createdDate, updatedDate, schoolName, address, schoolPhone, schoolEmail,
                departmentName, departmentCode, teacherName, subject, teacherEmail, teacherPhone,
                studentName, rollNumber, grade, studentContact, courseName, courseCode, creditHours,
                examName, maxMarks, examDate);

        if (obtainedMarks < 0)
            throw new Exception("Obtained marks cannot be negative");
        if (remarks.isEmpty())
            throw new Exception("Remarks cannot be empty");

        this.obtainedMarks = obtainedMarks;
        this.remarks = remarks;
    }

    public int getObtainedMarks() {
        return obtainedMarks;
    }

    public String getRemarks() {
        return remarks;
    }
}
