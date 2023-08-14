package LanguageInheritance;

public class Mayan extends Language {
    String region;
    public Mayan(String name, int numSpeakers, String region,String wordOrder){
        super(name, numSpeakers , region, wordOrder);
        this.region = "Central America";


    }

   }

