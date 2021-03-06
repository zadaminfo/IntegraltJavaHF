package com.zadam.intjavahf.workmanintegraljavahf;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Project")
public class Project {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
     
    @Column
    private String name;
     
    @Column
    private String description;
     
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof User){
            User user = (User) obj;
            return user.getId() == this.getId();
        }
         
        return false;
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getDescription() {
        return description;
    }
 
    public void setDescription(String description) {
        this.description = description;
    }
    
    @Override
    public String toString() {
    	return name;
    }
}