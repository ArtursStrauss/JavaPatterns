package StructuralDesignPattern.AdapterDesign.enemy;

public interface EnemyAttacker {
    public void fireWeapon();

    public void driveForward();

    public void assignDriver(String driverName);
}
