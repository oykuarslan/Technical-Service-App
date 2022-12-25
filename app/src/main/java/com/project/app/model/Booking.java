package com.project.app.model;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "booking")

public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "booking_date")
	@JsonFormat(pattern = "yyyy/MM/dd")
	private Date bookingDate = new Date();
	
	@Column(name = "note")
	private String note;	

	@Column(name = "is_done")
	private boolean isDone;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "system_user_id")
	private SystemUser systemUser;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "service_id")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Service service;	


    }