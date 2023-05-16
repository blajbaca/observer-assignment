package org.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class WarningController implements IController {
    private Logger logger;
    private double lowerBound;
    public WarningController(Logger logger, double lowerBound){
        this.logger = logger;
        this.lowerBound=lowerBound;
    }
    @Override
    public void Update(double sensorReading) {
        if(sensorReading<lowerBound){
            logger.log(Level.WARNING,"Sensor reading ("+sensorReading+") is too low! Fix needed!");
        }
    }
}
