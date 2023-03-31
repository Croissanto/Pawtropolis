package org.example.animals;

import java.time.LocalDate;


public class Main {


    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Lion leone1 = new Lion("Simba", "Carne", 3, LocalDate.now(), 100, 1.2, 1.5);
        Lion leone2 = new Lion("Leone", "Fragola", 4, LocalDate.now(), 120, 1.3, 2.0);
        Tiger tigre1 = new Tiger("Ermenegildo", "Assenzio", 30, LocalDate.now(), 300, 2.0, 4.5);
        Tiger tigre2 = new Tiger("Dumbo", "Mirtilli", 5, LocalDate.now(), 150, 1.5, 1.8);
        Eagle aquila1 = new Eagle("Fulmine", "pasta", 2, LocalDate.now(), 5, 0.3, 1.2);
        Eagle aquila2 = new Eagle("Tuono", "Cocomero", 4, LocalDate.now(), 4, 0.2, 1.0);

        zoo.addAnimal(leone1);
        zoo.addAnimal(leone2);
        zoo.addAnimal(tigre1);
        zoo.addAnimal(tigre2);
        zoo.addAnimal(aquila1);
        zoo.addAnimal(aquila2);

        // TODO: 
        Animal aquilaConAperturaAlareMaggiore = zoo.getAnimaleConAperturaAlarePiuGrande("eagle");
        System.out.println("aquila con apertura alare maggiore: "+ aquilaConAperturaAlareMaggiore.getName());

        Animal leoneCodaPiuLunga = zoo.getAnimaleConCodaPiuLunga("lion");
        System.out.println("leone con la coda più lunga: "+ leoneCodaPiuLunga.getName());

        Animal leonePiuAlto = zoo.getAnimalePiuAlto("lion");
        System.out.println("leone piu alto: " + leonePiuAlto.getName());

        Animal aquilaPiuBassa = zoo.getAnimalePiuBasso("eagle");
        System.out.println("aquila più bassa: " + aquilaPiuBassa.getName());

        Animal aquilaPiuPesante = zoo.getAnimalePiuPesante("eagle");
        System.out.println("aquila più pesante: "+ aquilaPiuPesante.getName());

        Animal tigrePiuLeggera = zoo.getAnimalePiuLeggero("tiger");
        System.out.println("tigre più leggera: "+ tigrePiuLeggera.getName());

    }


}




