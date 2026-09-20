package factorymethod;

public abstract class TransportFactory {

    public abstract Transport createTransport();

    public void deliverTransport() {
        Transport transport = createTransport();
        transport.deliver();
    }
}