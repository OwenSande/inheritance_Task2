package com.company;

public class Dog extends Mammal{
    private String breedSande56272;

    Dog(){
        super();
        breedSande56272="SS";
    }

    public  Dog(String nameSande56272, int ageSande56272,int weightSande56272, String rzadSande56272, String breedSande56272){
        super(nameSande56272, ageSande56272,weightSande56272, rzadSande56272);
        this.breedSande56272=breedSande56272;
    }

    public Dog(int ageSande56272, String rzadSande56272, String breedSande56272){
        super(ageSande56272, rzadSande56272);
        this.breedSande56272 = breedSande56272;
    }

    public  void aport(){System.out.println("The dog is retrieving.");}

    @Override
    public void drinkMilk() {System.out.println("The dog is drinking milk.");}

    @Override
    public void getVoice(){System.out.println("The dog is barking");}

    @Override
    public void eat(String foodNameSande56272){System.out.println("The dog is eating "+ foodNameSande56272);}

    public String getBreedSande56272(){return breedSande56272;}

    @Override
    public  String toString(){
        return "Dog{" +
                "breed='" + breedSande56272 + '\''+
                '}';
    }
}
