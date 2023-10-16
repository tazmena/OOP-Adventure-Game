public class Villain extends Character
{
    private boolean isDead;
    private int health;
    private String barrier;

    public Villain(String name, int strength)
    {
        super(name,strength);
        this.isDead = false;
        this.health = 100;
    }

    public void generateBarrier()
    {
        String[] barrierTypes = new String[]{"Fire","Ice","None"};
        int randomPosition = (int)(Math.random() * ((barrierTypes.length-1) - 0 + 1) + 0); //Randomly choose a barrier from the array of different types
        barrier = barrierTypes[randomPosition];
    }

    public String getBarrier()
    {
        return barrier;
    }

    public int getHealth()
    {
        return health;
    }

    public String breakBarrier()
    {
        barrier = "None";
        return barrier;
    }

    public boolean isDead()
    {
        return true;
    }

    public Fuel dropFuel()
    {
        if (isDead() == true)
        {
            System.out.println(getName() + " dropped something! It's a fuel! ");
        }
        Fuel fuel = new Fuel();
        return fuel;
    }

    public int setHealth(int healthChange)
    {
        health = health + healthChange;
        return health;
    }

}