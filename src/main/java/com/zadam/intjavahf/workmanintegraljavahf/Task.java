package com.zadam.intjavahf.workmanintegraljavahf;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Task")
public class Task {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
     
    @Column
    private String name;
     
    @Column
    private String description;
    
    @OneToOne
    @JoinColumn(name="Project_id")
    private Project project;

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
    
    public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	
    @Override
    public String toString() {
    	return name;
    }
}
