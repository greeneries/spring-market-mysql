package app.market.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.market.mapper.FoodMapper;

@Service
public class FoodService {
	
	@Autowired
	private FoodMapper mapper;
	
	
	

}
