package JavaFundamentals.JavaClasses.OOPConcepts;

class Student {
    int studentNo;
    String studentName;

    public int getStudentNo() {
        return studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void printStudentRecord() {
        System.out.println("Student No: " + this.studentNo + " Name: " + this.studentName);
    }

}

public class Sample2 {
    public static void main(String[] args) {
        Student objStudent = new Student();
        objStudent.setStudentNo(101);
        objStudent.setStudentName("Alberth G. Ruado");
        objStudent.getStudentNo();
        objStudent.getStudentName();
        objStudent.printStudentRecord();
    }
}
