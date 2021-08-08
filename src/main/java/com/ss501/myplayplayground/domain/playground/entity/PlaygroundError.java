package com.ss501.myplayplayground.domain.playground.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ss501.myplayplayground.domain.playground.enums.ErrorStatusType;
import com.ss501.myplayplayground.domain.playground.vo.PersonalMember;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "playgrounderror")
public class PlaygroundError {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "playground_id")
	private Playground playground;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "problem")
	private String problem;
	
	@Column(name = "solve")
	private String solve;
	
	@Column(name = "writer")
	@Embedded
	private PersonalMember writer;
	
	@Column(name = "createDateTime")
	private Date createDateTime;
	
	@Column(name = "solveDateTime")
	private Date solveDateTime;
	
	@Column(name = "errorStatusType")
	private ErrorStatusType errorStatusType;
}
