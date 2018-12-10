package StructuralDesignPattern.CompositeDesign;

/**
 * Created by Artūrs Štrauss on Dec, 2018
 */
public class Circle implements Shape {
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Circle with color " + fillColor);
    }
}
