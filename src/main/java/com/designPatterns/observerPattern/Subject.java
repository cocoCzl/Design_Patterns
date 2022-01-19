package com.designPatterns.observerPattern;

/**
 * @Description: 主题接口 Subject
 * @Author: czl []~(￣▽￣)~*)
 * @Date: 2022/1/19 15:36
 */
public interface Subject {
   void registerObserver(Observer observer);
   void removeObserver(Observer observer);
   //当主题状态改变时，这个方法会被调用，以通知所有观察者
   void notifyObserver();
}
