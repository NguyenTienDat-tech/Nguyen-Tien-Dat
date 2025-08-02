package Bai3TL;
public class Car {
    private String brand;
    private int maxSpeed;

    public Car(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public void run() {
        System.out.println("xe " + brand + " dang chay voi toc do toi da " + maxSpeed + " km");
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getmaxSpeed() {
        return this.maxSpeed;
    }

    public void setmaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}