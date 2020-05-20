package service;

public final class ApiConstants {

    public static final String CITY_REGEX = "^[a-zA-Z]+(?:[\\s-][a-zA-Z]+)*$";
    public static final String GET_WEATHER_BY_CITY_URL = "https://api.weatherbit.io/v2.0/current?city=";
    public static final String API_KEY_PARAM = "&key=d47c7ff464654f05b8cf2fdad64aeb5e";
    public static final int OK_STATUS_CODE = 200;
    public static final int NOT_FOUND_STATUS_CODE = 404;


    private ApiConstants () {
    }

}
