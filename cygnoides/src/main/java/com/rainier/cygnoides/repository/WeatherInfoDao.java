package com.rainier.cygnoides.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.rainier.cygnoides.entity.WeatherInfo;

public interface WeatherInfoDao extends PagingAndSortingRepository<WeatherInfo, Long>,JpaSpecificationExecutor<WeatherInfo> {
	
}
