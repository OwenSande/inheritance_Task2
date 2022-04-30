package com.company;

public abstract class Fish extends Animal{

    private String colourSande56272;

    public Fish() {
        super();
        colourSande56272 = "nn";
    }
    public Fish(String nameSande56272, int ageSande56272, int weightSande56272, String colourSande56272)
    {
        super(nameSande56272,ageSande56272,weightSande56272);
        this.colourSande56272 = colourSande56272;

    }

    public Fish( int ageSande56272, String colourSande56272)
    {
        super();
        this.colourSande56272 =colourSande56272;


    }

    public void actionSande56272()
    {
        System.out.println("Jumping jumping");
    }

    public abstract void eatSande56272(String foodName);

    @Override
    public void getVoiceSande56272()
    {
        System.out.println("The fish is silent");

    }
    @Override
    public void eatingSande56272(String foodName)
    {
        System.out.println("The fish is eating" + foodName);
    }
    public String getColourSande56272()
    {
        return colourSande56272;
    }
    public void setColourSande56272(String colourSande56272)
    {
        this.colourSande56272 = colourSande56272;
    }
    @Override
    public String toStringSande56272()
    {
        return
                "Fish"+"colourSande56272 '" + colourSande56272;
    }
}
