package com.ss501.myplayplayground.domain.playground.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ss501.myplayplayground.domain.playground.entity.PlaygroundError;

@Repository
public interface PlaygroundErrorRepository extends JpaRepository<PlaygroundError, Long>{
	List<PlaygroundError> findAllPlaygroundErrorByPlaygroundId(Long id);
}
