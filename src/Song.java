import java.lang.reflect.Array;
import java.util.*;
public class Song {

    private String title;
    private String artist;
    private ArrayList<String> listeners = new ArrayList();
    public Song(String t, String a){
        this.title = t;
        this.artist = a;
    }
    public String getTitle(){return title;}
    public String getArtist(){return artist;}

    public int howMany(ArrayList<String> arr){
        ArrayList<String> todays = new ArrayList();
        for (String i : arr){
            if (!listeners.contains(i.toLowerCase())){
                todays.add(i.toLowerCase());
                listeners.add(i.toLowerCase());}
        }
        return todays.size();
    }

}
