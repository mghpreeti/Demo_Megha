package com.feature.service;

import java.util.Collection;

import com.feature.model.Feature;
import com.feature.model.FeatureName;

public interface IServices<T> {
	
Collection<T>findAll();	

 T findById(T id);
 
 T saveOrUpdate(T t);
 


String deleteById(T id);

}
