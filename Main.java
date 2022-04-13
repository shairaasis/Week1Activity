public class Main {


    public static void main(String[] args) {
        Car car1 = new Car("Tesla Model Y", "Model Y", "Tesla", 2022, "Cebu");
        System.out.println("\n*Initial Location*");
        System.out.println("Name: " + car1.getName() + "\nModel: " + car1.getModel()+ "\nBrand: " +  car1.getBrand()+ "\nYear: " + car1.getYear()+ "\nLcation: " + car1.getLocation());
        System.out.println("\n*After Travelling*");
        //Call travel method and pass the object
        Car.travel(car1);
    }
    
}
