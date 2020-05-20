package service;

import exceptions.IncorrectCityNameException;
import model.Weather;

import static service.ApiConstants.CITY_REGEX;

public interface WeatherService {

    String getByCityName(String city);

    default void validateCityName(String city) {

//        if(!city.matches(CITY_REGEX)) {
//            throw new IncorrectCityNameException(String.format("Incorrect city name %s", city));
//        }
    }

}
