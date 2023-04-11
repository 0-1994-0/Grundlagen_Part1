public class MusicApp {

    public static void main(String[] args) {

        Album a1 = new Album(5,60,150);


        //System.out.println(a1.totalLength());
        //System.out.println(a1.averageSongLength());
        //System.out.println(a1.fitsOnMedium(5));
        a1.setNrSongs(10);
        a1.setLongestSong(1000);
        a1.setShortestSong(1);
        System.out.println(a1.averageSongLength());
        System.out.println(a1.totalLength());
        a1.getLongestSong();

    }
}
