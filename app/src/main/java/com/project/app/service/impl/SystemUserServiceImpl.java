//package com.project.app.service.impl;
//
//import com.project.app.model.Booking;
//import com.project.app.model.Roles;
//import com.project.app.model.SystemUser;
//import com.project.app.repository.BookingRepository;
//import com.project.app.repository.RoleRepository;
//import com.project.app.repository.UserRepository;
//import com.project.app.service.SystemUserService;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//@Service @RequiredArgsConstructor @Transactional @Slf4j
//public class SystemUserServiceImpl implements SystemUserService {
//    private final BookingRepository bookingRepository;
//
//    private final UserRepository userRepository;
//
//    private final RoleRepository roleRepository;
//
//
//    @Override
//    public SystemUser saveUser(SystemUser systemUser) {
//        log.info("saving new user to the database");
//        return userRepository.save(systemUser);
//    }
//
//    @Override
//    public Roles saveRole(Roles roles) {
//        return roleRepository.save(roles);
//    }
//
//    @Override
//    public void addRoleToUser(String name, String roleName) {
//        SystemUser systemUser = userRepository.findByName(name);
//        Roles roles = roleRepository.findByName(roleName);
//        systemUser.getRoles().add(roles);
//    }
//
//    @Override
//    public SystemUser getSystemUser(String name) {
//
//        return userRepository.findByName(name);
//    }
//
//    @Override
//    public List<SystemUser> getSystemUsers() {
//        return userRepository.findAll();
//    }
//
//}
