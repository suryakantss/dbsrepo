package com.dbs.junitpro.service;

import com.dbs.junitapp.service.SkyPaidService;
import com.dbs.junitapp.service.WeatherService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class TestWeatherService {

    @Test
    public void testWeatherService()
    {
        SkyPaidService sk = mock(SkyPaidService.class);
       //stub
       when(sk.getWeather(anyString())).thenReturn("its ...sunny day");
        WeatherService ws = new WeatherService();
        ws.setSkyPaidService(sk);
        Assertions.assertEquals("its ...sunny day",ws.getWeather("Pune"));
        verify(sk,atLeast(1)).getWeather(anyString());

           }
}
