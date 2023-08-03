package com.manUtd.manUtdPage.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Player {
    @Id
    private long id;
    private String name;
    private String surname;
    private int number;

    @OneToOne
    @JoinColumn(name = "player_id")
    private List<Comment> commentList;
}
