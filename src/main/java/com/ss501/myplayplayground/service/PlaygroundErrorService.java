package com.ss501.myplayplayground.service;

import java.util.List;

import com.ss501.myplayplayground.domain.playground.entity.PlaygroundError;

public interface PlaygroundErrorService {
	List<PlaygroundError> findAllPlaygroundErrorByPlaygroundId(Long id);
}
