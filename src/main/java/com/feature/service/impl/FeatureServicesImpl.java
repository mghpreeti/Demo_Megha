package com.feature.service.impl;

import java.util.Collection;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.stereotype.Service;

import com.feature.model.Feature;
import com.feature.model.FeatureName;
import com.feature.repository.FeatureRepository;
import com.feature.service.IServices;

@Service
public class FeatureServicesImpl implements IServices {
	private FeatureRepository featureRespository;

	@Override
	public Collection<Feature> findAll() {
		// TODO Auto-generated method stub
		return featureRespository.findAll();
	}


	@Override
	public Object saveOrUpdate(Object t) {
		// TODO Auto-generated method stub
		return featureRespository.saveAndFlush((Feature)t);
	}



	@Override
	public Object findById(Object id) {
		// TODO Auto-generated method stub
		return featureRespository.findById((FeatureName) id);
	}


	@Override
	public String deleteById(Object id) {
		// TODO Auto-generated method stub
		JSONObject jsonObject = new  JSONObject();
		try {
			 featureRespository.deleteById((FeatureName) id);
			 jsonObject.put("message", "enrty deleted sucessfully");
			 
		}
		catch(JSONException e) {
			e.printStackTrace();
		}
		return jsonObject.toString();
	}

}
