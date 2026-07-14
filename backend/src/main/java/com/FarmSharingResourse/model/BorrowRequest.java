package com.FarmSharingResourse.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "borrow_requests")
public class BorrowRequest {
     
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long resourceId;

    private String userName;
    private String email;
    private String phone;

    private int duration; // days
    private LocalDate pickupDate;
    
    private String status;     
    
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getResourceId() {
		return resourceId;
	}

	public void setResourceId(Long resourceId) {
		this.resourceId = resourceId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public LocalDate getPickupDate() {
		return pickupDate;
	}

	public void setPickupDate(LocalDate pickupDate) {
		this.pickupDate = pickupDate;
	}

	
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BorrowRequest() {
		super();
		// TODO Auto-generated constructor stub
	}


	public BorrowRequest(Long id, Long resourceId, String userName, String email, String phone, int duration,
			LocalDate pickupDate, String status) {
		super();
		this.id = id;
		this.resourceId = resourceId;
		this.userName = userName;
		this.email = email;
		this.phone = phone;
		this.duration = duration;
		this.pickupDate = pickupDate;
		this.status = status;
		
	}
    
    
    
	
}
