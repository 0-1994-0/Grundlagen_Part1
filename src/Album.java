public class Album {

    private int nrSongs;
    private double shortestSong;
    private double longestSong;

    public Album(int nrSongs, double shortestSong, double longestSong) {
        this.nrSongs = nrSongs;
        this.shortestSong = shortestSong;
        this.longestSong = longestSong;
    }

    public int getNrSongs() {
        return nrSongs;
    }

    public void setNrSongs(int nrSongs) {
        this.nrSongs = nrSongs;
    }

    public double getShortestSong() {
        return shortestSong;
    }

    public void setShortestSong(double shortestSong) {
        this.shortestSong = shortestSong;
    }

    public double getLongestSong() {
        return longestSong;
    }

    public void setLongestSong(double longestSong) {
        this.longestSong = longestSong;
    }

    public double averageSongLength(){
        return (shortestSong+longestSong)/2;
    }

    public double totalLength(){
        return averageSongLength()*nrSongs;
    }

    public boolean fitsOnMedium(int minutes){

        if ((totalLength()/60)<=minutes){
            return true;
        } else {
            return false;
        }
    }
}
