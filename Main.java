class vehicle {
    public void start() {
        System.out.println("starting the vehicle");
    }

    public void accelerate() {
        System.out.println("Accelerate");
    }
}

class Car extends vehicle {
    public void start() {
        System.out.println("starting the car");
    }
}

class Bicycle extends vehicle {
    public void start() {
        System.out.print("starting the bicycle");
    }

    public void ride() {
        System.out.println("ride the bicycle");

    }

    interface plane {
        void printflight();
    }

}

class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        car.start();
        car.accelerate();
        bicycle.ride();
        bicycle.start();

    }
}
