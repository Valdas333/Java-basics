import java.util.ArrayList;
/*
Implementation of an ArrayList class for a song playlist.
Commented lines are used for printout in the terminal via args.
 */
public class Playlist {
    public static void main(String[] args) {
        ArrayList<String> desertIslandPlaylist = new ArrayList<>();
        desertIslandPlaylist.add("Clocks");
        desertIslandPlaylist.add("Hymn for weekend");
        desertIslandPlaylist.add("Brother");
        desertIslandPlaylist.add("Up & up");
        desertIslandPlaylist.add("Levels");
        desertIslandPlaylist.add("What a wonderful world");
/*       if (args[0].equals("1")){
            System.out.println(args[0]);
            System.out.println(desertIslandPlaylist);
        }
*/
        System.out.println(desertIslandPlaylist.size());
        desertIslandPlaylist.remove("What a wonderful world");
        System.out.println(desertIslandPlaylist.size());
        // changing order of songs / swapping
        int tempSong = desertIslandPlaylist.indexOf("Levels");
        desertIslandPlaylist.set(desertIslandPlaylist.indexOf("Up & up"), "Levels");
        desertIslandPlaylist.set(tempSong,"Up & up");
        System.out.println(desertIslandPlaylist);
    }

}