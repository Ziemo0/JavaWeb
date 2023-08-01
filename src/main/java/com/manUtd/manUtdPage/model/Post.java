package com.manUtd.manUtdPage.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class Post {
    private long id;
    private String name;
    private String surname;
    private int number;
}
