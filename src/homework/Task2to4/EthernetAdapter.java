package homework.Task2to4;

import java.util.Objects;

// EthernetAdapter (speed(int), mac(String));
public class EthernetAdapter extends Device {
    private final int speed;
    private final String mas;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mas) {
        super(manufacturer, price, serialNumber);
        this.mas = mas;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public String getMas() {
        return mas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EthernetAdapter that = (EthernetAdapter) o;
        return speed == that.speed && Objects.equals(mas, that.mas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speed, mas);
    }

    @Override
    public String toString() {
        return super.toString() + ", speed " + getSpeed() + ", mas " + getMas();
    }

}
