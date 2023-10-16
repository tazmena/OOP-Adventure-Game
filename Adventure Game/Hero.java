public class Hero extends Character
{
    public Hero(String name, int strength)
    {
        super(name,strength);
    }

    public void attack(Hero h, Villain villain)
    {
        int attackPower = getStrength();

        if (villain.getBarrier().equals("Fire")) {
            System.out.println("This villain has a fire barrier! Break it using elemental magic, or your attacks will be weaker.");
            villain.setHealth(-attackPower - 5);
            System.out.println(villain.getName() + "'s health is now " + villain.getHealth());
        }
        else if (villain.getBarrier().equals("Ice")) {
            System.out.println("This villain has an ice barrier! Break it using elemental magic, or your attacks will be weaker.");
            villain.setHealth(-attackPower - 5);
            System.out.println(villain.getName() + "'s health is now " + villain.getHealth());
        }
        else {
            villain.setHealth(-attackPower - 10);
            System.out.println(villain.getName() + "'s health is now " + villain.getHealth());
        }
    }

}