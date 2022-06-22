package com.codedifferently.assessment01.part02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PetOwner {
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    private String name;
    private Pet[]pets;
    public PetOwner(String name, Pet... pets) {
        this.name=name;
        this.pets=new Pet[1];

    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        Pet[]newPet= new Pet[pets.length+1];
        for(int i =0;i<pets.length;i++){
            newPet[i]=pets[i];
        }
        newPet[pets.length]=pet;
        this.pets=newPet;

    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        List<Pet> petlist = new ArrayList<Pet>(Arrays.asList(pets));
        petlist.remove(pet);
        this.pets=petlist.toArray(pets);

    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        for(int i =0;i<getPets().length;i++){
            if(pets[i].getName()==pet.getName()){
                return true;
            }
        }
        return false;

    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        /*
        int min=0;
        if(!pets.isEmpty()) {
            min = pets.get(0).getAge();
        }
        for(int i =0;i<pets.size();i++){
            if(pets.get(i).getAge()<min){
                min=pets.get(i).getAge();
            }
        }
        return min;

         */
        return null;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        return null;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        return null;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return pets;
    }
}
