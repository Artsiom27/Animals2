public class Main {
    public static void main(String[] args) {
        Monkey monkey0 = new Monkey("Гита", 20, "джунгли", 120);
        monkey0.printInfo();
        System.out.println("    ");

        Monkey monkey1 = new Monkey("Зита", 10, "джунгли", 50, "лазить по деревьям");
        monkey1.HomeAnimal();
        monkey1.printInfo2();
        System.out.println("    ");

        Dog dog1 = new Dog("Джек",40, "кости", "трава у дома", 100);
        dog1.setTypeofeat("кости");
        dog1.printInfo();
        System.out.println("    ");

        Dolphin dog2 = new Dolphin ("Чаки",1000, "вода", 300);
        dog2.setTypeofeat("мелкая рыба");
        dog2.printInfo();
        System.out.println("    ");

        Sparrow sparrow1 = new Sparrow ("Ронни",1.2 );
        sparrow1.printInfo();
        System.out.println("    ");

        Sparrow sparrow2 = new Sparrow("Гарри", 0.4);
        sparrow2.homeSparrow();
        System.out.println("     ");

           }
}




