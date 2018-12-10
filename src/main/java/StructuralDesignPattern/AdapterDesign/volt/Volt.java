package StructuralDesignPattern.AdapterDesign.volt;

/**
 * Created by Artūrs Štrauss on Dec, 2018
 */
public class Volt {

    private int volts;

    public Volt(int v) {
        this.volts = v;
    }

    public int getVolts() {
        return volts;
    }

    public void setVolts(int volts) {
        this.volts = volts;
    }
}
