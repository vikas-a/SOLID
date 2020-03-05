package org.learn.solid.dependency_inversion.good;


public class MobileDevice implements Notifier {
    public void alertWeatherConditions(String weatherConditions) {
        if (weatherConditions == "rainy")
            System.out.print("It is rainy");
    }
}
