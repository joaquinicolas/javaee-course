package com.platzi;

import com.platzi.dao.TeacherDaoImpl;
import com.platzi.model.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Teacher Michael = new Teacher("Miguel Chauca", "Avatar");
        TeacherDaoImpl teacherDao = new TeacherDaoImpl();
        teacherDao.saveTeacher(Michael);

        List<Teacher> teachers = teacherDao.findAllTeacher();
        for (Teacher t:teachers) {
            System.out.println("Nombre: " + t.getName());
        }
    }
}
