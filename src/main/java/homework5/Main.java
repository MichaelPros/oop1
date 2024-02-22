package homework5;

import homework5.controller.Controller;
import homework5.model.StudeGroup;
import homework5.model.Student;
import homework5.model.Teacher;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Student student = controller.createStudent(new Student("Михаил", "Паволоцкий", 2024));
        Teacher teacher = controller.createTeacher(new Teacher("Роман", "Воронцовский", 1984));
        StudeGroup group123 = controller.createGroup(5450, teacher, student);
        System.out.println(group123.toString());


    }
}