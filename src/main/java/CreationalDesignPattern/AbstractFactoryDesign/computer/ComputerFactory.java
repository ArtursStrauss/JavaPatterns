package CreationalDesignPattern.AbstractFactoryDesign.computer;

/**
 * Created by Artūrs Štrauss on Dec, 2018
 */
public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
