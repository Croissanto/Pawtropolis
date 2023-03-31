package org.example.animals;

import java.time.LocalDate;


public class Main {


    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Lion leone1 = new Lion("Simba", "Carne", 3, LocalDate.now(), 100, 1.2, 1.5);
        Lion leone2 = new Lion("Nala", "Carne", 4, LocalDate.now(), 120, 1.3, 2.0);

        Tiger tigre1 = new Tiger("Shere Khan", "Carne", 5, LocalDate.now(), 150, 1.5, 1.8);
        Eagle aquila1 = new Eagle("Thunderbolt", "Carne", 2, LocalDate.now(), 5, 0.3, 1.2);
        Eagle aquila2 = new Eagle("Lightning", "Carne", 4, LocalDate.now(), 4, 0.2, 1.0);

        zoo.addAnimal(leone1);
        zoo.addAnimal(leone2);
        zoo.addAnimal(tigre1);
        zoo.addAnimal(aquila1);
        zoo.addAnimal(aquila2);

        // Stampa tutti gli animali
        System.out.println("Elenco di tutti gli animali dello zoo:");
        for (Animal animale : zoo.getAnimali()) {
            System.out.println(animale.getClass().getSimpleName() + ": " + animale.getName());
        }

        // Stampa l'aquila con l'apertura alare maggiore
        System.out.println("\nAquila con l'apertura alare maggiore:");
        Eagle aquilaConAperturaAlareMaggiore = (Eagle) zoo.getAnimaleConAperturaAlarePiuGrande();
        if (aquilaConAperturaAlareMaggiore != null) {
            System.out.println("Nome: " + aquilaConAperturaAlareMaggiore.getName());
            System.out.println("Apertura alare: " + aquilaConAperturaAlareMaggiore.getWingspan());
        } else {
            System.out.println("Nessuna aquila trovata.");


        }

        System.out.println("\nAnimale con coda maggiore:");
        TailAnimal tailAnimalWithLongestTail = (TailAnimal) zoo.getAnimaleConCodaPiuLunga();
        if (tailAnimalWithLongestTail != null) {
            System.out.println("Nome: " + tailAnimalWithLongestTail.getName());
            System.out.println("Lunghezza coda: " + tailAnimalWithLongestTail.getTailLength());
        } else {
            System.out.println("Nessun animale con coda trovato.");


        }

    }


}




