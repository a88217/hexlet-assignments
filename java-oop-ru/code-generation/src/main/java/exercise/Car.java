package exercise;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.SneakyThrows;
import lombok.Value;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

// BEGIN
@Value
// END
class Car {
    int id;
    String brand;
    String model;
    String color;
    User owner;

    // BEGIN


    public String serialize() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonCar = mapper.writeValueAsString(this);
        return jsonCar;
    }



    public static Car unserialize(String serializedCar) throws IOException {
        Car car = new ObjectMapper().readValue(serializedCar, Car.class);
        return car;
    }
    // END
}