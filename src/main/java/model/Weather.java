package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Weather {

    private String city_name;
    private String country_code;
    private double temp;

    @Override
    public String toString() {
        return
                "city_name='" + city_name + '\'' +
                ", country_code='" + country_code + '\'' +
                ", temp=" + temp
               ;
    }
}

