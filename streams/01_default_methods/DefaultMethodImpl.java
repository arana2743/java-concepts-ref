class DefaultMethodImpl {
    public static void main(String[] args) {
        // create a Car object
        Vehicle car1 = new Car();
        car1.startVehicle();
        // the child class car didn't have to override the default method of interface
        car1.cleanVehicle();
    }
}

// class implementing the Vehicle interface
class Car implements Vehicle {
    @Override
    public void cleanVehicle() {
        System.out.println("Cleaning the Car.");
    }
}

// Vehicle Interface with default method
interface Vehicle {
    // absrtact method
    void cleanVehicle();

    // default method
    default void startVehicle(){
        System.out.println("Starting the vehicle.");
    }
}