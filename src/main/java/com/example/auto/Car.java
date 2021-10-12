package com.example.auto;

public class Car {
    // Strong Dependency.......
    //private ClassicConfiguration classicConfiguration;
//    //or
//    private SportConfiguration sportConfiguration;
//
//    private FamilyConfiguration familyConfiguration;

//    public String readyForSale() {
//      classicConfiguration = new ClassicConfiguration();
//      return "Car Ready in: " + classicConfiguration.makeConfiguration();


//      sportConfiguration = new SportConfiguration();
//      return "Car Ready in: " + sportConfiguration.makeConfiguration();


//        familyConfiguration=new FamilyConfiguration();
//        return  "Car Ready in: "+ familyConfiguration.makeConfiguration();


    // Interface Week Dependency.......
//    private Configurable configuration;
//
//    public String readyForSale() {
//        configuration = new ClassicConfiguration();
//        //configuration = new SportConfiguration();
//        return "Car Ready in: " + configuration.makeConfiguration();
//    }
//}


    // Constructor Injection.......
    private  Configurable configuration;

    public Car(Configurable configuration) {
        this.configuration = configuration;
    }

    public String readyForSale() {
        return "Car Ready in: " + configuration.makeConfiguration();
    }
}


