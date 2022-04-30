package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal[] = new Animal[6];
        animal[0] = new Mammal("James Brown",2,200,"Chicken");
        animal[1] = new Mammal("John Wick",2,200,"Chicken");
        animal[2] = new Mammal("Bill",20,200,"Chicken");
        animal[3] = new Mammal("Sean",25,200,"Chicken");
        animal[4] = new Mammal("Susan",21,200,"Chicken");
        animal[5] = new Mammal("york",23,200,"Chicken");

        animal[1].getVoice();
        animal[2].getVoice();
        animal[4].getVoice();
    }
}
