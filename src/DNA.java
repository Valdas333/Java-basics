public class DNA {
    /*
    A function that determines whether a strand of DNA is a protein or not.
    A protein is defined between the "ATG" and "TGA" char's and is not longer than 3 char.
    Function also checks if "ATG" is not before "TGA".
     */
    public boolean isProtein(String strand){
        int proteinStartATG = strand.indexOf("ATG");
        int proteinEndATG = proteinStartATG + 3;
        int proteinStartTGA = strand.indexOf("TGA");

        if(strand.length() % 3 != 0 || proteinStartATG < 0 || proteinStartTGA < 0 || proteinStartATG + 3 > proteinStartTGA) {
            return false;
        }
        System.out.println(strand.substring(proteinEndATG,proteinStartTGA));
            return true;
    }


    public static void main(String[] args) {
    DNA strand1 = new DNA();
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";
    String dna4 = "TGAYURDGGHFDATG";
    System.out.println(strand1.isProtein(dna1));
    System.out.println(strand1.isProtein(dna2));
    System.out.println(strand1.isProtein(dna3));
    System.out.println(strand1.isProtein(dna4));
    }
}

