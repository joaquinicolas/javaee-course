package com.platzi.model;

import sun.jvm.hotspot.memory.Generation;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "teacher")
public class Teacher implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_teacher", nullable = false, updatable = false)
    private Long idTeacher;

    @Column(name = "name")
    private String name;

    @Column(name = "avatar")
    private String avatar;


    @OneToMany(mappedBy = "teacher")
    private Set<Course> courses;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_teacher")
    private Set<TeacherSocialMedia> teacherSocialMedia;

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }


    public Teacher() {
    }

    public Teacher(String name, String avatar) {

        this.name = name;
        this.avatar = avatar;
    }

    public Set<TeacherSocialMedia> getTeacherSocialMedia() {
        return teacherSocialMedia;
    }

    public void setTeacherSocialMedia(Set<TeacherSocialMedia> teacherSocialMedia) {
        this.teacherSocialMedia = teacherSocialMedia;
    }

    public Long getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(Long idTeacher) {
        this.idTeacher = idTeacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
