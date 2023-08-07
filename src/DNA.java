public class DNA {
    /*
    Function that determines is strand of DNA protein or not.
     */
    public boolean isProtein(String strand){
        if(strand.length()% 3 != 0){
            return false;
        } else if ((strand.substring(0, 3).equals("ATG")) && (strand.substring(strand.length()-3, strand.length()).equals("TGA"))) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
    DNA strand1 = new DNA();
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";
    System.out.println(strand1.isProtein(dna1));
    System.out.println(strand1.isProtein(dna2));
    System.out.println(strand1.isProtein(dna3));
    }
}

