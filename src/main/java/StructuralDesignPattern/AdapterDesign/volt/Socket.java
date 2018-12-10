package StructuralDesignPattern.AdapterDesign.volt;

/**
 * Created by Artūrs Štrauss on Dec, 2018
 */
public class Socket {
    public Volt getVolt() {
        return new Volt(120);
    }
}
