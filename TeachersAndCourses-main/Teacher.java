package HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Teacher implements Information {

    private String Name;
    private int Age;
    private List<Course> courses;

    private Teacher teacher;

    public Teacher(String name, int age) {
        this.Name = name;
        this.Age = age;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void addCourse(Course course){
        courses.add(course);
    }


    public void deleteCourse (Course course){
        courses.remove(course);
    }

    public void showCourses(){
        System.out.println("Курсы которые ведет преподователь " + getName() + ":");
        for (Course course: courses) {
            System.out.println(course.getName() + ", " + course.getHours() + " часов");
        }
        System.out.println("---------------------------------");
    }

    public static void showAllTeachers(ArrayList<Teacher> teachers){
        for (Teacher teacher: teachers){
            System.out.println("Преподаватель: " + teacher.getName() + " ,Возраст " + teacher.getAge());
        }
        System.out.println("---------------------------------");
    }

    public void refactorTeacher (String newName, int newAge){
        this.Name = newName;
        this.Age = newAge;
    }

    //Реализация метода из интерфейса
    @Override
    public void showInfo() {
        System.out.println("Информация о преподователе: ");
        System.out.println("ФИО: " + getName());
        System.out.println("Возраст: " + getAge());
        showCourses();
    }

}
