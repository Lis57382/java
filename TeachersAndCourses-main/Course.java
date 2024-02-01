package HomeWork;

import java.util.ArrayList;

public class Course implements Information {

    private String Name;
    private int Hours;
    public Course(String name, int hours) {
        Name = name;
        Hours = hours;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getHours() {
        return Hours;
    }

    public void setHours(int hours) {
        Hours = hours;
    }

    public void refactorCourse(String newName, int newHours){
        this.Name = newName;
        this.Hours = newHours;
    }


    public static void showAllCourses(ArrayList<Course> courses){
        for (Course course: courses){
            System.out.println("Курс: " + course.getName() + " ,Часов: " + course.getHours());
        }
    }

    //Реализация метода из интерфейса
    @Override
    public void showInfo() {
        System.out.println("Информация по предмету: " + getName() + ", изучается в течение: " + getHours() + " часов");
    }

}
