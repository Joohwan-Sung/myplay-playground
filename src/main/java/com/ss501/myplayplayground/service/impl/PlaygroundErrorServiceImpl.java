package com.ss501.myplayplayground.service.impl;

import org.springframework.stereotype.Service;

import com.ss501.myplayplayground.domain.playground.entity.PlaygroundError;
import com.ss501.myplayplayground.domain.playground.repository.PlaygroundErrorRepository;
import com.ss501.myplayplayground.service.PlaygroundErrorService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PlaygroundErrorServiceImpl implements PlaygroundErrorService{
	private final PlaygroundErrorRepository playgroundErrorRepository;

	@Override
	public java.util.List<PlaygroundError> findAllPlaygroundErrorByPlaygroundId(Long id) {
		return playgroundErrorRepository.findAllPlaygroundErrorByPlaygroundId(id);
	}
}
