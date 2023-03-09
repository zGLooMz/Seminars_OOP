public class Main {
    public static void main(String[] args) {
        Player war1 = new Rogue("Alex");
        Player war2 = new Sniper("Max");
        boolean isAlive; 
        isAlive = true;
        while (isAlive){
                System.out.println(war1);
                System.out.println(war2);
                war1.toAttack(war2);
                System.out.println(war1);
                System.out.println(war2);
                war2.toAttack(war1);
            }
    }
}