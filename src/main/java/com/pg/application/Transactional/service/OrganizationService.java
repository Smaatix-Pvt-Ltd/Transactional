package com.pg.application.Transactional.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pg.application.Transactional.entity.Organization;
import com.pg.application.Transactional.entity.User;
import com.pg.application.Transactional.repositatory.OrganizationRepository;

@Service
public class OrganizationService {

    @Autowired
    private OrganizationRepository organizationRepository;

    public String createOrganization(String name, String Address, String Email, String Contact_no, String no_of_branches_of_organization, String adminname) {
        if (organizationRepository.existsByName(name)) {
            throw new RuntimeException("Organization with this name already exists.");
        }

        Organization organization = new Organization();
        organization.setName(name);
        organization.setContact_no(Contact_no);
        organization.setNo_of_branches_of_organization(no_of_branches_of_organization);
        organization.setAddress(Address);
        organization.setEmail(Email);
        organization.setAdminname(adminname);

        organizationRepository.save(organization);

        return "Organization created successfully";
    }

	public List<Organization> getAllUsers() {
		
		return organizationRepository.findAll();
	}
}
