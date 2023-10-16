public class FireMage extends Mage
{
    private String magicType;
    public FireMage(String name, int strength)
    {
        super(name, strength);
        magicType = "Fire";
    }

    public String getMagicType()
    {
        return magicType;
    }
    public void throwMagic(Hero hero, Villain villain)
    {
        int attackPower = getStrength();
        if(villain.getBarrier() == magicType)
        {
            villain.breakBarrier();
            villain.setHealth(-attackPower - 10);
        }
        else
            {
                System.out.println("This villain has an ice barrier! Break it using elemental magic, or your attacks will be weaker.");
                villain.setHealth(-attackPower - 5);
                System.out.println(villain.getName() + "'s health is now " + villain.getHealth());
            }
    }
}
