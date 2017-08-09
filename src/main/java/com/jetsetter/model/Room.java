package com.jetsetter.model;

import java.io.Serializable;
import java.util.Calendar;

/**
 * Created by gim on 8/7/17.
 */
public class Room implements Serializable {
   private int id;
   private int roomTypeId;
   private boolean isBooked;
   private Calendar fromDate;
   private Calendar toDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
