package com.jetsetter.model.hotelbeds;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Pax implements Serializable {
    @JsonProperty("type")
    private String type;
    @JsonProperty("age")
    private String age;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
