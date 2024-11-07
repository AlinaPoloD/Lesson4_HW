package ru.geekbrains.lesson4.homework.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.geekbrains.lesson4.models.Student;


import javax.persistence.*;

import java.util.HashMap;
import java.util.Random;

@Data
@AllArgsConstructor
@Entity
@Table(name = "courses")
public class Course {
/*
    Создайте базу данных (например, SchoolDB).
            * В этой базе данных создайте таблицу Courses с полями id (ключ), title, и duration.
            * Настройте Hibernate для работы с вашей базой данных.
            * Создайте Java-класс Course, соответствующий таблице Courses, с необходимыми аннотациями Hibernate.
     * Используя Hibernate, напишите код для вставки, чтения, обновления и удаления данных в таблице Courses.
     * Убедитесь, что каждая операция выполняется в отдельной транзакции.
     **/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "duration", nullable = false)
    private int duration;

    private static final String[] titles = new String[] { "Математика", "Информатика", "Биология", "История", "Английский", "Немецкий", "Литература", "Русский", "Химия", "География" };
    private static final Random random = new Random();


    public Course(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public Course() {
    }

    public static Course create(){
        return new Course(titles[random.nextInt(titles.length)], random.nextInt(5, 24));
    }



    public void updateDuration(){
        duration = random.nextInt(5, 24);
    }

    public void updateTitle(){
        title = titles[random.nextInt(titles.length)];
    }

}
