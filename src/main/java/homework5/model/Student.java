package homework5.model;

public class Student extends User {
    private Integer id;

    public Student(String name, String secondName, Integer year, Integer id) {
        super(name, secondName, year);
        this.id = id;
    }

    public Student(String name, String secondName, Integer year) {
        super(name, secondName, year);
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Студент: ID - '" + id + '\'' +
                ", Имя - '" + getName() + '\'' +
                ", Фамилия - '" + getSecondName() + '\'' +
                ", Год рождения - " + getYear()
                ;
    }
}