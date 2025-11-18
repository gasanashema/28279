package id_28279.q2;

import java.time.LocalDate;

public class Teacher extends Department {
    private String teacherName;
    private String subject;
    private String teacherEmail;
    private String phone;

    public Teacher(int id, LocalDate createdDate, LocalDate updatedDate,
            String schoolName, String address, String phoneNumber, String email,
            String departmentName, String departmentCode,
            String teacherName, String subject, String teacherEmail, String phone) throws Exception {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email, departmentName, departmentCode);

        if (subject.isEmpty())
            throw new Exception("Subject cannot be empty");
        if (!teacherEmail.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$"))
            throw new Exception("Invalid teacher email");
        if (!phone.matches("\\d{10}"))
            throw new Exception("Invalid teacher phone");

        this.teacherName = teacherName;
        this.subject = subject;
        this.teacherEmail = teacherEmail;
        this.phone = phone;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getSubject() {
        return subject;
    }

    public String getTeacherEmail() {
        return teacherEmail;
    }

    public String getPhone() {
        return phone;
    }
}
