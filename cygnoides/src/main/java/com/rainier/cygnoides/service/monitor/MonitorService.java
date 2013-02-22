package com.rainier.cygnoides.service.monitor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.rainier.cygnoides.entity.WeatherInfo;
import com.rainier.cygnoides.repository.WeatherInfoDao;


//Spring Bean的标识.
@Component
//默认将类中的所有public函数纳入事务管理.
@Transactional(readOnly = true)
public class MonitorService {

	private WeatherInfoDao weatherInfoDao;
	
	@Autowired
	public void setWeatherInfoDao(WeatherInfoDao weatherInfoDao) {
		this.weatherInfoDao = weatherInfoDao;
	}
	
	public WeatherInfo monitor(){
		WeatherInfo weatherInfo = new WeatherInfo();
		weatherInfo.setId(200000l);
		weatherInfo.setMtTemp1(30.32);
		return weatherInfo;
	}
	
	@Transactional(readOnly = false)
	public WeatherInfo getWeatherInfo(long id){
		WeatherInfo weatherInfo = weatherInfoDao.findOne(id);
		weatherInfo.setId(id);
		weatherInfo.setMtTemp1(20.32);
		return weatherInfo;
	}
}
