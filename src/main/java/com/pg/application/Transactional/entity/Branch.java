package com.pg.application.Transactional.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Branch {
    @Id
    @GeneratedValue
    private UUID id;
    private String Branch_Nme;
    private String Branch_Location;
    private String Occupancy;
    
    
	@Column(nullable = false, updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;
    
	
	@Column(nullable = false)
    @UpdateTimestamp
    private LocalDateTime updatedAt;
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getBranch_Nme() {
		return Branch_Nme;
	}
	public void setBranch_Nme(String branch_Nme) {
		Branch_Nme = branch_Nme;
	}
	public String getBranch_Location() {
		return Branch_Location;
	}
	public void setBranch_Location(String branch_Location) {
		Branch_Location = branch_Location;
	}
	public String getOccupancy() {
		return Occupancy;
	}
	public void setOccupancy(String occupancy) {
		Occupancy = occupancy;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}    
}

