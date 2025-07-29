package com.dbs.junitapp.service;


public class WeatherService {
    private SkyPaidService skyPaidService;

    public String getWeather(String city){
        return skyPaidService.getWeather(city);
    }

    public void setSkyPaidService(SkyPaidService skyPaidService) {
        this.skyPaidService = skyPaidService;
    }
}
