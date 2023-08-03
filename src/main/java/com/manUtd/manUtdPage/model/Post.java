package com.manUtd.manUtdPage.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class Post {
    @Id
    private long id;
    private String name;
    private String surname;
    private int number;
}
