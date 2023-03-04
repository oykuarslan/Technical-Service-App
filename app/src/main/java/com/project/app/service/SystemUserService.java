package com.project.app.service;

import com.project.app.model.Role;
import com.project.app.model.SystemUser;

import java.util.List;

public interface SystemUserService {
    SystemUser saveUser(SystemUser user);
    Role saveRole(Role roles);

    void addRoleToUser(String name, String roleName);
    SystemUser getSystemUser(String name);
    List<SystemUser>getSystemUsers();
}
