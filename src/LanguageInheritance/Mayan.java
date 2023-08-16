package LanguageInheritance;

public class Mayan extends Language {
    String region = "Central America";;
    public Mayan(String name, int numSpeakers){
        super(name, numSpeakers , "Central America", "verb-object-subject");
    }
    @Override
    public void getInfo(){
        System.out.println("Ki'che' is spoken by 2330000 people mainly in Central America.\n" +
                "The language follows the word order: verb-object-subject\n" +
                "Fun fact: Ki'che' is an ergative language.\n");
    }
   }

