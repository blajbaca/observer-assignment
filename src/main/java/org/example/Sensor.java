package org.example;

import java.util.*;

public class Sensor {
    private double reading;
    private Random random=new Random();

    private List<IController> controllers = new ArrayList<IController>();
    public void AddController(IController sensor){
        controllers.add(sensor);
    }
    public void RemoveController(IController sensor){
        controllers.remove(sensor);
    }
    public double getReading() {
        return random.nextDouble(0.0,10000.0);
    }
    public void NotifySubscribers(){
        for (IController controller:controllers) {
            controller.Update(getReading());
        }
    }

}
