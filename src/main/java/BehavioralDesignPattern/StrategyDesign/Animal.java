package BehavioralDesignPattern.StrategyDesign;

public class Animal {

    private String name;
    private double height;
    private int weight;
    private String favFood;
    private int speed;
    private String sound;

    public Flys flyingType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int newWight) {
        if (newWight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Weight must be bigger then 0!");
        }
    }

    public String getFavFood() {
        return favFood;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String tryToFly() {

        return flyingType.fly();
    }

    public void setFlyingAbility(Flys newFlyType) {

        flyingType = newFlyType;
    }

}
