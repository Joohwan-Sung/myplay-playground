package com.ss501.myplayplayground.service;

import java.util.List;

import com.ss501.myplayplayground.domain.playground.entity.Playground;

public interface PlaygroundService {
	public Playground savePlayground(Playground playground);
	public List<Playground> findAllPlayground();
	public List<Playground> findByCorporateId(Long corporateId);
	public Playground findById(Long id);
}
