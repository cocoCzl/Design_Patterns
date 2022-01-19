package com.designPatterns.observerPattern;

/**
 * @Description: 观察者 此布告板根据WeatherData提供的数据，根据气压计显示天气预报
 * @Author: czl []~(￣▽￣)~*)
 * @Date: 2022/1/19 16:33
 */
public class ForecastDisplay implements Observer, DisplayElement{

    private float temp;
    private float humidity;
    private float pressure;

    public ForecastDisplay(Subject subject){
        subject.registerObserver(this);
    }
    @Override
    public void display() {
        //显示天气预报
        System.out.println("<< Forecast >>");
        System.out.println("temp: " + temp);
        System.out.println("humidity: " + humidity);
        System.out.println("pressure: " + pressure);
        System.out.println("<< Forecast End >>");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
