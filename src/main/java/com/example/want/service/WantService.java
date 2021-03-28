package com.example.want.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.want.entity.Want;
import com.example.want.repository.WantRepository;

@Service
public class WantService {
	// newしなくても使える
	@Autowired
	private WantRepository wantRepository;

	public List<Want> findAll() {
		return wantRepository.findAll();
	}

	public Want findById(Long id) {
		return wantRepository.findById(id).orElse(null);
	}

	public Want save(Want want) {
		return wantRepository.save(want);
	}

	public void deleteById(Long id) {
		wantRepository.deleteById(id);
	}
}
