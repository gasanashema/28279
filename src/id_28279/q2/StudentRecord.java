package id_28279.q2;

import java.time.LocalDate;
import java.util.Scanner;

public final class StudentRecord extends Fee {
    private double averageMarks;

    public StudentRecord(int id, LocalDate createdDate, LocalDate updatedDate,
            String schoolName, String address, String schoolPhone, String schoolEmail,
            String departmentName, String departmentCode,
            String teacherName, String subject, String teacherEmail, String teacherPhone,
            String studentName, int rollNumber, String grade, String studentContact,
            String courseName, String courseCode, int creditHours,
            String examName, int maxMarks, LocalDate examDate,
            int obtainedMarks, String remarks,
            double tuitionFee, double examFee) throws Exception {
        super(id, createdDate, updatedDate, schoolName, address, schoolPhone, schoolEmail,
                departmentName, departmentCode, teacherName, subject, teacherEmail, teacherPhone,
                studentName, rollNumber, grade, studentContact, courseName, courseCode, creditHours,
                examName, maxMarks, examDate, obtainedMarks, remarks, tuitionFee, examFee);

        this.averageMarks = ((double) obtainedMarks / maxMarks) * 100;
    }

    public double getAverageMarks() {
        return averageMarks;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id = 0, rollNumber = 0, maxMarks = 0, obtainedMarks = 0, creditHours = 0;
        LocalDate createdDate = null, updatedDate = null, examDate = null;
        double tuitionFee = 0, examFee = 0;
        String schoolName = "", address = "", schoolPhone = "", schoolEmail = "";
        String departmentName = "", departmentCode = "";
        String teacherName = "", subject = "", teacherEmail = "", teacherPhone = "";
        String studentName = "", grade = "", studentContact = "";
        String courseName = "", courseCode = "";
        String examName = "", remarks = "";

        System.out.println("========= SCHOOL MANAGEMENT SYSTEM =========");

        System.out.println("\n----- SCHOOL INFORMATION -----\n");

        while (true) {
            try {
                System.out.print("Enter ID (>0): ");
                id = Integer.parseInt(sc.nextLine().trim());
                if (id <= 0)
                    throw new Exception("ID must be > 0");
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Enter created date (YYYY-MM-DD): ");
                createdDate = LocalDate.parse(sc.nextLine().trim());
                break;
            } catch (Exception e) {
                System.out.println("ERROR: Invalid date format, use YYYY-MM-DD");
            }
        }

        while (true) {
            try {
                System.out.print("Enter updated date (YYYY-MM-DD): ");
                updatedDate = LocalDate.parse(sc.nextLine().trim());
                if (updatedDate.isBefore(createdDate))
                    throw new Exception("Updated date cannot be before created date");
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        while (true) {
            System.out.print("School name: ");
            schoolName = sc.nextLine().trim();
            if (!schoolName.isEmpty())
                break;
            System.out.println("ERROR: School name cannot be empty");
        }

        System.out.print("School address: ");
        address = sc.nextLine().trim();

        while (true) {
            System.out.print("School phone (10 digits): ");
            schoolPhone = sc.nextLine().trim();
            if (schoolPhone.matches("\\d{10}"))
                break;
            System.out.println("ERROR: Phone must be exactly 10 digits");
        }

        while (true) {
            System.out.print("School email: ");
            schoolEmail = sc.nextLine().trim();
            if (schoolEmail.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$"))
                break;
            System.out.println("ERROR: Invalid email format");
        }

        System.out.println("\n----- DEPARTMENT INFORMATION -----\n");

        while (true) {
            System.out.print("Department name: ");
            departmentName = sc.nextLine().trim();
            if (!departmentName.isEmpty())
                break;
            System.out.println("ERROR: Department name cannot be empty");
        }

        while (true) {
            System.out.print("Department code (>=3 chars): ");
            departmentCode = sc.nextLine().trim();
            if (departmentCode.matches("[a-zA-Z0-9]{3,}"))
                break;
            System.out.println("ERROR: Must be >=3 alphanumeric characters");
        }

        System.out.println("\n----- TEACHER INFORMATION -----\n");

        while (true) {
            System.out.print("Teacher name: ");
            teacherName = sc.nextLine().trim();
            if (!teacherName.matches(".*\\d.*") && !teacherName.isEmpty())
                break;
            System.out.println("ERROR: Name cannot contain numbers");
        }

        while (true) {
            System.out.print("Subject: ");
            subject = sc.nextLine().trim();
            if (!subject.isEmpty())
                break;
            System.out.println("ERROR: Subject cannot be empty");
        }

        while (true) {
            System.out.print("Teacher email: ");
            teacherEmail = sc.nextLine().trim();
            if (teacherEmail.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$"))
                break;
            System.out.println("ERROR: Invalid email format");
        }

        while (true) {
            System.out.print("Teacher phone (10 digits): ");
            teacherPhone = sc.nextLine().trim();
            if (teacherPhone.matches("\\d{10}") && !teacherPhone.equals(schoolPhone))
                break;
            System.out.println("ERROR: Phone must be 10 digits and different from school phone");
        }

        System.out.println("\n----- STUDENT INFORMATION -----\n");

        while (true) {
            System.out.print("Student name: ");
            studentName = sc.nextLine().trim();
            if (!studentName.matches(".*\\d.*") && !studentName.isEmpty())
                break;
            System.out.println("ERROR: Name cannot contain numbers");
        }

        while (true) {
            try {
                System.out.print("Roll number (>0): ");
                rollNumber = Integer.parseInt(sc.nextLine().trim());
                if (rollNumber <= 0)
                    throw new Exception("Roll number must be >0");
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        while (true) {
            System.out.print("Grade: ");
            grade = sc.nextLine().trim();
            if (!grade.isEmpty())
                break;
            System.out.println("ERROR: Grade cannot be empty");
        }

        while (true) {
            System.out.print("Student contact (10 digits): ");
            studentContact = sc.nextLine().trim();
            if (studentContact.matches("\\d{10}") && !studentContact.equals(teacherPhone)
                    && !studentContact.equals(schoolPhone))
                break;
            System.out.println("ERROR: Must be 10 digits and different from teacher/school phone");
        }

        System.out.println("\n----- COURSE INFORMATION -----\n");

        while (true) {
            System.out.print("Course name: ");
            courseName = sc.nextLine().trim();
            if (!courseName.isEmpty())
                break;
            System.out.println("ERROR: Course name cannot be empty");
        }

        while (true) {
            System.out.print("Course code: ");
            courseCode = sc.nextLine().trim();
            if (!courseCode.isEmpty())
                break;
            System.out.println("ERROR: Course code cannot be empty");
        }

        while (true) {
            try {
                System.out.print("Credit hours (>0): ");
                creditHours = Integer.parseInt(sc.nextLine().trim());
                if (creditHours <= 0)
                    throw new Exception("Must be >0");
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        System.out.println("\n----- EXAM INFORMATION -----\n");

        while (true) {
            System.out.print("Exam name: ");
            examName = sc.nextLine().trim();
            if (!examName.isEmpty())
                break;
            System.out.println("ERROR: Exam name cannot be empty");
        }

        while (true) {
            try {
                System.out.print("Max marks (>0): ");
                maxMarks = Integer.parseInt(sc.nextLine().trim());
                if (maxMarks <= 0)
                    throw new Exception("Must be > 0");
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Exam date (YYYY-MM-DD): ");
                examDate = LocalDate.parse(sc.nextLine().trim());
                break;
            } catch (Exception e) {
                System.out.println("ERROR: Invalid date");
            }
        }

        System.out.println("\n----- RESULT INFORMATION -----\n");

        while (true) {
            try {
                System.out.print("Obtained marks (>=0): ");
                obtainedMarks = Integer.parseInt(sc.nextLine().trim());
                if (obtainedMarks < 0 || obtainedMarks > maxMarks)
                    throw new Exception("Must be between 0 and max marks");
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        while (true) {
            System.out.print("Remarks: ");
            remarks = sc.nextLine().trim();
            if (!remarks.isEmpty())
                break;
            System.out.println("ERROR: Remarks cannot be empty");
        }

        System.out.println("\n----- FEE INFORMATION -----\n");

        while (true) {
            try {
                System.out.print("Tuition fee (>0): ");
                tuitionFee = Double.parseDouble(sc.nextLine().trim());
                if (tuitionFee <= 0)
                    throw new Exception("Must be > 0");
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Exam fee (>0): ");
                examFee = Double.parseDouble(sc.nextLine().trim());
                if (examFee <= 0)
                    throw new Exception("Must be > 0");
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        try {
            StudentRecord r = new StudentRecord(
                    id, createdDate, updatedDate,
                    schoolName, address, schoolPhone, schoolEmail,
                    departmentName, departmentCode,
                    teacherName, subject, teacherEmail, teacherPhone,
                    studentName, rollNumber, grade, studentContact,
                    courseName, courseCode, creditHours,
                    examName, maxMarks, examDate,
                    obtainedMarks, remarks,
                    tuitionFee, examFee);

            System.out.println("\n===================================");
            System.out.println("          STUDENT RECORD");
            System.out.println("===================================");

            System.out.println("===== SCHOOL INFORMATION =====\n");
            System.out.println("School Name: " + r.getSchoolName());
            System.out.println("School Address: " + r.getAddress());
            System.out.println("School Phone: " + r.getSchoolPhone());
            System.out.println("School Email: " + r.getSchoolEmail());

            System.out.println("\n===== DEPARTMENT INFORMATION =====\n");
            System.out.println("Department Name: " + r.getDepartmentName());
            System.out.println("Department Code: " + r.getDepartmentCode());

            System.out.println("\n===== TEACHER INFORMATION =====\n");
            System.out.println("Teacher Name: " + r.getTeacherName());
            System.out.println("Teacher Subject: " + r.getSubject());
            System.out.println("Teacher Email: " + r.getTeacherEmail());
            System.out.println("Teacher Phone: " + r.getPhone());

            System.out.println("\n===== STUDENT INFORMATION =====\n");
            System.out.println("Student Name: " + r.getStudentName());
            System.out.println("Roll Number: " + r.getRollNumber());
            System.out.println("Grade: " + r.getGrade());
            System.out.println("Student Contact: " + r.getStudentContact());

            System.out.println("\n===== COURSE INFORMATION =====\n");
            System.out.println("Course Name: " + r.getCourseName());
            System.out.println("Course Code: " + r.getCourseCode());
            System.out.println("Credit Hours: " + r.getCreditHours());

            System.out.println("\n===== EXAM INFORMATION =====\n");
            System.out.println("Exam Name: " + r.getExamName());
            System.out.println("Max Marks: " + r.getMaxMarks());
            System.out.println("Exam Date: " + r.getExamDate());
            System.out.println("Obtained Marks: " + r.getObtainedMarks());
            System.out.println("Remarks: " + r.getRemarks());

            System.out.println("\n===== FEES INFORMATION =====\n");
            System.out.println("Tuition Fee: " + r.getTuitionFee());
            System.out.println("Exam Fee: " + r.getExamFee());
            System.out.println("Total Fee: " + r.getTotalFee());

            System.out.println("\n===== RESULT SUMMARY =====\n");
            System.out.println("Average Marks: " + r.getAverageMarks() + "%");

            System.out.println("===================================");

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        sc.close();
    }

}
