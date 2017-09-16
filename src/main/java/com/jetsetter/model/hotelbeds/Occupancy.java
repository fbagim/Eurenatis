package com.jetsetter.model.hotelbeds;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class Occupancy implements Serializable {
    @JsonProperty("rooms")
    private  int rooms;
    @JsonProperty("adults")
    private  int adults;
    @JsonProperty("children")
    private  int children;
    @JsonProperty("paxes")
    private List<Pax> paxes;

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getAdults() {
        return adults;
    }

    public void setAdults(int adults) {
        this.adults = adults;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public List<Pax> getPaxes() {
        return paxes;
    }

    public void setPaxes(List<Pax> paxes) {
        this.paxes = paxes;
    }
}
