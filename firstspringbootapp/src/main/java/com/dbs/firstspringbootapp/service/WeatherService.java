package com.dbs.firstspringbootapp.service;

import org.springframework.stereotype.Service;

@Service
public class WeatherService {
    public String getWeather(String city){
        if(city.equals("Pune"))
            return "It's raining....";
        if(city.equals("Mumbai"))
            return "It's sunny....";
    return null;
    }
}
