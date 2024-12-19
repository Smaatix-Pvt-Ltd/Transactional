package com.pg.application.Transactional.repositatory;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pg.application.Transactional.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    User findByUsername(String username);
}
