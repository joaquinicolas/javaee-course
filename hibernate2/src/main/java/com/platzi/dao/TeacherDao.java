package com.platzi.dao;

import com.platzi.model.Teacher;

import java.util.List;

public interface TeacherDao {
    void saveTeacher(Teacher teacher);

    void deleteTeacherById(Long id);

    void updateTeacher(Teacher teacher);

    Teacher findTeacherById(Long id);
    Teacher findByName(String name);
    List<Teacher> findAllTeacher();
}
