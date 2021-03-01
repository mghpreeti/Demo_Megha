package com.feature.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.feature.model.*;

@Repository
public interface FeatureRepository extends JpaRepository<Feature, FeatureName> {

}
