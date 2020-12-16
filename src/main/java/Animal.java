class Animal {
    String name;
    double weight;
    String habitat;
    int height;
    String typeofeat;

    public Animal(String name) {
    }

    public Animal(String name, double weight, String habitat, int height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.habitat = habitat;

    }

    public Animal(String name, double weight, String typeofeat, String habitat, int height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.habitat = habitat;
        this.typeofeat = typeofeat;

    }

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void HomeAnimal() {
        setHabitat("домашнее животное");
    }
}
