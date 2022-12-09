package com.radyn.burgertracker.mvc.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="burgers")
public class Burger {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	Long id;
	
	public Long getId() {
		return id;
	}

	@NotNull
	@Size(min = 3, max = 20)
	String name;
	
	@NotNull
	@Size(min = 3, max = 20)
	String restaurantName;
	@NotNull
	@Min(0)
	@Max(10)
	int rating;
	@NotNull
	@Size(min = 5, max= 200)
	String comment;
	
	@Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
	
	public Burger() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
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
