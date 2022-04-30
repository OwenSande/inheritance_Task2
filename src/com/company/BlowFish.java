package com.company;

public class BlowFish extends Fish {
    private int diameterSande56272;

    BlowFish() {
        super();
        diameterSande56272 = 8;
    }

    @Override
    public void eat(String foodName) {

    }

    @Override
    public void getVoice() {

    }

    public BlowFish(String nameSande56272, int ageSande56272, int weightSande56272, String colourSande56272, int diameterSande56272) {
        super(nameSande56272, ageSande56272, weightSande56272, colourSande56272);
        this.diameterSande56272 = diameterSande56272;

    }

    public BlowFish(int ageSande56272, String colourSande56272, int diameterSande56272) {
        super(ageSande56272, colourSande56272);
        this.diameterSande56272 = diameterSande56272;
    }

    public void actionSande56272() {
        System.out.println("The BlowFish is swimming ");
    }

    @Override
    public void eatSande56272(String foodName) {
        System.out.println("The BlowFish is eating: " + foodName);
    }

    @Override
    public void getVoiceSande56272() {
        System.out.println("The blowfish is silent");
    }

    public int getDiameterSande56272() {
        return diameterSande56272;
    }

    public void setDiameterSande56272(int diameterSande56272) {
        this.diameterSande56272 = diameterSande56272;
    }

    @Override
    public String toString() {
        return

                "BlowFish{" + "Diameter=" + diameterSande56272 +
                        '}';
    }

}
