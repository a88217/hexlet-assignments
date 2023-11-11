package exercise;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.SneakyThrows;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

// BEGIN
public class App {

    public static void save(Path filePath, Car car) throws IOException {
        Files.write(filePath, car.serialize().getBytes());
    }


    public static Car extract(Path jsonCar) throws IOException {
        String json = Files.readString(jsonCar);
        return Car.unserialize(json);
    }
}
// END