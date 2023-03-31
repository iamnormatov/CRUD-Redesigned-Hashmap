import java.util.HashMap;
import java.util.Map;  

public class CarService {
    private Map<Integer, Car> carMap;
    private Integer carIndex;
    public CarService(){ 
        this.carMap = new HashMap<>();
        this.carIndex = 0;
    } 

    public String createCar(Integer carId, Car car){
        if (carId == null){
            return "Error Id";
        }
        car.setCarId(++this.carIndex);
        this.carMap.put(carId, car);
        return "Car successful created";
    }

    public String getCar(Integer carId){
        if (this.carMap.containsKey(carId)){
            return this.carMap.get(carId).toCar();
        }
        return "Car is not found";
    }

    public String updateCar(Integer carId, Car car){
        Integer carOn;
        if (this.carMap.containsKey(carId)){
            carOn = this.carMap.get(carId).getCarId();
            car.setCarId(carOn);
            this.carMap.replace(carId, this.carMap.get(carId), car);
            return "Car successful updated";
        }
        return "Car is not found";
    }

    public String deleteCar(Integer carId){
        if (this.carMap.containsKey(carId)){
            if (this.carMap.remove(carId, this.carMap.get(carId))){
                return "Car successfull deleted";
            }
        }
        return "Car is not found";
    }
}
