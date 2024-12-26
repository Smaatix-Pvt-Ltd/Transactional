package com.pg.application.Transactional.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.pg.application.Transactional.entity.Tenant;
import com.pg.application.Transactional.service.TenantService;

import java.util.List;

@RestController
@RequestMapping("/api/tenants")
public class TenantController {
    @Autowired
    private TenantService tenantService;

    @PostMapping
    public ResponseEntity<Tenant> createTenant(@RequestBody Tenant tenant) {
        Tenant createdTenant = tenantService.createTenant(tenant);
        return ResponseEntity.ok(createdTenant);
    }

    @GetMapping
    public ResponseEntity<List<Tenant>> getAllTenants() {
        return ResponseEntity.ok(tenantService.getAllTenants());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tenant> getTenantById(@PathVariable int id) {
        return tenantService.getTenantById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tenant> updateTenant(@PathVariable int id, @RequestBody Tenant tenant) {
        return ResponseEntity.ok(tenantService.updateTenant(id, tenant));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTenant(@PathVariable int id) {
        tenantService.deleteTenant(id);
        return ResponseEntity.noContent().build();
    }
}
