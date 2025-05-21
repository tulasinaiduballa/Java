package Day_7;

class DeviceFailureException extends Exception {
    public DeviceFailureException(String message) {
        super(message);
    }
}

class Device {
    public void use(String printerName) throws DeviceFailureException {
        if (printerName.equalsIgnoreCase("printer1") | printerName.equalsIgnoreCase("printer3")) {
            System.out.println("Available");
        } else {
            throw new DeviceFailureException("Device failure: Not Available");
        }
    }
}

public class Program6 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Enter the printer name:");
            return;
        }

        String printerName = args[0];
        Device device = new Device();

        try {
            device.use(printerName);
        } catch (DeviceFailureException e) {
            System.out.println(e.getMessage());
        }
    }
}
