package zadam.ijfHF.defaultpackage;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="MeasureEntry")
public class MeasureEntry {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    @Column
    private String creationDate;

	@Column
    private double duration;

	@Column
    private String comment;
    
    @OneToOne
    @JoinColumn(name="Task_id")
    private Task task;
    
    @OneToOne
    @JoinColumn(name="User_id")
    private User user;

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
    
    public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
    
    public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}
 
    public String getComment() {
        return comment;
    }
 
    public void setComment(String description) {
        this.comment = description;
    }
    
    public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}
	
    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
