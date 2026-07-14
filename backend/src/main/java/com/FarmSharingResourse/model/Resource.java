package com.FarmSharingResourse.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Resource {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	   
	    private String name;
	    private String type;
	    private String quantity;
	    
	    @Column(length = 1000)
	    private String description;
	    
	    
	   
	    
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getQuantity() {
			return quantity;
		}

		public void setQuantity(String quantity) {
			this.quantity = quantity;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Resource() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Resource(String name, String type, String quantity, String description) {
			super();
			this.name = name;
			this.type = type;
			this.quantity = quantity;
			this.description = description;
		}
	    
	    
	   
	
}
