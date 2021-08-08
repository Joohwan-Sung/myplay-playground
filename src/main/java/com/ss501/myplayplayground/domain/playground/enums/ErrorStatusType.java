package com.ss501.myplayplayground.domain.playground.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorStatusType {
	SAVE,
	REQUESTED,
	PROGRESSED,
	COMPLETED,
	DELETED
}
