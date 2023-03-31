package org.example.animals;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Zoo {
    private List<Animal> animali;

    public Zoo() {
        this.animali = new ArrayList<>();
    }

    public void addAnimal(Animal animale) {
        this.animali.add(animale);
    }
    
    public Animal getAnimalePiuAlto(String specie) {
        return animali.stream()
                .filter(a -> a.getClass().getSimpleName().equalsIgnoreCase(specie))
                .max(Comparator.comparingDouble(Animal::getHeight))
                .orElse(null);
    }

    public Animal getAnimalePiuBasso(String specie) {
        return animali.stream()
                .filter(a -> a.getClass().getSimpleName().equalsIgnoreCase(specie))
                .min(Comparator.comparingDouble(Animal::getHeight))
                .orElse(null);
    }

    public Animal getAnimalePiuPesante(String specie) {
        return animali.stream()
                .filter(a -> a.getClass().getSimpleName().equalsIgnoreCase(specie))
                .max(Comparator.comparingDouble(Animal::getWeight))
                .orElse(null);
    }

    public Animal getAnimalePiuLeggero(String specie) {
        return animali.stream()
                .filter(a -> a.getClass().getSimpleName().equalsIgnoreCase(specie))
                .min(Comparator.comparingDouble(Animal::getWeight))
                .orElse(null);
    }

    public Animal getAnimaleConCodaPiuLunga(String specie) {
        return animali.stream()
                .filter(a -> a.getClass().getSimpleName().equalsIgnoreCase(specie))
                .max(Comparator.comparingDouble(a -> ((TailAnimal) a).getTailLength()))
                .orElse(null);
    }

    public Animal getAnimaleConAperturaAlarePiuGrande(String specie) {
        return animali.stream()
                .filter(a -> a.getClass().getSimpleName().equalsIgnoreCase(specie))
                .max(Comparator.comparingDouble(a -> ((WingAnimal) a).getWingspan()))
                .orElse(null);


    }
}
