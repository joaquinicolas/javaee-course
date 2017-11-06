package com.platzi.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "teacher_social_media")
public class TeacherSocialMedia implements Serializable {

    @Id
    @Column(name = "id_teacher_social_media")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTeacherSocialMedia;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_teacher")
    private Teacher teacher;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_social_media")
    private SocialMedia socialMedia;


    @Column(name = "nickname")
    private String nickName;

    public Long getIdTeacherSocialMedia() {
        return idTeacherSocialMedia;
    }

    public void setIdTeacherSocialMedia(Long idTeacherSocialMedia) {
        this.idTeacherSocialMedia = idTeacherSocialMedia;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public SocialMedia getSocialMedia() {
        return socialMedia;
    }

    public void setSocialMedia(SocialMedia socialMedia) {
        this.socialMedia = socialMedia;
    }

    public TeacherSocialMedia() {

    }

    public TeacherSocialMedia(Teacher teacher, SocialMedia socialMedia, String nickName) {

        this.teacher = teacher;
        this.socialMedia = socialMedia;
        this.nickName = nickName;
    }
}
