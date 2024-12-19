package com.pg.application.Transactional.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.pg.application.Transactional.dto.OrganizationRequest;
import com.pg.application.Transactional.service.OrganizationService;

@CrossOrigin
@RestController
public class OrganizationController {

	@Autowired
	private OrganizationService organizationService;

	@PostMapping("/create")
	public String createOrganization(@RequestBody @Validated OrganizationRequest request) {
		return organizationService.createOrganization(request.getName(), request.getContact_no(), request.getNo_of_branches_of_organization(), request.getAddress() ,request.getEmail(),request.getAdminname());
	}
	@GetMapping("/")
	public String getOrganization () {
		return "Organization created successfully";
	}

    }

