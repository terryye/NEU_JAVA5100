package edu.neu.mgen.HW9;

import java.util.ArrayList;

public class EngClass {

    public ArrayList<Student> students;

    public EngClass() {
        students = new ArrayList<Student>();
    }

    public boolean addStudent(Student student) {
        if (student == null) {
            return false;
        }

        this.students.add(student);
        return true;
    }

    public boolean deleteStudentById(int id) {
        boolean hasStudent = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).id == id) {
                students.remove(i);
                hasStudent = true;
            }
        }
        return hasStudent;
    }

    public void printStudents() {
        for (Student student : students) {
            System.out.print("id : " + student.id);
            System.out.print("first name : " + student.firstName);
            System.out.print("last name : " + student.lastName);
            System.out.println();
        }
    }

}
