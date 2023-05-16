package org.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AllTimeController implements IController {
    private Logger logger;
    public AllTimeController(Logger logger){
        this.logger = logger;

    }
    @Override
    public void Update(double sensorReading) {
        if(sensorReading!=0){
            logger.log(Level.INFO,"Sensor reading ("+sensorReading+") is fine, everything is normal.");
        }
    }
}
