package StructuralDesignPattern.AdapterDesign.volt;

/**
 * Created by Artūrs Štrauss on Dec, 2018
 */
public class AdapterPatternTest {

    private enum Volts {
        THREE_VOLTS(3),

        TWELVE_VOLTS(12),

        HUNDRED_TWENTY_VOLTS(120);

        private int value;

        Volts(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {

        testClassAdapter();
        testObjectAdapter();
    }

    private static void testObjectAdapter() {
        SocketAdapter sockAdapter = new SocketObjectAdapterImpl();
        Volt v3 = getVolt(sockAdapter, Volts.THREE_VOLTS);
        Volt v12 = getVolt(sockAdapter, Volts.TWELVE_VOLTS);
        Volt v120 = getVolt(sockAdapter, Volts.HUNDRED_TWENTY_VOLTS);
        System.out.println("v3 volts using Object Adapter = " + v3.getVolts());
        System.out.println("v12 volts using Object Adapter = " + v12.getVolts());
        System.out.println("v120 volts using Object Adapter = " + v120.getVolts());
    }

    private static void testClassAdapter() {
        SocketAdapter sockAdapter = new SocketClassAdapterImpl();
        Volt v3 = getVolt(sockAdapter, Volts.THREE_VOLTS);
        Volt v12 = getVolt(sockAdapter, Volts.TWELVE_VOLTS);
        Volt v120 = getVolt(sockAdapter, Volts.HUNDRED_TWENTY_VOLTS);
        System.out.println("v3 volts using Class Adapter = " + v3.getVolts());
        System.out.println("v12 volts using Class Adapter = " + v12.getVolts());
        System.out.println("v120 volts using Class Adapter = " + v120.getVolts());
    }

    private static Volt getVolt(SocketAdapter sockAdapter, Volts volts) {
        switch (volts) {
            case THREE_VOLTS:
                return sockAdapter.get3Volt();
            case TWELVE_VOLTS:
                return sockAdapter.get12Volt();
            case HUNDRED_TWENTY_VOLTS:
                return sockAdapter.get120Volt();
            default:
                return sockAdapter.get120Volt();
        }
    }
}
