package com.pg.application.Transactional.dto;

import lombok.Data;

@Data
public class OrganizationRequest {
    private String name;
	private String contact_no;
	private String no_of_branches_of_organization;
	private String address;
	private String email;
	private String adminname;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	public String getNo_of_branches_of_organization() {
		return no_of_branches_of_organization;
	}
	public void setNo_of_branches_of_organization(String no_of_branches_of_organization) {
		this.no_of_branches_of_organization = no_of_branches_of_organization;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}    
}