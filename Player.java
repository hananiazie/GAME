
package game;

public class Player {
    
    String name;
    int speed;
    int damage;
    int armor;
    int healthPoin;
    
    void run(){
        System.out.println(name +" is running...");
        System.out.println("Speed: "+ speed);
    }
    
    void attack(String b){
        System.out.println(name +" is atacking...");
        System.out.println("Damage: "+ damage);
    }
    
    void defend(){
        System.out.println(name +" is running...");
        System.out.println("Armor: "+ armor);
    }
 
    boolean isDead(){
        if(healthPoin <= 0) return true;
        return false;
    }
}
