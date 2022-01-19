package com.designPatterns.observerPattern;

import java.util.Observable;
import java.util.Observer;
import org.junit.Test;

/**
 * @Description: 观察者模式 Observer Pattern
 * 主题+观察者
 * 主题是真正拥有数据的人，观察者是主题的依赖者，在数据变化时更新，这样比起让许多对象控制同一份数据来，可以得到更干净的OO设计
 * @Author: czl []~(￣▽￣)~*)
 * @Date: 2022/1/19 15:36
 */
public class ObserverPattern {
    @Test
    public void testWeatherData(){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(60,45,10.4f);
        weatherData.setMeasurements(100,55,20.4f);
    }

    @Test
    public void testWeather(){
        Weather weather = new Weather();
        ConditionsDisplay conditionsDisplay = new ConditionsDisplay(weather);
        weather.setMeasurements(80,65,30.4f);
    }
}
