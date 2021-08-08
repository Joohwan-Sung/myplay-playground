package com.ss501.myplayplayground.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.ss501.myplayplayground.domain.playground.entity.Playground;
import com.ss501.myplayplayground.domain.playground.repository.PlaygroundRepository;
import com.ss501.myplayplayground.service.PlaygroundService;


import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PlaygroundServiceImpl implements PlaygroundService{
	PlaygroundRepository playgroundRepository;
	@Transactional
	public Playground savePlayground(Playground playground) {

		Playground newPlayground = playgroundRepository.save(playground);
		//newReservation.callPaymentStart();
		return newPlayground;
	}
	@Override
	public List<Playground> findByCorporateId(Long corporateId) {
		List<Playground> allPlayground = playgroundRepository.findByCorporateMember_CorporateId(corporateId);
		return allPlayground;
	}
	@Override
	public List<Playground> findAllPlayground() {
		// TODO Auto-generated method stub
		return playgroundRepository.findAll();
	}
	
	@Override
	public Playground findById(Long id) {
		Optional<Playground> playground = playgroundRepository.findById(id);
		if(playground.get() == null) {
			return null;
		}else {
			return playground.get();
		}
	}
}
