package app.market.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.market.mapper.FoodTypeMapper;
import app.market.model.FoodType;
import app.market.model.FoodTypeExample;

@Service
public class FoodTypeService {

	@Autowired
	private FoodTypeMapper mapper;
	
	public List<FoodType> getList() {
		FoodTypeExample example = new FoodTypeExample();
		return mapper.selectByExample(example);
	}
	
}
