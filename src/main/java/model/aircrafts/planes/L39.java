package model.aircrafts.planes;

import model.aircrafts.AirCrafts;

/**
 * Created by Nikita on 03.11.2015.
 */
public class L39 extends AirCrafts {
    private String type;
    private String number;
    private int latitude;
    private int longitude;
    private int altitude;
    private int vector;

    public L39(String number,int latitude,int longitude,int altitude,int vector){
        this.number=number;
        this.latitude=latitude;
        this.longitude=longitude;
        this.altitude=altitude;
        this.vector=vector;
        this.type="L39";
    }
}
