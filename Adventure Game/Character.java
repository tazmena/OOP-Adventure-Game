public class Character
{
    private String name;
    private int strength;


    public Character(String name, int strength)
    {
        this.name = name;
        this.strength = strength;
    }

    public void setStrength (int newStrength)
    {
        strength = newStrength;
    }

    public String getName ()
    {
        return name;
    }

    public int getStrength ()
    {
        return strength;
    }

}