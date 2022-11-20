package lecture04;

public class Fighter {
    private int hitPoint;
    private int power;
    private String name;

    public Fighter(int hitPoint, int power, String name){
        this.hitPoint = hitPoint;
        this.power = power;
        this.name = name;
    }

    public void attack(Fighter enemy){
        enemy.setHitPoint(enemy.getHitPoint() - power);
        System.out.println(getName() + " は " + enemy.getName() + " に " + power + " ダメージを与えた。");
        System.out.println(enemy.getName() + " の残り hitPoint : " + enemy.getHitPoint());
        if(!enemy.isAlive()){
            System.out.println(enemy.getName() + " は倒れた。");
            System.exit(0);
        }
    }

    public boolean isAlive(){
        return hitPoint > 0;
    }

    public int getHitPoint(){
        return hitPoint;
    }

    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }

    public String getName(){
        return name;
    }
}
