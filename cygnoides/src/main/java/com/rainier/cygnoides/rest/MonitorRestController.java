package com.rainier.cygnoides.rest;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.rainier.cygnoides.entity.WeatherInfo;
import com.rainier.cygnoides.service.monitor.MonitorService;


@Controller
@RequestMapping(value = "/api/v1/monitor")
public class MonitorRestController {
	static long idd = 100000;
	@Autowired
	private MonitorService monitorService;
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<WeatherInfo> monitor() {
		WeatherInfo	wi = monitorService.monitor();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		wi.setMtSampTime(new Date());
		return new ResponseEntity<WeatherInfo>(wi, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/id/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<WeatherInfo> getWeatherInfo(@PathVariable("id") long id) {
		idd++;
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WeatherInfo	wi = monitorService.getWeatherInfo(idd);
		if(wi!=null){
			return new ResponseEntity<WeatherInfo>(wi, HttpStatus.OK);
		}
		return new ResponseEntity<WeatherInfo>(HttpStatus.NOT_FOUND); 
	}	
}
