package com.platzi.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "social_media")
public class SocialMedia implements Serializable {

    @Id
    @Column(name = "id_social_media")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSocialMedia;

    @Column(name = "name")
    private String name;

    @Column(name = "icon")
    private String icon;

    @OneToMany
    @JoinColumn(name = "id_social_media")
    private Set<TeacherSocialMedia> teacherSocialMedia;

    public SocialMedia() {
        super();
    }

    public SocialMedia(String name, String icon) {

        this.name = name;
        this.icon = icon;
    }
}
