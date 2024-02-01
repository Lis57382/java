package HomeWork;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        //Коллекции преподавателей и предметов
        ArrayList<Teacher> teachers = new ArrayList<>();
        ArrayList<Course> courses = new ArrayList<>();

        //Создание преподавателей
        Teacher teacher1 = new Teacher("Stanislav Demichev", 26);
        Teacher teacher2 = new Teacher("Igor Chernigovskih", 60);
        Teacher teacher3 = new Teacher("Egor Poltarakov", 22);

        //Добавление преподавателей в коллекцию List
        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);

        //Создание Предметов
        Course course1 = new Course("Developing", 15);
        Course course2 = new Course("Mathematik", 15);
        Course course3 = new Course("OOP", 75);
        Course course4 = new Course("Filosophy", 100);

        //Добавление предметов в коллекцию List
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
        courses.add(course4);

        //Присваивание предметов преподавателям
        teacher1.addCourse(course1);
        teacher1.addCourse(course2);
        teacher1.deleteCourse(course2);
        teacher1.addCourse(course3);
        teacher1.showInfo();

        //Изменение предмета
        course2.refactorCourse("History", 150);

        //Присваивание предметов преподавателям
        teacher2.addCourse(course2);
        teacher2.addCourse(course4);
        teacher2.showInfo();

        course1.showInfo();
        course2.showInfo();
        course3.showInfo();
        course4.showInfo();
        System.out.println("---------------------");

        //Изменение преподавателя
        teacher3.refactorTeacher("Egorik Poltarakov", 24);
        //Метод удаления Преподавателя
        teachers.remove(teacher3);


        //Вывод преподавателей и курсов отдельно. Методы реализованы в классах Teacher и Course
        Teacher.showAllTeachers(teachers);
        Course.showAllCourses(courses);

    }
}