package com.is.authservice.model.locations;

import lombok.Data;

@Data
public class CountriesDTO {
    private Integer id;
    private String name;

    public CountriesDTO(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}