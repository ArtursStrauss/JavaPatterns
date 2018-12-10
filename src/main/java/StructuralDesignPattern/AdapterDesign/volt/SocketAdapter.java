package StructuralDesignPattern.AdapterDesign.volt;

/**
 * Created by Artūrs Štrauss on Dec, 2018
 */
public interface SocketAdapter {

    public Volt get120Volt();

    public Volt get12Volt();

    public Volt get3Volt();
}
