
package game;

public class Game {

    
    public static void main(String[] args) {
        
        Player hero = new Player();
        Player enemy = new Player();
        
        hero.name = "Choki";
        hero.speed = 60;
        hero.damage = 20;
        hero.armor = 30;
        hero.healthPoin = 100;
        
        enemy.name = "Julia";
        enemy.speed = 20;
        enemy.damage = 10;
        enemy.armor = 5;
        enemy.healthPoin = 90;
        
        hero.run();
        hero.attack(enemy.name);
        
       
        
        if(hero.isDead()){
            System.out.println("Game Over :(");
        }
    }
    
}
