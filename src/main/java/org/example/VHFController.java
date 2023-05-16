package org.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class VHFController implements IController {
    private Logger logger;
    private double upperBound;
    public VHFController(Logger logger, double upperBound){
        this.logger = logger;
        this.upperBound=upperBound;
    }

    @Override
    public void Update(double sensorReading) {
        if(sensorReading>upperBound){
            logger.log(Level.WARNING,"Sensor reading ("+sensorReading+") is too high! Fix needed!");
        }
    }

}
