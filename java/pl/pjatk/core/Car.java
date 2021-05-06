package pl.pjatk.core;

public class Car {

        private String brand;

        public Car(int year, String model)
        {
            this.brand = model;
        }

        public String getBrand()
        {
            return brand;
        }

        public void setBrand(String brand)
        {
            this.brand = brand;
        }
}
