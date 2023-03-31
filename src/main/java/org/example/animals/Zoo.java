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

    public List<Animal> getAnimali() {
        return this.animali;
    }

    public Animal getAnimalePiuAlto() {
        return animali.stream()
                .max(Comparator.comparingDouble(Animal::getHeight))
                .orElse(null);
    }

    public Animal getAnimalePiuBasso() {
        return animali.stream()
                .min(Comparator.comparingDouble(Animal::getHeight))
                .orElse(null);
    }

    public Animal getAnimalePiuPesante() {
        return animali.stream()
                .max(Comparator.comparingDouble(Animal::getWeight))
                .orElse(null);
    }

    public Animal getAnimalePiuLeggero() {
        return animali.stream()
                .min(Comparator.comparingDouble(Animal::getWeight))
                .orElse(null);
    }

    public Animal getAnimaleConCodaPiuLunga() {
        return animali.stream()
                .filter(a -> a instanceof TailAnimal)
                .max(Comparator.comparingDouble(a -> ((TailAnimal) a).getTailLength()))
                .orElse(null);
    }

    public Animal getAnimaleConAperturaAlarePiuGrande() {
        return animali.stream()
                .filter(a -> a instanceof WingAnimal)
                .max(Comparator.comparingDouble(a -> ((WingAnimal) a).getWingspan()))
                .orElse(null);


    }
}
