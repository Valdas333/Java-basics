package LanguageInheritance;

public class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    public Language(String languageName, int numSpeakers, String region, String wordOrder){
        this.name = languageName;
        this.numSpeakers = numSpeakers;
        this.regionsSpoken = region;
        this.wordOrder = wordOrder;
    }


    public void getInfo(){
        System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ". " +
                "The language follows the word order: " + wordOrder+ ".");
    }

    public static void main(String[] args) {
        Language Lithuanian = new Language("Lithuanian", 3000000,"Baltic","depends on sentences");
        Lithuanian.getInfo();
        Mayan mexicans = new Mayan("Mayan", 32);
        mexicans.getInfo();
        Language Chinese = new SinoTibetan("Chinese", 50000);
        Chinese.getInfo();
        Language Japan = new SinoTibetan("Japan", 5000000);
        Japan.getInfo();
    }
}
