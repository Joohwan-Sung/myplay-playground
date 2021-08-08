package com.ss501.myplayplayground.domain.playground.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ss501.myplayplayground.domain.playground.enums.PlaygroundLevelType;
import com.ss501.myplayplayground.domain.playground.enums.PlaygroundType;
import com.ss501.myplayplayground.domain.playground.vo.Address;
import com.ss501.myplayplayground.domain.playground.vo.CorporateMember;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "playground")
public class Playground {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "corporateMember")
	@Embedded
	private CorporateMember corporateMember;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "address")
	@Embedded
	private Address address;
	
	@Column(name = "gpsCoordinates")
	private String gpsCoordinates;
	
	@Column(name = "capacity")
	private Integer capacity;
	
	@Column(name = "startTime")
	private String startTime;
	
	@Column(name = "finishTime")
	private String finishTime;
	
	@Column(name = "priceHour")
	private Long priceHour;
	
	@Column(name = "playgroundType")
	@Enumerated(EnumType.STRING)
	private PlaygroundType playgroundType;
	
	@Column(name = "playgroundLevelType")
	@Enumerated(EnumType.STRING)
	private PlaygroundLevelType playgroundLevelType;
}
