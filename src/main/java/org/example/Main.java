package org.example;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Logger logger= Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        double lowerBound=500.00;
        double upperBound=8000.00;

        VHFController vhfController= new VHFController(logger,upperBound);
        WarningController warningController= new WarningController(logger,lowerBound);
        AllTimeController allTimeController= new AllTimeController(logger);

        Sensor sensor= new Sensor();

        sensor.AddController(vhfController);
        sensor.AddController(warningController);
        sensor.AddController(allTimeController);

        while(true){
            sensor.NotifySubscribers();
            Thread.sleep(1000);
        }
    }
}