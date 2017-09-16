package com.jetsetter.model.hotelbeds;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jetsetter.model.AvailabilityRequestData;

import java.util.List;

public class HotelBedsAvailability extends AvailabilityRequestData {
    @JsonProperty("stay")
    private Stay stay;
    @JsonProperty("occupancies")
    private List<Occupancy> occupancies;
    @JsonProperty("filter")
    private Filter filter;
    @JsonProperty("destination")
    private Destination destination;

    public Stay getStay() {
        return stay;
    }

    public void setStay(Stay stay) {
        this.stay = stay;
    }

    public List<Occupancy> getOccupancies() {
        return occupancies;
    }

    public void setOccupancies(List<Occupancy> occupancies) {
        this.occupancies = occupancies;
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }
}
