package org.launchcode.models;


import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Category {



    @Id
    @GeneratedValue
    private int Id;

    @NotNull
    @Size(min=3, max = 15)
    private String name;

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category(){

    }
    public Category(String name){
        this.name=name;

    }
}
