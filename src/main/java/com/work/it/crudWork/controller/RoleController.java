package com.work.it.crudWork.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.work.it.crudWork.entity.Role;
import com.work.it.crudWork.service.RoleService;

//http://localhost:8080/api/roles
@RestController
@RequestMapping("/api/roles")
@CrossOrigin(origins = "http://localhost:4200")
public class RoleController {
    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

  //http://localhost:8080/api/roles
    @PostMapping
    public Role save(@RequestBody Role role) {
        return roleService.save(role);
    }

  //http://localhost:8080/api/roles
    @GetMapping
    public List<Role> findAll() {
        return roleService.findAll();
    }

    //http://localhost:8080/api/roles/id
    @GetMapping("/{id}")
    public Role findById(@PathVariable Long id) {
        return roleService.findById(id);
    }

  //http://localhost:8080/api/roles/id
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        roleService.deleteById(id);
    }

  //http://localhost:8080/api/roles
    @PutMapping("/{id}")
    public Role updateRole(@PathVariable Long id, @RequestBody Role role) {
        Role roleDb = roleService.findById(id);
        roleDb.setName(role.getName());
        return roleService.update(roleDb);
    }
}
