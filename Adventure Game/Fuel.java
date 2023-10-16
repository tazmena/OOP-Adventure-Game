public class Fuel
{
    private boolean collected;

    public Fuel()
    {
        collected = false;
    }

    public boolean getCollected()
    {
        return collected;
    }

    public void hasBeenCollected()
    {
        collected = true;
    }
}
