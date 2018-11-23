package app.market.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import app.market.service.FoodTypeService;
import app.market.model.FoodType;

@RestController
public class FoodTypeController {

	@Autowired
	private FoodTypeService foodTypeService;
	
	
	@RequestMapping(value = {"/list"}, 
	method = RequestMethod.GET, 
	produces = { "application/json;charset=utf-8" })
	@ResponseBody
	public List<FoodType> getList() {
		return foodTypeService.getList();
	}
	
	
}
