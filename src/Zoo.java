public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    int animalCount; // Compteur d'animaux dans le zoo

    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animalCount = 0; // Initialiser le compteur d'animaux à zéro
    }

    @Override
    public String toString() {
        return "Zoo Name: " + name + "\nCity: " + city + "\nNumber of Cages: " + nbrCages;
    }

    public boolean addAnimal(Animal animal) {
        // Vérifier si l'animal existe déjà dans le zoo
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animal)) {
                System.out.println("L'animal existe déjà dans le zoo.");
                return false;
            }
        }

        if (animalCount < animals.length) {
            // Vérifier si le zoo a de la place pour ajouter un animal
            animals[animalCount] = animal;
            animalCount++; // Incrémenter le compteur d'animaux
            System.out.println("L'animal a été ajouté au zoo.");
            return true; // Renvoyer true pour indiquer que l'ajout a été effectué
        } else {
            // Si le zoo est plein, ne peut pas ajouter l'animal
            System.out.println("Le zoo est plein. Impossible d'ajouter l'animal.");
            return false;
        }
    }

    public int searchAnimal(Animal animalToFind) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animalToFind)) {
                return i; // L'animal a été trouvé à l'indice i
            }
        }
        return -1; // L'animal n'a pas été trouvé dans le zoo
    }
    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i] != null && animals[i].equals(animal)) {
                // Si l'animal est trouvé, le supprimer en le remplaçant par null
                animals[i] = null;
                // Réorganiser les animaux dans le tableau pour remplir le trou
                for (int j = i; j < animalCount - 1; j++) {
                    animals[j] = animals[j + 1];
                }
                animals[animalCount - 1] = null; // Effacer la dernière entrée
                animalCount--; // Décrémenter le compteur d'animaux
                return true; // Renvoyer true pour indiquer que la suppression a réussi
            }
        }
        return false; // Renvoyer false si l'animal n'a pas été trouvé ou si le zoo est vide
    }

}
