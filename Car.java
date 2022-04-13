public class Car extends Main{
    String name;
    String model;
    String brand;
    int year;
    String location;
    

    public Car(String name, String model, String brand, int year, String location){
        this.name = name;
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.location = location;
    }

    public static void travel(Car car1) {
        car1.setLocation("Leyte");
        System.out.println("Name: " + car1.getName() + "\nModel: " + car1.getModel()+ "\nBrand: " +  car1.getBrand()+ "\nYear: " + car1.getYear()+ "\nLcation: " + car1.getLocation());
        
    }
    

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }


    public String getBrand() {
        return brand;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }


    public int getYear() {
        return year;
    }


    public void setYear(int year) {
        this.year = year;
    }


    public String getLocation() {
        return location;
    }


    public void setLocation(String location) {
        this.location = location;
    }









}