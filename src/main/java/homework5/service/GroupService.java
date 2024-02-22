package homework5.service;

import homework5.model.StudeGroup;
import homework5.model.Student;
import homework5.model.Teacher;

import java.util.ArrayList;

public class GroupService {

    public StudeGroup CreateGroup(Integer num, Teacher teacher, Student... students) {
        ArrayList<Student> listStudents = new ArrayList<>();
        for (Student student : students) {
            listStudents.add(student);
        }
        return new StudeGroup(num, teacher, listStudents);
    }
}
