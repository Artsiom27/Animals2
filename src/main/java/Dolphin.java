class Dolphin extends Animal {
    String typeofeat;
    String home;

    public Dolphin (String name, int weight, String habitat, int height) {
        super(name, weight, habitat, height);
        this.typeofeat = "рыба";
        this.home = "океан";

    }
        public void setTypeofeat (String typeofeat){
        this.typeofeat = typeofeat;
    }
    public String getTypofeat () {
        return typeofeat;
    }
    public void setHome (String home){
        this.home = home;
    }
    public String getHome () {
        return home;
    }

    public void printInfo () {
        System.out.println("Вид животного: " + name);
        System.out.println("Вес: " + weight + " кг.");
        System.out.println("Среда обитания: " + habitat);
        System.out.println("Любимая пища: " + typeofeat);
        System.out.println("Дом: " + home);
    }
}

