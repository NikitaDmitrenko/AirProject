package model.aircrafts.helicopters;

import model.aircrafts.AirCrafts;

/**
 * Created by Nikita on 02.11.2015.
 */
public class MI17 extends AirCrafts {
    private String type;
    private String number;
    private int latitude;
    private int longitude;
    private int altitude;
    private int vector;

    public MI17(String number,int latitude,int longitude,int altitude,int vector){
        this.number=number;
        this.latitude=latitude;
        this.longitude=longitude;
        this.altitude=altitude;
        this.vector=vector;
        this.type="MI_17";
    }
}
