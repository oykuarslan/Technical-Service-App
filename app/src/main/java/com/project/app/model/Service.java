package com.project.app.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "service")
public class Service {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="duration")
	private Integer duration;
	
	@Column(name="name")
	private String name;

	@Column(name="desktop")
	private Integer desktop;

	@Column(name="mac")
	private Integer mac;

	@Column(name="laptop")
	private Integer laptop;
	
	
}
