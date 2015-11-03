package Dispatchers;

import model.aircrafts.AirCrafts;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nikita on 03.11.2015.
 */
public class DispathersCenter {
    private List<AirCrafts> airCraftses = new ArrayList<AirCrafts>();
    private String name;
    public DispathersCenter(String name){
        this.name = name;
    }
    public void addAirCraft(AirCrafts obj){
        airCraftses.add(obj);
    }
}
