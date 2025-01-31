package com.pg.application.Transactional.repositatory;


import org.springframework.data.jpa.repository.JpaRepository;
import com.pg.application.Transactional.entity.Branch;

public interface BranchRepository extends JpaRepository<Branch, Integer> {}

