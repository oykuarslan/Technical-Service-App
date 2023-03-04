package com.project.app.model;

import java.util.*;

import javax.persistence.*;

import lombok.*;

import static javax.persistence.GenerationType.IDENTITY;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "system_user")
public class SystemUser {
	
	@Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(name = "name", length = 100)
    private String username;

    @Column(name= "email", unique = true, nullable = false, length = 200)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;
    
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "system_user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "roles_id", referencedColumnName = "id"))
    private List<Role> roles = new ArrayList<>();
}
