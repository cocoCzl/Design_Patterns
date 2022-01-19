package com.designPatterns.observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 气象主题类
 * @Author: czl []~(￣▽￣)~*)
 * @Date: 2022/1/19 16:20
 */
public class WeatherData implements Subject{

    private List<Observer> obsList;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData(){
        obsList = new ArrayList<>();
    }
    //注册观察者
    @Override
    public void registerObserver(Observer observer) {
        obsList.add(observer);
    }

    //移除观察者
    @Override
    public void removeObserver(Observer observer) {
        obsList.remove(observer);
    }

    //改变状态时更新所有观察者
    @Override
    public void notifyObserver() {
        for (Observer observer : obsList){
            //主题利用观察者接口通知观察者
            observer.update(temp,humidity,pressure);
        }
    }

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
    //数据改变
    void measurementsChanged(){
        notifyObserver();
    }
    public void setMeasurements(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
