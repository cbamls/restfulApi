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
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherDate;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherDate = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
         + "F degrees and "  + humidity + " % humidity" );
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
