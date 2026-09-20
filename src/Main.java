import factorymethod.ShipFactory;
import factorymethod.TransportFactory;
import factorymethod.TruckFactory;

public class Main {
    public static void main(String[] args) {

        System.out.println("Factory Method:");

        TransportFactory truckFactory = new TruckFactory();
        truckFactory.deliverTransport();

        TransportFactory shipFactory = new ShipFactory();
        shipFactory.deliverTransport();

    }
    }
