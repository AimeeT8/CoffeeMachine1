import java.util.Scanner;

/**
 * @ A Temple
 * @ Jan 28th 2022
 */

public class CoffeeMachine1 {

    static final int water = 400;
    static final int milk = 540;
    static final int coffeeBean = 120;
    static int disposableCups = 9;
    static final int cost = 550;

    static int remCost = cost;
    static int remWater = water;
    static int remMilk = milk;
    static int remCoffeeBean = coffeeBean;
    static int remDisposableCups = disposableCups;

    static int espressoWater;
    static int espressoMilk;
    static int espressoCoffeeBeans;
    static int espressoCost;

    static int latteWater;
    static int latteMilk;
    static int latteCoffeeBeans;
    static int latteCost;

    static int cappuccinoWater;
    static int cappuccinoMilk;
    static int cappuccinoCoffeeBeans;
    static int cappuccinoCost;

    static void fillCoffeeMachine() {
        Scanner input = new Scanner(System.in);
        System.out.println("Write how many ml's of water you want to add: ");
        remWater += input.nextInt();
        System.out.println("Write how many ml's of milk you want to add: ");
        remMilk += input.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add: ");
        remCoffeeBean += input.nextInt();
        System.out.println("Write how many disposable coffee cups you want to add: ");
        remDisposableCups += input.nextInt();
        System.out.println();



    }

    static void buyCoffee() {
        class TypesOfCoffee {
            void Espresso() {
                espressoWater = 250;
                espressoMilk = 0;
                espressoCoffeeBeans = 16;
                espressoCost = 4;

                if (remWater > espressoWater && remMilk > espressoMilk && remCoffeeBean > espressoCoffeeBeans) {
                    System.out.println("I have enough resources, making you an espresso!");
                    System.out.println();
                    remWater -= espressoWater;
                    remCoffeeBean -= espressoCoffeeBeans;
                    remDisposableCups--;
                    remCost += espressoCost;
                } else if (remWater < espressoWater) {
                    System.out.println("Sorry, not enough water for an espresso!");
                    System.out.println();
                } else if (remCoffeeBean < espressoCoffeeBeans) {
                    System.out.println("Sorry, not enough coffee beans!");
                    System.out.println();
                }

            }

            void latte() {
                latteWater = 350;
                latteMilk = 75;
                latteCoffeeBeans = 20;
                latteCost = 7;

                if (remWater > latteWater && remMilk > latteMilk && remCoffeeBean > latteCoffeeBeans) {
                    System.out.println("I have enough resources to make you a latte!");
                    remWater -= latteWater;
                    remMilk -= latteMilk;
                    remCoffeeBean -= latteCoffeeBeans;
                    remDisposableCups--;
                    remCost += latteCost;
                } else if (remWater < latteWater) {
                    System.out.println("Sorry, not enough water!");
                    System.out.println();

                } else if (remMilk < latteMilk) {
                    System.out.println("Sorry, not enough milk!");
                    System.out.println();
                } else if (remCoffeeBean < latteCoffeeBeans) {
                    System.out.println("Sorry, not enough coffee beans!");
                    System.out.println();
                }

            }

            void cappuccino() {
                cappuccinoWater = 200;
                cappuccinoMilk = 100;
                cappuccinoCoffeeBeans = 12;
                cappuccinoCost = 6;

                if (remWater > cappuccinoWater && remMilk > cappuccinoMilk && remCoffeeBean > cappuccinoCoffeeBeans) {
                    System.out.println("I have enough resources, making you a coffee!");
                    System.out.println(); //added
                    remWater -= cappuccinoWater;
                    remMilk -= cappuccinoMilk;
                    remCoffeeBean -= cappuccinoCoffeeBeans;
                    remDisposableCups--;
                    remCost += cappuccinoCost;
                } else if (remWater < cappuccinoWater) {
                    System.out.println("Sorry, not enough water!");
                    System.out.println();
                } else if (remMilk < cappuccinoMilk) {
                    System.out.println("Sorry, not enough milk!");
                    System.out.println();
                } else if (remCoffeeBean < cappuccinoCoffeeBeans) {
                    System.out.println("Sorry, not enough coffee beans!");
                    System.out.println();
                }

            }
        }

        Scanner input = new Scanner(System.in);
        System.out.println("What kind of coffee would you like to buy today?");
        System.out.println("Please enter: 1 - Espresso, 2 - Latte, 3 - Cappuccino, back - to main menu");
        String choice = input.next();


        switch (choice) {
            case "1":
                new TypesOfCoffee().Espresso();
                break;
            case "2":
                new TypesOfCoffee().latte();
                break;
            case "3":
                new TypesOfCoffee().cappuccino();
                break;
            case "back":
                 break;
            default:
                System.out.println("Please enter an option from the above");
                break;
        }
    }
        static void takeMoney() {
            System.out.println("I gave you " + "$" + remCost);
            remCost = 0;


        }
        static void getRemainingResources() {
            System.out.println("The coffee machine has: ");
            System.out.println(remWater + " ml of water");
            System.out.println(remMilk + " ml of milk");
            System.out.println(remCoffeeBean + " g of coffee beans");
            System.out.println(remDisposableCups + " disposable cups");
            System.out.println("$" + remCost + " remaining");
        }

        static void MainMenu() {
            Scanner input = new Scanner(System.in);

            System.out.println("Please choose from the following options below");
            System.out.println("To buy a coffee - buy");
            System.out.println("To fill the machine - fill");
            System.out.println("To get cash from the machine - take");
            System.out.println("To see remaining resources - remaining");
            System.out.println("To exit the program - exit");
            String choice1 = input.next();

            while (!"exit".equals(choice1)) {
                switch (choice1) {
                    case "buy": buyCoffee();break;
                    case "fill": fillCoffeeMachine();break;
                    case "take": takeMoney();break;
                    case "remaining": getRemainingResources();break;
            }


                System.out.println("Please choose from the following options below");
                System.out.println("To buy a coffee - buy");
                System.out.println("To fill the machine - fill");
                System.out.println("To get cash from the machine - take");
                System.out.println("To see remaining resources - remaining");
                System.out.println("To exit the program - exit");
                choice1 = input.next();


            }

        }
        public static void main(String[] args) {
            MainMenu();
        }


    }




















