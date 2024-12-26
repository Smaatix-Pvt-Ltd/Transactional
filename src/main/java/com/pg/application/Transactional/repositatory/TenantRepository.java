package com.pg.application.Transactional.repositatory;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pg.application.Transactional.entity.Tenant;

@Repository
public interface TenantRepository extends JpaRepository<Tenant, Integer> {
}
