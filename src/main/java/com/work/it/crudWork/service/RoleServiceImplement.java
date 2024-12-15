package com.work.it.crudWork.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.work.it.crudWork.entity.Role;
import com.work.it.crudWork.exception.NotFoundException;
import com.work.it.crudWork.repository.RoleRepository;

@Service
public class RoleServiceImplement implements RoleService {

    private final RoleRepository roleRepository;

    public RoleServiceImplement(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role save(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public Role findById(Long id) {
        return roleRepository.findById(id).orElseThrow(
                () -> new NotFoundException("El rol con id " + id + " no se encuentra")
        );
    }

    @Override
    public void deleteById(Long id) {
        roleRepository.deleteById(id);
    }

    @Override
    public Role update(Role role) {
        return roleRepository.save(role);
    }
}
