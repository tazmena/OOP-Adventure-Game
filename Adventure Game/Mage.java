public class Mage extends Hero
{
    private String magicType;
    public Mage(String name, int strength)
    {
        super(name,strength);
        magicType ="";
    }

    public String getMagicType()
    {
        return magicType;
    }
    
    public void setMagicType(String magic)
    {
        magicType = magic;
    }
    public void throwMagic(Hero hero, Villain villain)
    {
        int attackPower = hero.getStrength();
        if(villain.getBarrier().equals(magicType))
        {
            villain.breakBarrier();
            villain.setHealth(-attackPower - 10);
        }
        else
        {
            System.out.println("This villain has a barrier! Break it using elemental magic, or your attacks will be weaker.");
            villain.setHealth(-attackPower - 5);
            System.out.println(villain.getName() + "'s health is now " + villain.getHealth());
        }
    }

}
