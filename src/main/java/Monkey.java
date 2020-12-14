class Monkey extends Animal {
    String typeofLife;
    String typeofeat;


    public Monkey(String name, double weight, String habitat, int height) {
        super(name, weight, habitat, height);
        this.typeofeat = "бананы";
    }

    public Monkey (String name, double weight, String habitat, int height, String typeofLife) {
        super(name, weight, habitat, height);
        this.typeofLife = typeofLife;
    }

    public void setTypeofeat ( String typeofeat){
        this.typeofeat = typeofeat;
    }
    public String getTypofeat () {
        return typeofeat;
    }
    public void setTypeofLife ( String typeofLife){
        this.typeofLife = typeofLife;
    }
    public String getTypeofLife () {
        return typeofLife;
    }

    public void printInfo () {
        System.out.println("Вид животного: " + name);
        System.out.println("Вес: " + weight + " кг.");
        System.out.println("Среда обитания: " + habitat);
        System.out.println("Любимая пища: " + typeofeat);
        System.out.println("Рост взрослого животного: " + height + " см.");
    }
    public void printInfo2 () {
        System.out.println("Вид животного: " + name);
        System.out.println("Вес: " + weight + " кг.");
        System.out.println("Среда обитания: " + habitat);
        System.out.println("Любимая занятие: " + typeofLife);

    }


    }


