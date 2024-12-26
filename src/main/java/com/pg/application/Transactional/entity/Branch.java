package com.pg.application.Transactional.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Set;
import java.util.UUID;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Branch {
    @Id
    @GeneratedValue
    private int branch_id;
    private String Branch_Name;
   
    private String Occupancy;
    private int no_of_rooms;
    private String Address;
    private int total_occupied_rooms;
    private int empty_rooms;
    private LocalTime openTime;
    private LocalTime closeTime;
    
    @Embedded
    private Location location;
    
    @Enumerated(EnumType.STRING)
    private PgType pgType;
    
    @Enumerated(EnumType.STRING)
    @ElementCollection
    @CollectionTable(name = "pg_amenities")
    @Column(name = "amenity")
    private Set<Amenity> amenities;

    @Embedded
    private FoodTiming foodTiming;
    
private String status;
private int no_of_cook_need;
private int no_of_available_cooks;
private int no_of_maid_need;
private int no_of_available_maid;
    

	public int getNo_of_rooms() {
	return no_of_rooms;
}
public void setNo_of_rooms(int no_of_rooms) {
	this.no_of_rooms = no_of_rooms;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public int getTotal_occupied_rooms() {
	return total_occupied_rooms;
}
public void setTotal_occupied_rooms(int total_occupied_rooms) {
	this.total_occupied_rooms = total_occupied_rooms;
}
public int getEmpty_rooms() {
	return empty_rooms;
}
public void setEmpty_rooms(int empty_rooms) {
	this.empty_rooms = empty_rooms;
}
public LocalTime getOpenTime() {
	return openTime;
}
public void setOpenTime(LocalTime openTime) {
	this.openTime = openTime;
}
public LocalTime getCloseTime() {
	return closeTime;
}
public void setCloseTime(LocalTime closeTime) {
	this.closeTime = closeTime;
}
public PgType getPgType() {
	return pgType;
}
public void setPgType(PgType pgType) {
	this.pgType = pgType;
}
public Set<Amenity> getAmenities() {
	return amenities;
}
public void setAmenities(Set<Amenity> amenities) {
	this.amenities = amenities;
}
public FoodTiming getFoodTiming() {
	return foodTiming;
}
public void setFoodTiming(FoodTiming foodTiming) {
	this.foodTiming = foodTiming;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public int getNo_of_cook_need() {
	return no_of_cook_need;
}
public void setNo_of_cook_need(int no_of_cook_need) {
	this.no_of_cook_need = no_of_cook_need;
}
public int getNo_of_available_cooks() {
	return no_of_available_cooks;
}
public void setNo_of_available_cooks(int no_of_available_cooks) {
	this.no_of_available_cooks = no_of_available_cooks;
}
public int getNo_of_maid_need() {
	return no_of_maid_need;
}
public void setNo_of_maid_need(int no_of_maid_need) {
	this.no_of_maid_need = no_of_maid_need;
}
public int getNo_of_available_maid() {
	return no_of_available_maid;
}
public void setNo_of_available_maid(int no_of_available_maid) {
	this.no_of_available_maid = no_of_available_maid;
}
	@Column(nullable = false, updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;
    
	
	@Column(nullable = false)
    @UpdateTimestamp
    private LocalDateTime updatedAt;
	
	public int getId() {
		return branch_id;
	}
	public void setId(int id) {
		this.branch_id = id;
	}
	public String getBranch_Nme() {
		return Branch_Name;
	}
	public void setBranch_Nme(String branch_Nme) {
		Branch_Name = branch_Nme;
	}
	
	 public Location getLocation() {
	        return location;
	    }

	    public void setLocation(Location location) {
	        this.location = location;
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

