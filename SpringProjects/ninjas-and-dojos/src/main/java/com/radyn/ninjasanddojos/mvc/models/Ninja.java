package com.radyn.ninjasanddojos.mvc.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="ninjas")
public class Ninja {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Size(min=2,max=15)
	private String fName;
	
	@NotBlank
	@Size(min=2,max=15)
	private String lName;
	
	@Min(3)
	private int age;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="dojo_id")
	private Dojo dojo;
	
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	 
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	// constructor
	public Ninja() {
		
	}
	//Getters and Setters
	public Dojo getDojo() {
		return dojo;
	}
	public void setDojo(Dojo dojo) {
		this.dojo = dojo;
	}
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Long getId() {
		return id;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
   @PreUpdate
   protected void onUpdate(){
        this.updatedAt = new Date();
}

}
