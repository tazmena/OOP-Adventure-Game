public class Warrior extends Hero
{
    private int randomStrength;
    public Warrior(String name, int strength)
    {
        super(name,strength);
    }

    public int generateRandomAttackNo()
    {
        int attackNo = randomStrength+getStrength();
        return attackNo;
    }
    
    public int getAttack()
    {
        return generateRandomAttackNo();
    }

    public void attack(Hero h, Villain villain)
    {
        int attackPower = generateRandomAttackNo();

        if (villain.getBarrier().equals("Fire")) {
            System.out.println("This villain has a fire barrier! Break it using elemental magic.");
            villain.setHealth(-attackPower - 5);
            System.out.println(villain.getName() + "'s health is now " + villain.getHealth());
        }
        else if (villain.getBarrier().equals("Ice")) {
            System.out.println("This villain has an ice barrier! Break it using elemental magic.");
            villain.setHealth(-attackPower - 5);
            System.out.println(villain.getName() + "'s health is now " + villain.getHealth());
        }
        else {
            villain.setHealth(-attackPower - 10);
            System.out.println(villain.getName() + "'s health is now " + villain.getHealth());
        }
    }



}


