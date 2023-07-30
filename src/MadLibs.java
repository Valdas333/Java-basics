public class MadLibs {
    /*
    This program generates a mad libbed story.
    Author: Valdas
    Date: 30/07/2032
     */
    public static void main(String[] args) {
        String name1 = "Petriukas";
        String name2 = "Marina";
        String adjective1 = "lazy";
        String adjective2 = "stubborn";
        String adjective3 = "funny";
        String verb1 = "dancing";
        String noun1 = "person";
        String noun2 = "meat";
        String noun3 = "law";
        String noun4 = "ability";
        String noun5 = "love";
        String noun6 = "idea";
        String place1 = "Planet Earth";
        int number = 10;

        String story = "This morning " + name1 + " woke up feeling " + adjective1 + ". 'It is going to be a " + adjective2 + "" +
                " day!' Outside, a bunch of " + noun1 + "s were protesting to keep " + noun2 + " in stores. They began to " + verb1 + "" +
                " to the rhythm of the " + noun3 + ", which made all the " + noun4 + "s very " + adjective3 + ". Concerned, " + name1 +
                " texted " + name2 + ", who flew " + name1 + " to " + place1 + " and dropped " + name1 +
                " in a puddle of frozen " + noun5 + ". " + name1 + " woke up in the year " + number +
                ", in a world where " + noun6 + "s ruled the world.";

        System.out.println(story);
    }
}