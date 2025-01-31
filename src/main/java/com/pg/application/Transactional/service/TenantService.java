package com.pg.application.Transactional.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pg.application.Transactional.entity.Tenant;
import com.pg.application.Transactional.repositatory.TenantRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TenantService {
    @Autowired
    private TenantRepository tenantRepository;

    public Tenant createTenant(Tenant tenant) {
        return tenantRepository.save(tenant);
    }

    public List<Tenant> getAllTenants() {
        return tenantRepository.findAll();
    }

    public Optional<Tenant> getTenantById(int id) {
        return tenantRepository.findById(id);
    }

    public Tenant updateTenant(int id, Tenant updatedTenant) {
        return tenantRepository.findById(id)
                .map(tenant -> {
                    tenant.setName(updatedTenant.getName());
                    tenant.setGender(updatedTenant.getGender());
                    tenant.setDateOfBirth(updatedTenant.getDateOfBirth());
                    tenant.setAge(updatedTenant.getAge());
                    tenant.setJoinedDate(updatedTenant.getJoinedDate());
                    tenant.setRoomNumber(updatedTenant.getRoomNumber());
                    tenant.setAddress(updatedTenant.getAddress());
                    tenant.setAdharNumber(updatedTenant.getAdharNumber());
                    tenant.setEmail(updatedTenant.getEmail());
                    tenant.setAddress1(updatedTenant.getAddress1());
                    tenant.setPhoneNumber(updatedTenant.getPhoneNumber());
                    tenant.setAddress2(updatedTenant.getAddress2());
                    tenant.setGuardianName(updatedTenant.getGuardianName());
                    tenant.setGuardianNumber(updatedTenant.getGuardianNumber());
                    tenant.setGuardianRelationship(updatedTenant.getGuardianRelationship());
                    tenant.setTenantStatus(updatedTenant.getTenantStatus());
                    tenant.setComplaints(updatedTenant.getComplaints());
                    tenant.setFeedback(updatedTenant.getFeedback());
                    tenant.setTenantScore(updatedTenant.getTenantScore());
                    return tenantRepository.save(tenant);
                }).orElseThrow(() -> new RuntimeException("Tenant not found"));
    }

    public void deleteTenant(int id) {
        tenantRepository.deleteById(id);
    }
}