package homework5.model;

import java.util.ArrayList;
import java.util.List;

public class StudeGroup {
    private Integer numberGroup;
    private Teacher teacher;
    private List<Student> students;

    public StudeGroup(Integer numberGroup, Teacher teacher, ArrayList<Student> students) {
        this.numberGroup = numberGroup;
        this.teacher = teacher;
        this.students = students;
    }

    @Override
    public String toString() {
        return "Студенческая группа номер - " + numberGroup +
                ", преподаватель в группе - " + teacher +
                ", стурднты в группе - " + students +
                '}';
    }
}