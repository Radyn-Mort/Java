package com.radyn.ninjasanddojos.mvc.models;


import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="dojos")
public class Dojo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Size(min=2,max=15)
	private String name;
	
	@OneToMany(mappedBy="dojo", fetch=FetchType.LAZY)
	private List<Ninja> ninjas;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	 
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	public Dojo() {
		
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Ninja> getNinjas() {
		return ninjas;
	}


	public void setNinjas(List<Ninja> ninjas) {
		this.ninjas = ninjas;
	}


	public Date getCreatedAt() {
		return createdAt;
	}


	public Date getUpdatedAt() {
		return updatedAt;
	}


	public Long getId() {
		return id;
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