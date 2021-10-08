package com.relevel.googlekeep.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Note {

    @Id
    private long note_id;
}
