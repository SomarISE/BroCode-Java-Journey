import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {

    
        Car car1 = new Car("Tesla", "Model 3", 2024, 40000);
        Car car2 = new Car(car1); // Deep copy
        Car car3 = car1;          // Reference (Pointer) copy

        car1.setPrice(10); 

        System.out.println(car2.getPrice()); 
        System.out.println(car3.getPrice()); 



        



       
    }
}