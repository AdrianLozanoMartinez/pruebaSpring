package com.work.it.crudWork.service;

import java.util.List;
import com.work.it.crudWork.entity.Role;

public interface RoleService {
    Role save(Role role);
    List<Role> findAll();
    Role findById(Long id);
    void deleteById(Long id);
    Role update(Role role);
}
