package id_28279.q2;

public class Fee extends Result {
    private double tuitionFee;
    private double examFee;
    private double totalFee;

    public Fee(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
            String schoolName, String address, String schoolPhone, String schoolEmail,
            String departmentName, String departmentCode,
            String teacherName, String subject, String teacherEmail, String teacherPhone,
            String studentName, int rollNumber, String grade, String studentContact,
            String courseName, String courseCode, int creditHours,
            String examName, int maxMarks, java.time.LocalDate examDate,
            int obtainedMarks, String remarks,
            double tuitionFee, double examFee) throws Exception {
        super(id, createdDate, updatedDate, schoolName, address, schoolPhone, schoolEmail,
                departmentName, departmentCode, teacherName, subject, teacherEmail, teacherPhone,
                studentName, rollNumber, grade, studentContact, courseName, courseCode, creditHours,
                examName, maxMarks, examDate, obtainedMarks, remarks);

        if (tuitionFee <= 0 || examFee <= 0)
            throw new Exception("Fees must be > 0");
        this.tuitionFee = tuitionFee;
        this.examFee = examFee;
        this.totalFee = tuitionFee + examFee;
    }

    public double getTuitionFee() {
        return tuitionFee;
    }

    public double getExamFee() {
        return examFee;
    }

    public double getTotalFee() {
        return totalFee;
    }
}
