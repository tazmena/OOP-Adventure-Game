import java.util.Scanner;

public class StartGame
{
    public static void main(String[] args)
    {
        createGame();
    }

    public static void createGame()
    {

        //HEROES

        Hero[] heroes = new Hero[3];
        String[] warriorNames = new String[]{"Vincent", "Claire", "Miles", "Eden"};
        String[] fireMageNames = new String[]{"Ember", "Vivi", "Firia", "Ignis"};
        String[] iceMageNames = new String[]{"Qizai", "Afinia", "Glacia", "Frosta"};
        int[] randomStrengthH = new int[3];

        for(int i=0; i<randomStrengthH.length; i++)
        {
            randomStrengthH[i] = (int) (Math.random() * (50 - 10 + 1) + 10);
        }

        int randomName = (int) (Math.random() * ((3-0)+1)+0);
        heroes[0] = new Warrior(warriorNames[randomName], randomStrengthH[0]);
        heroes[1] = new FireMage(fireMageNames[randomName], randomStrengthH[1]);
        heroes[2] = new IceMage(iceMageNames[randomName], randomStrengthH[2]);

        Island island = new Island();
        System.out.println("You have awakened on a small, desserted island with no one but yourself, " + heroes[0].getName() + ", " + heroes[1].getName() + " and " + heroes[2].getName() + "." );
        System.out.println("Each characters stats are stated below: ");
        printStats(heroes);
        System.out.println("Defeat enemies to collect enough fuel for your ship so you can leave this island!");

        Fuel[] fuels = new Fuel[4];
        for(int i=0; i<fuels.length; i++)
        {
            fuels[i] = new Fuel();
        }



        while ((!fuels[0].getCollected() || !fuels[1].getCollected() || !fuels[2].getCollected() || !fuels[3].getCollected())) {
            int chosenArea = menuThree();
            if (chosenArea == 1 && island.getNorthVisited() == false) {
                Villain villain = createVillian();
                fight(heroes, villain);
                island.setNorthVisited();
                fuels[0] = villain.dropFuel();
                String pickup = menuFour();
                if (pickup.equals("Yes"))
                {
                    fuels[0].hasBeenCollected();
                }
            } else if (chosenArea == 2 && island.getEastVisited() == false) {
                Villain villain = createVillian();
                fight(heroes, villain);
                island.setEastVisited();
                fuels[1] = villain.dropFuel();
                String pickup = menuFour();
                if (pickup.equals("Yes"))
                {
                    fuels[1].hasBeenCollected();
                }
            } else if (chosenArea == 3 && island.getSouthVisited() == false) {
                Villain villain = createVillian();
                fight(heroes, villain);
                island.setSouthVisited();
                fuels[2] = villain.dropFuel();
                String pickup = menuFour();
                if (pickup.equals("Yes"))
                {
                    fuels[2].hasBeenCollected();
                }
            } else if (chosenArea == 4 && island.getWestVisited() == false) {
                Villain villain = createVillian();
                fight(heroes, villain);
                island.setWestVisited();
                fuels[3] = villain.dropFuel();
                String pickup = menuFour();
                if (pickup.equals("Yes"))
                {
                    fuels[3].hasBeenCollected();
                }
            }
        }
        System.out.println("You collected all 4 fuels! You can now leave the island! You win!");


    }

    public static void fight(Hero[] heroes, Villain villain)
    {
        System.out.println(villain.getName() + "'s health is currently: " + villain.getHealth());
        while (villain.getHealth() > 0)
        {
            for(int i=0; i<heroes.length; i++)
            {
                if (villain.getHealth()> 0)
                {
                    System.out.println("It's " + heroes[i].getName() + "'s turn!");
                    if (heroes[i] instanceof Warrior)
                    {
                        int choice = menuOne();
                        if(choice == 1)
                        {
                            heroes[i].attack(heroes[i], villain);
                        }
                    }
                    else if(heroes[i] instanceof FireMage)
                    {
                        int choice = menuTwo();
                        if(choice == 1)
                        {
                            heroes[i].attack(heroes[i],villain);
                        }
                        else if (choice == 2)
                        {

                            FireMage firemage = (FireMage)heroes[i];
                            firemage.throwMagic(heroes[i],villain);
                        }
                    }
                    else if(heroes[i] instanceof IceMage)
                    {
                        int choice = menuTwo();
                        if(choice == 1)
                        {
                            heroes[i].attack(heroes[i],villain);
                        }
                        else if (choice == 2)
                        {

                            IceMage icemage = (IceMage)heroes[i];
                            icemage.throwMagic(heroes[i],villain);
                        }
                    }
                }
            }
        }
        villain.isDead();
        System.out.println("You defeated " + villain.getName() + "!");
    }

    public static void printStats(Hero[] heroes)
    {
        String print = "";
        for (int i=0; i<heroes.length; i++)
        {
            if (heroes[i] instanceof Warrior)
            {
                print = print + ("Name: " + heroes[i].getName() + "\nStrength: " + heroes[i].getStrength() + "\nType: Warrior (Strong attacks only)\n");
            }
            else if (heroes[i] instanceof FireMage)
            {
                print = print + ("\nName: " + heroes[i].getName() + "\nStrength: " + heroes[i].getStrength() + "\nType: Fire Mage (Normal attacks and fire magic)\n");
            }
            else if (heroes[i] instanceof IceMage)
            {
                print = print + ("\nName: " + heroes[i].getName() + "\nStrength: " + heroes[i].getStrength() + "\nType: Ice Mage (Normal attacks and ice magic)\n");
            }
        }
        System.out.println(print);
    }

    public static Villain createVillian()
    {
        //VILLAINS

        String[] villainNames = new String[]{"Witch", "Beast", "Octopus", "Pirate"};
        int randomName = (int) (Math.random() * ((3-0)+1)+0);
        int randomStrengthV = (int) (Math.random() * (50 - 10 + 1) + 10);
        Villain villain = new Villain(villainNames[randomName],randomStrengthV);
        villain.generateBarrier();
        return villain;

    }

    public static int menuOne()
    {
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1) Attack");
        System.out.println("Enter your action: ");
        choice = Integer.parseInt(scanner.nextLine());
        return choice;
    }

    public static int menuTwo()
    {
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1) Attack");
        System.out.println("2) Throw magic");
        System.out.println("Enter your action: ");
        choice = Integer.parseInt(scanner.nextLine());
        return choice;
    }

    public static int menuThree()
    {
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1) To the north, you see a large palm tree. Head towards there? ");
        System.out.println("2) To your east is the beach and vast sea. Head towards there?");
        System.out.println("3) To your south is an abandoned shack. Head towards there? ");
        System.out.println("4) To your west is a dark cave. Head towards there? ");
        System.out.println("Enter your action: ");
        choice = Integer.parseInt(scanner.nextLine());
        return choice;
    }

    public static String menuFour()
    {
        System.out.println("Pick up the item? ");
        Scanner scanner = new Scanner(System.in);
        String ans = scanner.nextLine();
        return ans;
    }

}
