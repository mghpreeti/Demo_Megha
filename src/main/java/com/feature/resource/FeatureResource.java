package com.feature.resource;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feature.model.Feature;

import com.feature.service.IServices;

@RestController
@RequestMapping("/features")
public class FeatureResource implements IServices {
	@Autowired
	private IServices<Feature> featureService ;
	
	@GetMapping("{id}")
	public Collection<Feature>findAll(){
		return featureService.findAll();
	};	
	
	@GetMapping("{id}")
	public Feature findById(@PathVariable FeatureName id) {
		 return featureService.findById(id);
	};
	
	@PostMapping(consumes =MediaType.APPLICATION_JSON_VALUE) 
	public Feature save(@RequestBody Feature featureAccess) {
		return featureService.saveOrUpdate(featureAccess);
	};

	 
	@DeleteMapping
	public Feature deleteById( @PathVariable int id) {
		return featureService.deleteById(id);
	}

	@Override
	public Object findById(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object saveOrUpdate(Object t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteById(Object id) {
		// TODO Auto-generated method stub
		return null;
	};

}
