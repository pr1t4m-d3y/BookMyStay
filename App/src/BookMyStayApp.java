public class BookMyStayApp {

    public static void main(String[] args) {
        int singleRoomAvailable = 5;
        int doubleRoomAvailable = 3;
        int suiteRoomAvailable = 2;

        Room single = new SingleRoom();
        Room doubleR = new DoubleRoom();
        Room suite = new SuiteRoom();

        System.out.println("Single Room:");
        single.displayRoomDetails();
        System.out.println("Available: " + singleRoomAvailable);
        System.out.println();

        System.out.println("Double Room:");
        doubleR.displayRoomDetails();
        System.out.println("Available: " + doubleRoomAvailable);
        System.out.println();

        System.out.println("Suite Room:");
        suite.displayRoomDetails();
        System.out.println("Available: " + suiteRoomAvailable);
    }
}

abstract class Room {
    protected int numberOfBeds;
    protected int squareFeet;
    protected double pricePerNight;

    public Room(int numberOfBeds, int squareFeet, double pricePerNight) {
        this.numberOfBeds = numberOfBeds;
        this.squareFeet = squareFeet;
        this.pricePerNight = pricePerNight;
    }

    public void displayRoomDetails() {
        System.out.println("Beds: " + numberOfBeds);
        System.out.println("Size: " + squareFeet + " sqft");
        System.out.println("Price per night: " + pricePerNight);
    }
}

class SingleRoom extends Room {
    public SingleRoom() { super(1, 250, 1500.0); }
}

class DoubleRoom extends Room {
    public DoubleRoom() { super(2, 400, 2500.0); }
}

class SuiteRoom extends Room {
    public SuiteRoom() { super(3, 750, 5000.0); }
}
