package threadexamples.reference;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by Artūrs Štrauss on Dec, 2018
 */
public class Main {
    public static void main(String[] args) {
        String oldName = "old name";
        String newName = "new name";
        AtomicReference<String> atomicReference = new AtomicReference<>(oldName);

        atomicReference.set("Unexpected name");
        if (atomicReference.compareAndSet(oldName, newName)) {
            System.out.println("New value is " + atomicReference.get());
        } else {
            System.out.println("Nothing changed");
        }
    }
}
