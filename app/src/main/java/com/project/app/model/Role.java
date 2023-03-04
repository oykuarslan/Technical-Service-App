package com.project.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static javax.persistence.GenerationType.IDENTITY;


@Entity
@Getter
@Setter 
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "roles")
public class Role {
	
	@Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(length = 100)
    private String name;

	
}
