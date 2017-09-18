package com.hxl.entity;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

@XmlRootElement(name="weather")
public class Pojo implements Serializable {
    /**
     *
     */
    private String stationID;
    private String observeDate;
    private String averTemperature;
    private String highestTemperature;
    private String lowestTempreature;
    private String rainfall;
    private String sunshineDuration;
    private String atmoPressure;
    private String averWindSpeed;
    private String relativeHumidity;
    private String minRelaHumidity;
    private String groundTemperature;
    private String maxWindDirection;
    private String maxWindSpeed;
    private String highestWindDirection;
    private String highestWindSpeed;
    private String averWaterVaporPressure;
    private String highestPressure;
    private String lowestPressure;
    private String averPressure;
    private String ttoERainfall;
    private String etoTRainfall;
    private String largeEvaporation;
    private String smallEvaporation;
    private String averGroundTemperature;
    private String highestGroundTemperature;
    private String lowestGroundTemperature;
    public Pojo() {
    }

    public Pojo(String stationID, String observeDate, String averTemperature, String highestTemperature, String lowestTempreature, String rainfall, String sunshineDuration, String atmoPressure, String averWindSpeed, String relativeHumidity, String minRelaHumidity, String groundTemperature, String maxWindDirection, String maxWindSpeed, String highestWindDirection, String highestWindSpeed, String averWaterVaporPressure, String highestPressure, String lowestPressure, String averPressure, String ttoERainfall, String etoTRainfall, String largeEvaporation, String smallEvaporation, String averGroundTemperature, String highestGroundTemperature, String lowestGroundTemperature) {
        this.stationID = stationID;
        this.observeDate = observeDate;
        this.averTemperature = averTemperature;
        this.highestTemperature = highestTemperature;
        this.lowestTempreature = lowestTempreature;
        this.rainfall = rainfall;
        this.sunshineDuration = sunshineDuration;
        this.atmoPressure = atmoPressure;
        this.averWindSpeed = averWindSpeed;
        this.relativeHumidity = relativeHumidity;
        this.minRelaHumidity = minRelaHumidity;
        this.groundTemperature = groundTemperature;
        this.maxWindDirection = maxWindDirection;
        this.maxWindSpeed = maxWindSpeed;
        this.highestWindDirection = highestWindDirection;
        this.highestWindSpeed = highestWindSpeed;
        this.averWaterVaporPressure = averWaterVaporPressure;
        this.highestPressure = highestPressure;
        this.lowestPressure = lowestPressure;
        this.averPressure = averPressure;
        this.ttoERainfall = ttoERainfall;
        this.etoTRainfall = etoTRainfall;
        this.largeEvaporation = largeEvaporation;
        this.smallEvaporation = smallEvaporation;
        this.averGroundTemperature = averGroundTemperature;
        this.highestGroundTemperature = highestGroundTemperature;
        this.lowestGroundTemperature = lowestGroundTemperature;
    }

    public String getStationID() {
        return stationID;
    }

    public void setStationID(String stationID) {
        this.stationID = stationID;
    }

    public String getObserveDate() {
        return observeDate;
    }

    public void setObserveDate(String observeDate) {
        this.observeDate = observeDate;
    }

    public String getAverTemperature() {
        return averTemperature;
    }

    public void setAverTemperature(String averTemperature) {
        this.averTemperature = averTemperature;
    }

    public String getHighestTemperature() {
        return highestTemperature;
    }

    public void setHighestTemperature(String highestTemperature) {
        this.highestTemperature = highestTemperature;
    }

    public String getLowestTempreature() {
        return lowestTempreature;
    }

    public void setLowestTempreature(String lowestTempreature) {
        this.lowestTempreature = lowestTempreature;
    }

    public String getRainfall() {
        return rainfall;
    }

    public void setRainfall(String rainfall) {
        this.rainfall = rainfall;
    }

    public String getSunshineDuration() {
        return sunshineDuration;
    }

    public void setSunshineDuration(String sunshineDuration) {
        this.sunshineDuration = sunshineDuration;
    }

    public String getAtmoPressure() {
        return atmoPressure;
    }

    public void setAtmoPressure(String atmoPressure) {
        this.atmoPressure = atmoPressure;
    }

    public String getAverWindSpeed() {
        return averWindSpeed;
    }

    public void setAverWindSpeed(String averWindSpeed) {
        this.averWindSpeed = averWindSpeed;
    }

    public String getRelativeHumidity() {
        return relativeHumidity;
    }

    public void setRelativeHumidity(String relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    public String getMinRelaHumidity() {
        return minRelaHumidity;
    }

    public void setMinRelaHumidity(String minRelaHumidity) {
        this.minRelaHumidity = minRelaHumidity;
    }

    public String getGroundTemperature() {
        return groundTemperature;
    }

    public void setGroundTemperature(String groundTemperature) {
        this.groundTemperature = groundTemperature;
    }

    public String getMaxWindDirection() {
        return maxWindDirection;
    }

    public void setMaxWindDirection(String maxWindDirection) {
        this.maxWindDirection = maxWindDirection;
    }

    public String getMaxWindSpeed() {
        return maxWindSpeed;
    }

    public void setMaxWindSpeed(String maxWindSpeed) {
        this.maxWindSpeed = maxWindSpeed;
    }

    public String getHighestWindDirection() {
        return highestWindDirection;
    }

    public void setHighestWindDirection(String highestWindDirection) {
        this.highestWindDirection = highestWindDirection;
    }

    public String getHighestWindSpeed() {
        return highestWindSpeed;
    }

    public void setHighestWindSpeed(String highestWindSpeed) {
        this.highestWindSpeed = highestWindSpeed;
    }

    public String getAverWaterVaporPressure() {
        return averWaterVaporPressure;
    }

    public void setAverWaterVaporPressure(String averWaterVaporPressure) {
        this.averWaterVaporPressure = averWaterVaporPressure;
    }

    public String getHighestPressure() {
        return highestPressure;
    }

    public void setHighestPressure(String highestPressure) {
        this.highestPressure = highestPressure;
    }

    public String getLowestPressure() {
        return lowestPressure;
    }

    public void setLowestPressure(String lowestPressure) {
        this.lowestPressure = lowestPressure;
    }

    public String getAverPressure() {
        return averPressure;
    }

    public void setAverPressure(String averPressure) {
        this.averPressure = averPressure;
    }

    public String getTtoERainfall() {
        return ttoERainfall;
    }

    public void setTtoERainfall(String ttoERainfall) {
        this.ttoERainfall = ttoERainfall;
    }

    public String getEtoTRainfall() {
        return etoTRainfall;
    }

    public void setEtoTRainfall(String etoTRainfall) {
        this.etoTRainfall = etoTRainfall;
    }

    public String getLargeEvaporation() {
        return largeEvaporation;
    }

    public void setLargeEvaporation(String largeEvaporation) {
        this.largeEvaporation = largeEvaporation;
    }

    public String getSmallEvaporation() {
        return smallEvaporation;
    }

    public void setSmallEvaporation(String smallEvaporation) {
        this.smallEvaporation = smallEvaporation;
    }

    public String getAverGroundTemperature() {
        return averGroundTemperature;
    }

    public void setAverGroundTemperature(String averGroundTemperature) {
        this.averGroundTemperature = averGroundTemperature;
    }

    public String getHighestGroundTemperature() {
        return highestGroundTemperature;
    }

    public void setHighestGroundTemperature(String highestGroundTemperature) {
        this.highestGroundTemperature = highestGroundTemperature;
    }

    public String getLowestGroundTemperature() {
        return lowestGroundTemperature;
    }

    public void setLowestGroundTemperature(String lowestGroundTemperature) {
        this.lowestGroundTemperature = lowestGroundTemperature;
    }
}
