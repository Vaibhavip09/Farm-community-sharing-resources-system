package com.FarmSharingResourse.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "community_info")
public class CommunityInfo {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String location;
    private String members;
    private String requests;
    
    @Column(length = 1000)
    private String mission;
    
    @Column(length = 1000)
    private String resources;
    
    @Column(length = 1000)
    private String activities;

    @Column(length = 500)
    private String invite;

	public CommunityInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CommunityInfo(Integer id, String location, String members, String requests, String mission, String resources,
			String activities, String invite) {
		super();
		this.id = id;
		this.location = location;
		this.members = members;
		this.requests = requests;
		this.mission = mission;
		this.resources = resources;
		this.activities = activities;
		this.invite = invite;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMembers() {
		return members;
	}

	public void setMembers(String members) {
		this.members = members;
	}

	public String getRequests() {
		return requests;
	}

	public void setRequests(String requests) {
		this.requests = requests;
	}

	public String getMission() {
		return mission;
	}

	public void setMission(String mission) {
		this.mission = mission;
	}

	public String getResources() {
		return resources;
	}

	public void setResources(String resources) {
		this.resources = resources;
	}

	public String getActivities() {
		return activities;
	}

	public void setActivities(String activities) {
		this.activities = activities;
	}

	public String getInvite() {
		return invite;
	}

	public void setInvite(String invite) {
		this.invite = invite;
	}
    
    
    
	
}
