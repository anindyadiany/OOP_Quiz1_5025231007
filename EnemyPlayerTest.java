package Q17;

public class EnemyPlayerTest {
    public static void main(String[] args) {
        Player anin = new Player("anin", 99, 35, 10);
        Player oniel = new Player("oniel", 88, 30, 10);

        int damage;
        damage = anin.attack(oniel);
        oniel.takeDamage(damage);

        damage = oniel.attack(anin);
        anin.takeDamage(damage);
        
        damage = oniel.attack(anin);
        anin.takeDamage(damage);
        
        damage = oniel.attack(anin);
        anin.takeDamage(damage);
        
        damage = oniel.attack(anin);
        anin.takeDamage(damage);
        
        damage = oniel.attack(anin);
        anin.takeDamage(damage);
        
        damage = anin.attack(oniel);
        oniel.takeDamage(damage);
        
        damage = anin.attack(oniel);
        oniel.takeDamage(damage);
        
        damage = anin.attack(oniel);
        oniel.takeDamage(damage);

    }
}
