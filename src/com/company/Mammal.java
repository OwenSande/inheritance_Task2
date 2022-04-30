package com.company;

public  class Mammal extends Animal{
    private String orderSande56272;

    public Mammal(){
        super();
        orderSande56272 = "SS";
    }

    public  Mammal(String nameSande56272, int ageSande56272, int weightSande56272, String orderSande56272){
        super(nameSande56272, ageSande56272, weightSande56272);
        this.orderSande56272 = orderSande56272;
    }

    public Mammal(int ageSande56272,String orderSande56272){
        super(ageSande56272);
        this.orderSande56272 = orderSande56272;
    }

    public void drinkMilk(){System.out.println("Siup siup");}

    //public abstract void drinkMilk();

    @Override
    public void getVoice(){System.out.println("Mammal is making sounds");}

    @Override
    public void getVoiceSande56272() {

    }

    @Override
    public void eatingSande56272(String foodName) {

    }

    @Override
    public String toStringSande56272() {
        return null;
    }

    @Override
    public void eatSande56272(String foodName) {

    }

    @Override
    public  void eat(String foodName){System.out.println("Mammal is eating: "+ foodName);}

    public  String getOrder(){return orderSande56272; }

    public  void setOrder(String order){this.orderSande56272=order;}

    @Override
    public String toString(){
        return "Mamma{" +
                "order='"+ orderSande56272 + '\'' +
                '}';
    }
}
