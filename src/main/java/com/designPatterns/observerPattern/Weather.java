package com.designPatterns.observerPattern;

import java.util.List;
import java.util.Observable;

/**
 * @Description: 气象主题类 2.0实现Observable方式
 * @Author: czl []~(￣▽￣)~*)
 * @Date: 2022/1/19 17:26
 */
public class Weather extends Observable {
    private List<Observer> obsList;
    private float temp;
    private float humidity;
    private float pressure;

    public Weather(){}
    //获取温度
    public float getTemperature(){
        return this.temp;
    }
    //获取湿度
    public float getHumidity(){
        return this.humidity;
    }
    //获取气压
    public float getPressure(){
        return this.pressure;
    }
    public void setMeasurements(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        setChanged();
        notifyObservers();
    }
}
