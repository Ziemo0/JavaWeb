package com.manUtd.manUtdPage.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Comment {
    @Id
    private long id;
    private long player_id;
    private String comment;
}
