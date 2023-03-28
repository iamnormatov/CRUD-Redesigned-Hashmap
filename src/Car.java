public class Car {
    private Integer carId;
    private String carName; 
    private String model;
    private String color;
    private Double price;

    public Car(String carName, String model, String color, Double price) {
        this.carName = carName;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
 
    public String toCar() {
        return "Car{" +
                "carId=" + carId +
                ", carName='" + carName + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
