package observer;

/**
 * CopyRright (c)2014-2016 Haerbin Hearglobal Co.,Ltd
 * Project: idoc-main
 * Comments:
 * Author:cbam
 * Create Date:2016/11/17
 * Modified By:
 * Modified Date:
 * Modified Reason:
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(90f,100.02f,22f);
        // there we can create our own weather display
        // so it's expandable , users can add or remove
        // as many display elements as they want to the application.
        weatherData.removeObserver(currentConditionsDisplay);
        weatherData.setMeasurements(90f,100.02f,22f);
    }
}
