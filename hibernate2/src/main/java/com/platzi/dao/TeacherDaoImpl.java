package com.platzi.dao;

import com.platzi.model.Teacher;

import java.util.List;

public class TeacherDaoImpl implements TeacherDao {

    private PlatziSession platziSession;
    public TeacherDaoImpl() {
        super();
        platziSession = new PlatziSession();
    }

    public void saveTeacher(Teacher teacher) {
        platziSession.getSession().persist(teacher);
        platziSession.getSession().getTransaction().commit();
    }

    public void deleteTeacherById(Long id) {

    }

    public void updateTeacher(Teacher teacher) {

    }

    public Teacher findTeacherById(Long id) {
        return null;
    }

    public Teacher findByName(String name) {
        return null;
    }

    public List<Teacher> findAllTeacher() {
        return platziSession.getSession().createQuery("from Teacher").list();
    }
}
