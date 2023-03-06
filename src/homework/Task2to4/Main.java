package homework.Task2to4;

public class Main {
    public static void main(String[] args) {
        Device device = new Device("BMW", 120, "AB1234567CD");
        EthernetAdapter ethernetAdapter = new EthernetAdapter("Mazda", 230, "AA1", 120, " Mazda MX-5 ");
        EthernetAdapter ethernetAdapter1 = new EthernetAdapter("Ford", 599, "BB1", 160, "qwerty123");
        Monitor monitor = new Monitor("Audi", 450, " AB2323", 220, 670);
        boolean equal = ethernetAdapter.equals(ethernetAdapter1);
        System.out.println(device + ",  hashCode= " + device.hashCode());
        System.out.println(ethernetAdapter + ", hashCode=  " + ethernetAdapter.hashCode());
        System.out.println(monitor + ", hashCode= " + monitor.hashCode());
        System.out.println(" ethernetAdapter і ethernetAdapter1 одинакові об'єкти ? " + equal);
    }

}
