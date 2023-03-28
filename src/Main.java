import java.util.HashMap;
import java.util.Map;
  
public class Main {
    public static void main(String[] args) {
        BookService service = new BookService();
        Book book = new Book("Xamsa", "Alisher Navoiy", "Azon", "2022.03.11");

        CarService carService = new CarService();
        Car car = new Car("BMW", "X5", "Black", 1100000000D);

        ProductService productService = new ProductService();
        Product product = new Product("CocaCola", 12.000D, "CocaCola", "6-oy");

        StudentService studentService = new StudentService();
        Student student = new Student("Jon", "Doe", "jon@gmail.com", "root");

        UniversityService universityService = new UniversityService();
        University university = new University("Ajou", "South Korean", "IT", "4-Years");

    }
}