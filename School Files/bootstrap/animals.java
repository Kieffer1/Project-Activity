class Animal {
    private String name;
    private String type;
    private int age;

    public Animal(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void growOlder() {
        age++;
    }

    public String toString() {
        return name + " has " + type + " (Age: " + age + ")";
    }
}

class Zoo {
    private Animal[] animals;
    private int size;

    public Zoo(int capacity) {
        animals = new Animal[capacity];
        size = 0;
    }

    public void addAnimal(Animal animal) {
        if (size < animals.length) {
            animals[size] = animal;
            size++;
            System.out.println("\nAdded " + animal.getName() + " to the zoo.");
        } else {
            System.out.println("\nThe zoo is full. Cannot add more animals.");
        }
    }

    public void showAnimals() {
        if (size > 0) {
            System.out.println("\nZoo Animals: ");
            for (int i = 0; i < size; i++) {
                System.out.println(animals[i]);
            }
        } else {
            System.out.println("\nThe zoo is empty. No animals to show.");
        }
    }

    public void timePassed() {
        if (size > 0) {
            System.out.println("\nTime has passed. All animals are now one year older!");
            for (int i = 0; i < size; i++) {
                animals[i].growOlder();
            }
        } else {
            System.out.println("\nThe zoo is empty. No time passed.");
        }
    }
}

class VirtualZoo {
    public static void main(String[] args) {
        System.out.println("Welcome to the Virtual Zoo!");
        
        System.out.print("Enter the maximum capacity of the zoo: ");
        int maxCapacity = Integer.parseInt(System.console().readLine());

        Zoo zoo = new Zoo(maxCapacity);
        boolean exit = false;
        while (!exit) {
            System.out.println("\nOptions:");
            System.out.println("1. Add an animal to the zoo");
            System.out.println("2. Show the list of animals in the zoo");
            System.out.println("3. Make all animals one year older");
            System.out.println("4. Exit");
            System.out.print("\nEnter your choice: ");
            int choice = Integer.parseInt(System.console().readLine());
            switch (choice) {
                case 1:
                    System.out.print("Animal Name: ");
                    String name = System.console().readLine();
                    System.out.print("Animal Type: ");
                    String type = System.console().readLine();
                    System.out.print("Animal Age: ");
                    int age = Integer.parseInt(System.console().readLine());
                    Animal animal = new Animal(name, type, age);
                    zoo.addAnimal(animal);
                    break;
                case 2:
                    zoo.showAnimals();
                    break;
                case 3:
                    zoo.timePassed();
                    break;
                case 4:
                    System.out.println("\nThank you for visiting the Virtual Zoo!");
                    exit = true;
            }
        }
    }
}