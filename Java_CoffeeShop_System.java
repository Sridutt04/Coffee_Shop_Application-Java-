class CoffeeShop
{
    public void coffee(String size)
    {
        System.out.println("You ordered a " + size + " coffee ");
    }

    public void coffee(String size, String type)
    {
        System.out.println("You ordered a " + size + " " + type + " coffee ");
    }

    public void coffee(String size, String type, boolean extraShot)
    {
        if (extraShot)
        {
            System.out.println("You ordered a " + size + " " + type + " coffee " + "with an extra shot");
        }
        else
        {
            System.out.println("You ordered a " + size + " " + type + " coffee " + "without an extra shot");
        }
    }
}

public class Java_CoffeeShop_System
{
    public static void main(String[] args)
    {
        CoffeeShop coffeeShop = new CoffeeShop();
        

        coffeeShop.coffee("Medium");
        coffeeShop.coffee("Medium", "Espresso");
        coffeeShop.coffee("Medium", "Espresso", true);
    }
}