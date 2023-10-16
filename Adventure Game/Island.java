public class Island
{
    private boolean northVisited;
    private boolean eastVisited;
    private boolean southVisited;
    private boolean westVisited;

    public Island()
    {
        this.northVisited = false;
        this.eastVisited = false;
        this.southVisited = false;
        this.westVisited = false;
    }

    public boolean getNorthVisited()
    {
        return northVisited;
    }

    public boolean getEastVisited()
    {
        return eastVisited;
    }

    public boolean getSouthVisited()
    {
        return southVisited;
    }

    public boolean getWestVisited()
    {
        return westVisited;
    }

    public void setNorthVisited()
    {
        northVisited = true;
    }

    public void setEastVisited()
    {
        eastVisited = true;
    }

    public void setSouthVisited()
    {
        southVisited = true;
    }

    public void setWestVisited()
    {
        westVisited = true;
    }
}