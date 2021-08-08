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
public class PersonalMember {
	@Column(name = "personaId")
	private Long personalId;
	
	@Column(name = "name")
	private String name;
}
