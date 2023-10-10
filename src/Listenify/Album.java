package Listenify;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    public String albumName;

    public String artistName;

    public List<Song> songList;

    public Album(String albumName, String artistName) {
        this.albumName = albumName;
        this.artistName = artistName;
        this.songList =new ArrayList<>();
    }

    public boolean findSongsInAlbum(String title){
        for(Song song :songList){
            if((song.name).equals(title))
                return true;
        }
        return false;
    }
    public String addSongToAlbum(String title,double duration){
        if(findSongsInAlbum(title)==true){
            return "Already songs exist iin the Playlist";
        }
        else {
            Song newSong = new Song(title,duration);
            songList.add(newSong);
            return "New song has been addes";
        }

    }
    public String addSongToPlayList(int trackNo, LinkedList<Song> playList){

        int index=trackNo-1;
        if(index>=0 && index<this.songList.size()){
            Song song =this.songList.get(index);
            playList.add(song);
            return "Song added successfully";
        }
        return "Invalid Track Number";

    }
    public String addSongToPlayList(String title,LinkedList<Song>playList){


        for(Song song:songList){
            if(song.name==title){
                playList.add(song);
                return "Song has been successfully added";
            }
        }
         return "Song does not exist";

    }


}
