package com.company;

public abstract class Bird extends Animal
{
    private static final String nameSande56272 = "hh";
    private static final int weightSande56272 = 80;
    private String colourOfFeathersSande56272;

    public Bird()
    {
        super ();
        colourOfFeathersSande56272="NN";
    }

    public Bird (String nameSande56272, int ageSande56272, int weightSande56272, String colourofFeathersSande56272)
    {
        super (nameSande56272,ageSande56272, colourofFeathersSande56272);
        this.colourOfFeathersSande56272=colourofFeathersSande56272;
    }

    public Bird(int ageSande56272 , String colourOfFeathersSande56272){
        super(nameSande56272,ageSande56272, weightSande56272);
        this.colourOfFeathersSande56272=colourOfFeathersSande56272;
    }

    public void flyingSande56272(){
        System.out.println("Flap Flap");
    }

    @Override
    public void getVoiceSande56272() {
        System.out.println(" Bird is making sounds");
    }

    @Override
    public void eatSande56272(String foodName) {
        System.out.println(" Bird is eating: " + foodName);
    }

    public String getColourOfFeathersSande56272() {
        return colourOfFeathersSande56272;
    }

    public void setColourOfFeathersSande56272(String colourOfFeathersSande56272) {
        this.colourOfFeathersSande56272 = colourOfFeathersSande56272;
    }

    @Override
    public String toString() {

        return
                " Bird {" + "colourofFeathers='" + colourOfFeathersSande56272 + '\'' +
                        '}';

    }

}
