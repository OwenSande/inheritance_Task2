package com.company;

public abstract class Pigeon extends Bird{
    private static final String colourofFeathers = "blue" ;
    private static final String colourofFeathersSande56272 ="green" ;
    private String speciesofBirdSande56272;

    Pigeon(){
        super();
        speciesofBirdSande56272 ="NN";
    }

    public Pigeon(String nameSande56272, int ageSande56272, int weightSande56272, String colourofFeathersSande56272, String speciesofBirdSande56272){
        super(nameSande56272, ageSande56272, weightSande56272,colourofFeathers);
        this.speciesofBirdSande56272 = speciesofBirdSande56272;
    }

    public Pigeon(int ageSande56272, String speciesofBirdSande56272){
        super(ageSande56272, colourofFeathersSande56272);
        this.speciesofBirdSande56272 = speciesofBirdSande56272;
    }

    public void action1(){
        System.out.println("The Pigeon is pecking wood");
    }

    @Override
    public void getVoiceSande56272() {
        System.out.println("The Pigeon is chirping");
    }

    @Override
    public void eatingSande56272(String foodName) {
        System.out.println("The Pigeon is eating: "+ foodName);
    }

    public String getSpeciesofBirdSande56272() {
        return speciesofBirdSande56272;
    }

    public void setSpeciesofBirdSande56272(String speciesofBirdSande56272) {
        this.speciesofBirdSande56272 = speciesofBirdSande56272;
    }

    @Override
    public String toString() {
        return
                "Pigeon{" + "speciesofBirdSande56272='" + speciesofBirdSande56272 + '\'' +
                        '}';

    }

}
