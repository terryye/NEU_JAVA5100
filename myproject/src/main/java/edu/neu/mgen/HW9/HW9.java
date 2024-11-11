package edu.neu.mgen.HW9;

public class HW9 {
    public static void main(String[] args) {

        EngClass dsClass = new EngClass();

        System.out.println("add students 1001, 1004, 1006, 1009");
        dsClass.addStudent(new Student(1001, "Feifei", "Li"));
        dsClass.addStudent(new Student(1004, "Mask", "Elon"));
        dsClass.addStudent(new Student(1006, "Jackson", "Mike"));
        dsClass.addStudent(new Student(1009, "Bryan", "Kobe"));
        dsClass.printStudents();

        System.out.println("delete students  1004, 1006");
        dsClass.deleteStudentById(1004);
        dsClass.deleteStudentById(1006);
        dsClass.printStudents();
    }
}
