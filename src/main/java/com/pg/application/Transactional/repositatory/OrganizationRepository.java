package com.pg.application.Transactional.repositatory;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.pg.application.Transactional.entity.Organization;


public interface OrganizationRepository extends JpaRepository<Organization, UUID> {
	boolean existsByName(String name);
}

