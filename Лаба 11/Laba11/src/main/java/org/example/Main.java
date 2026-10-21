package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

            Vehicle genericVehicle = new Vehicle("Общий транспорт", 2020, 60.0);


            genericVehicle.move();
            genericVehicle.move(150);
            genericVehicle.move("Москва");


            Vehicle myCar = new Car("BMW", 2022, 120.0, 4);
            Vehicle myPlane = new Plane("Boeing 737", 2019, 450.0, 10000.0);


            myCar.move();
            myPlane.move();

             Vehicle[] transportPark = {genericVehicle, myCar, myPlane};

            for (Vehicle v : transportPark) {
                System.out.println("Бренд: " + v.brand + ", Расчетная скорость: " + v.getSpeed() + " км/ч");


                if (v instanceof Car) {
                    System.out.println(" -> Это легковой автомобиль.");
                } else if (v instanceof Plane) {
                    System.out.println(" -> Это воздушное судно.");
                } else {
                    System.out.println(" -> Это базовое транспортное средство.");
                }
            }
    }
}
