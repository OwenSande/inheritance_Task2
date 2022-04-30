package com.company;

abstract class Animal {
    private String nameSande56272;
    private int ageSande56272;
    private int weightSande56272;

    public Animal(){
        ageSande56272 = weightSande56272 = 0;
        nameSande56272 = "Owen";
    }

    public Animal(String nameSande56272, int ageSande56272, int weightSande56272){
        this.nameSande56272 = nameSande56272;
        this.ageSande56272 = ageSande56272;
        this.weightSande56272 = weightSande56272;

    }

    public Animal(int ageSande56272){this.ageSande56272 = ageSande56272;}

    public Animal(String nameSande56272, int ageSande56272, String colourofFeathersSande56272) {
    }

    public abstract void eat(String foodName);

    public abstract void getVoice();

    public String getNameSande56272(){return nameSande56272;}
    public void setNameSande56272(String nameSande56272){this.nameSande56272=nameSande56272;}
    public int getAgeSande56272(){return ageSande56272;}
    public void setAgeSande56272(int age){this.ageSande56272=ageSande56272;}
    public int getWeightSande56272(){return weightSande56272;}
    public void setWeightSande56272(int weight){this.weightSande56272 = weightSande56272;}

    public abstract void getVoiceSande56272();

    public abstract void eatingSande56272(String foodName);

    public abstract String toStringSande56272();

    public abstract void eatSande56272(String foodName);
}
