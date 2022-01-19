package com.designPatterns.observerPattern;

/**
 * @Description: 观察者 此布告板根据WeatherData显示当前观测值
 * @Author: czl []~(￣▽￣)~*)
 * @Date: 2022/1/19 16:28
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement{

    private float temp;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplay(Subject subject){
        //观察者利用主题的接口向主题注册自己
        subject.registerObserver(this);
    }
    @Override
    public void display() {
        //显示当前观测值
        System.out.println("<< Current Conditions >>");
        System.out.println("temp: " + temp);
        System.out.println("humidity: " + humidity);
        System.out.println("pressure: " + pressure);
        System.out.println("<< Current Conditions End >>");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
