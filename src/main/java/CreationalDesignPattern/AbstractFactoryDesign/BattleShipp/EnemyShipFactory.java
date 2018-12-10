package CreationalDesignPattern.AbstractFactoryDesign.BattleShipp;

public interface EnemyShipFactory {
    public ESWeapon addESGun();
    public ESEngine addESEngine();
}

