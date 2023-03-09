import java.util.Random;

public abstract class Player {
    private static int num;
    private int id;
    private String name;
    private double hp;
    private int dodge;
    private double dmg;
    Random rand = new Random();

    Player(String name, double hp, int dodge, double dmg) {
        this.id = ++num;
        this.name = name;
        this.hp = hp;

        this.dodge = dodge;
        this.dmg = dmg;
    }

    @Override
    public String toString() {
        return String.format("%s-%d, hp: %.0f", this.name, this.id, this.hp);
    }

    protected void damage(double dmg) {
        this.hp -= dmg;
    }

    public int getId() {
        return this.id;
    }

    protected boolean isAlive() {
        if (this.hp <= 0)
            return false;
        return true;
    }

    protected void toAttack(Player target) {
        if (this.getId() != target.getId() && target.isAlive() && this.isAlive()) {
            if (target.dodge <= rand.nextInt(100)) {
                target.damage(rand.nextInt((int) this.dmg - 3, (int) this.dmg + 4));
            } else
                System.out.println("Мимо!");
        } else {
            System.out.println("Враг уничтожен! \n");
            System.exit(dodge);
        }
    }
}