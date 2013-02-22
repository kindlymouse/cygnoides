package com.rainier.cygnoides.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonFormat;

//JPA标识
@Entity
@Table(name = "cyg_weather_info")
public class WeatherInfo extends IdEntity{

	private int mtStationId;
	private Date mtSampTime;	
	private Date mtStartOfDay;
	private double mtWindSpeedAv;
	private double mtWindSpeedMx;
	private double mtWindSpeedMn;
	private double mtRawWindDir;
	private double mtAdjWindDirAv;
	private double mtAdjWindDirMx;
	private double mtAdjWindDirMn;
	private double mt_3secRollAvgWindSpeed;
	private double mt_3secRollAvgWindDir;
	private double mt_2minRollAvgWindSpeed;
	private double mt_2minRollAvgWindDir;	
	private double mt_10minRollAvgWindSpeed;
	private double mt_10minRollAvgWindDir;
	private double mt_10minWindGustDir;
	private double mt_10minWindGustSpeed;
	private Date mt_10minWindGustTime;
	private double mt_60minWindGustDir;
	private double mt_60minWindGustSpeed;
	private Date mt_60minWindGustTime;
	private double mtTemp1;
	private double mtRelHumidity;
	private double mtWindChill;
	private double mtHeatIndex;
	private double mtDewPoint;
	private double mtDegreeDay;
	private double mtAvgTempToday;
	private Date mtDegreeDayStart;
	private double mtRawBaromPress;
	private double mtAdjBaromPress;
	private double mtDensityAltitude;
	private double mtWetBulbGlobeTemp;
	private double mtWetBulbTemp;
	private double mtSaturatedVaporPressure;
	private double mtVaporPressure;
	private double mtDryAirPressure;
	private double mtDryAirDensity;
	private double mtWetAirDensity;
	private double mtAbsoluteHumidity;
	private double mtAirDensityRatio;
	private double mtAdjustedAltitude;
	private double mtSaeCorrectionFactor;
	private double mtRainToday;
	private double mtRainThisWeek;
	private double mtRainThisMonth;
	private double mtRainThisYear;
	private double mtRainRate;
	private double mtHailToday;
	private double mtHailRate;
	
	
	public int getMtStationId() {
		return mtStationId;
	}
	public void setMtStationId(int mtStationId) {
		this.mtStationId = mtStationId;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
	public Date getMtSampTime() {
		return mtSampTime;
	}
	public void setMtSampTime(Date mtSampTime) {
		this.mtSampTime = mtSampTime;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
	public Date getMtStartOfDay() {
		return mtStartOfDay;
	}
	public void setMtStartOfDay(Date mtStartOfDay) {
		this.mtStartOfDay = mtStartOfDay;
	}
	public double getMtWindSpeedAv() {
		return mtWindSpeedAv;
	}
	public void setMtWindSpeedAv(double mtWindSpeedAv) {
		this.mtWindSpeedAv = mtWindSpeedAv;
	}
	public double getMtWindSpeedMx() {
		return mtWindSpeedMx;
	}
	public void setMtWindSpeedMx(double mtWindSpeedMx) {
		this.mtWindSpeedMx = mtWindSpeedMx;
	}
	public double getMtWindSpeedMn() {
		return mtWindSpeedMn;
	}
	public void setMtWindSpeedMn(double mtWindSpeedMn) {
		this.mtWindSpeedMn = mtWindSpeedMn;
	}
	public double getMtRawWindDir() {
		return mtRawWindDir;
	}
	public void setMtRawWindDir(double mtRawWindDir) {
		this.mtRawWindDir = mtRawWindDir;
	}
	public double getMtAdjWindDirAv() {
		return mtAdjWindDirAv;
	}
	public void setMtAdjWindDirAv(double mtAdjWindDirAv) {
		this.mtAdjWindDirAv = mtAdjWindDirAv;
	}
	public double getMtAdjWindDirMx() {
		return mtAdjWindDirMx;
	}
	public void setMtAdjWindDirMx(double mtAdjWindDirMx) {
		this.mtAdjWindDirMx = mtAdjWindDirMx;
	}
	public double getMtAdjWindDirMn() {
		return mtAdjWindDirMn;
	}
	public void setMtAdjWindDirMn(double mtAdjWindDirMn) {
		this.mtAdjWindDirMn = mtAdjWindDirMn;
	}
	
	public double getMt_3secRollAvgWindSpeed() {
		return mt_3secRollAvgWindSpeed;
	}
	public void setMt_3secRollAvgWindSpeed(double mt_3secRollAvgWindSpeed) {
		this.mt_3secRollAvgWindSpeed = mt_3secRollAvgWindSpeed;
	}
	public double getMt_3secRollAvgWindDir() {
		return mt_3secRollAvgWindDir;
	}
	public void setMt_3secRollAvgWindDir(double mt_3secRollAvgWindDir) {
		this.mt_3secRollAvgWindDir = mt_3secRollAvgWindDir;
	}
	
	public double getMt_2minRollAvgWindSpeed() {
		return mt_2minRollAvgWindSpeed;
	}
	public void setMt_2minRollAvgWindSpeed(double mt_2minRollAvgWindSpeed) {
		this.mt_2minRollAvgWindSpeed = mt_2minRollAvgWindSpeed;
	}
	
	public double getMt_2minRollAvgWindDir() {
		return mt_2minRollAvgWindDir;
	}
	public void setMt_2minRollAvgWindDir(double mt_2minRollAvgWindDir) {
		this.mt_2minRollAvgWindDir = mt_2minRollAvgWindDir;
	}
	public double getMt_10minRollAvgWindSpeed() {
		return mt_10minRollAvgWindSpeed;
	}
	public void setMt_10minRollAvgWindSpeed(double mt_10minRollAvgWindSpeed) {
		this.mt_10minRollAvgWindSpeed = mt_10minRollAvgWindSpeed;
	}
	public double getMt_10minRollAvgWindDir() {
		return mt_10minRollAvgWindDir;
	}
	public void setMt_10minRollAvgWindDir(double mt_10minRollAvgWindDir) {
		this.mt_10minRollAvgWindDir = mt_10minRollAvgWindDir;
	}
	public double getMt_10minWindGustDir() {
		return mt_10minWindGustDir;
	}
	public void setMt_10minWindGustDir(double mt_10minWindGustDir) {
		this.mt_10minWindGustDir = mt_10minWindGustDir;
	}
	public double getMt_10minWindGustSpeed() {
		return mt_10minWindGustSpeed;
	}
	public void setMt_10minWindGustSpeed(double mt_10minWindGustSpeed) {
		this.mt_10minWindGustSpeed = mt_10minWindGustSpeed;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
	public Date getMt_10minWindGustTime() {
		return mt_10minWindGustTime;
	}
	public void setMt_10minWindGustTime(Date mt_10minWindGustTime) {
		this.mt_10minWindGustTime = mt_10minWindGustTime;
	}
	public double getMt_60minWindGustDir() {
		return mt_60minWindGustDir;
	}
	public void setMt_60minWindGustDir(double mt_60minWindGustDir) {
		this.mt_60minWindGustDir = mt_60minWindGustDir;
	}
	public double getMt_60minWindGustSpeed() {
		return mt_60minWindGustSpeed;
	}
	public void setMt_60minWindGustSpeed(double mt_60minWindGustSpeed) {
		this.mt_60minWindGustSpeed = mt_60minWindGustSpeed;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
	public Date getMt_60minWindGustTime() {
		return mt_60minWindGustTime;
	}
	public void setMt_60minWindGustTime(Date mt_60minWindGustTime) {
		this.mt_60minWindGustTime = mt_60minWindGustTime;
	}
	public double getMtTemp1() {
		return mtTemp1;
	}
	public void setMtTemp1(double mtTemp1) {
		this.mtTemp1 = mtTemp1;
	}
	public double getMtRelHumidity() {
		return mtRelHumidity;
	}
	public void setMtRelHumidity(double mtRelHumidity) {
		this.mtRelHumidity = mtRelHumidity;
	}
	public double getMtWindChill() {
		return mtWindChill;
	}
	public void setMtWindChill(double mtWindChill) {
		this.mtWindChill = mtWindChill;
	}
	public double getMtHeatIndex() {
		return mtHeatIndex;
	}
	public void setMtHeatIndex(double mtHeatIndex) {
		this.mtHeatIndex = mtHeatIndex;
	}
	public double getMtDewPoint() {
		return mtDewPoint;
	}
	public void setMtDewPoint(double mtDewPoint) {
		this.mtDewPoint = mtDewPoint;
	}
	public double getMtDegreeDay() {
		return mtDegreeDay;
	}
	public void setMtDegreeDay(double mtDegreeDay) {
		this.mtDegreeDay = mtDegreeDay;
	}
	public double getMtAvgTempToday() {
		return mtAvgTempToday;
	}
	public void setMtAvgTempToday(double mtAvgTempToday) {
		this.mtAvgTempToday = mtAvgTempToday;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
	public Date getMtDegreeDayStart() {
		return mtDegreeDayStart;
	}
	public void setMtDegreeDayStart(Date mtDegreeDayStart) {
		this.mtDegreeDayStart = mtDegreeDayStart;
	}
	public double getMtRawBaromPress() {
		return mtRawBaromPress;
	}
	public void setMtRawBaromPress(double mtRawBaromPress) {
		this.mtRawBaromPress = mtRawBaromPress;
	}
	public double getMtAdjBaromPress() {
		return mtAdjBaromPress;
	}
	public void setMtAdjBaromPress(double mtAdjBaromPress) {
		this.mtAdjBaromPress = mtAdjBaromPress;
	}
	public double getMtDensityAltitude() {
		return mtDensityAltitude;
	}
	public void setMtDensityAltitude(double mtDensityAltitude) {
		this.mtDensityAltitude = mtDensityAltitude;
	}
	public double getMtWetBulbGlobeTemp() {
		return mtWetBulbGlobeTemp;
	}
	public void setMtWetBulbGlobeTemp(double mtWetBulbGlobeTemp) {
		this.mtWetBulbGlobeTemp = mtWetBulbGlobeTemp;
	}
	public double getMtWetBulbTemp() {
		return mtWetBulbTemp;
	}
	public void setMtWetBulbTemp(double mtWetBulbTemp) {
		this.mtWetBulbTemp = mtWetBulbTemp;
	}
	public double getMtSaturatedVaporPressure() {
		return mtSaturatedVaporPressure;
	}
	public void setMtSaturatedVaporPressure(double mtSaturatedVaporPressure) {
		this.mtSaturatedVaporPressure = mtSaturatedVaporPressure;
	}
	public double getMtVaporPressure() {
		return mtVaporPressure;
	}
	public void setMtVaporPressure(double mtVaporPressure) {
		this.mtVaporPressure = mtVaporPressure;
	}
	public double getMtDryAirPressure() {
		return mtDryAirPressure;
	}
	public void setMtDryAirPressure(double mtDryAirPressure) {
		this.mtDryAirPressure = mtDryAirPressure;
	}
	public double getMtDryAirDensity() {
		return mtDryAirDensity;
	}
	public void setMtDryAirDensity(double mtDryAirDensity) {
		this.mtDryAirDensity = mtDryAirDensity;
	}
	public double getMtWetAirDensity() {
		return mtWetAirDensity;
	}
	public void setMtWetAirDensity(double mtWetAirDensity) {
		this.mtWetAirDensity = mtWetAirDensity;
	}
	public double getMtAbsoluteHumidity() {
		return mtAbsoluteHumidity;
	}
	public void setMtAbsoluteHumidity(double mtAbsoluteHumidity) {
		this.mtAbsoluteHumidity = mtAbsoluteHumidity;
	}
	public double getMtAirDensityRatio() {
		return mtAirDensityRatio;
	}
	public void setMtAirDensityRatio(double mtAirDensityRatio) {
		this.mtAirDensityRatio = mtAirDensityRatio;
	}
	public double getMtAdjustedAltitude() {
		return mtAdjustedAltitude;
	}
	public void setMtAdjustedAltitude(double mtAdjustedAltitude) {
		this.mtAdjustedAltitude = mtAdjustedAltitude;
	}
	public double getMtSaeCorrectionFactor() {
		return mtSaeCorrectionFactor;
	}
	public void setMtSaeCorrectionFactor(double mtSaeCorrectionFactor) {
		this.mtSaeCorrectionFactor = mtSaeCorrectionFactor;
	}
	public double getMtRainToday() {
		return mtRainToday;
	}
	public void setMtRainToday(double mtRainToday) {
		this.mtRainToday = mtRainToday;
	}
	public double getMtRainThisWeek() {
		return mtRainThisWeek;
	}
	public void setMtRainThisWeek(double mtRainThisWeek) {
		this.mtRainThisWeek = mtRainThisWeek;
	}
	public double getMtRainThisMonth() {
		return mtRainThisMonth;
	}
	public void setMtRainThisMonth(double mtRainThisMonth) {
		this.mtRainThisMonth = mtRainThisMonth;
	}
	public double getMtRainThisYear() {
		return mtRainThisYear;
	}
	public void setMtRainThisYear(double mtRainThisYear) {
		this.mtRainThisYear = mtRainThisYear;
	}
	public double getMtRainRate() {
		return mtRainRate;
	}
	public void setMtRainRate(double mtRainRate) {
		this.mtRainRate = mtRainRate;
	}
	public double getMtHailToday() {
		return mtHailToday;
	}
	public void setMtHailToday(double mtHailToday) {
		this.mtHailToday = mtHailToday;
	}
	public double getMtHailRate() {
		return mtHailRate;
	}
	public void setMtHailRate(double mtHailRate) {
		this.mtHailRate = mtHailRate;
	}

	
}
