package com.ss501.myplayplayground.domain.playground.vo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Address {
	@Column(name = "zipcode")
	private Integer zipCode;
	
	@Column(name = "baseaddress")
	private String baseAddress;
	
	@Column(name = "detailaddress")
	private String detailAddress;
}
