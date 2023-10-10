package Listenify;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static List<Album> albums = new ArrayList<>();
    public static void main(String[] args) {
        Album album = new Album("old Hindi Songs","Arijit Singh");

        album.addSongToAlbum("pathan",4.5);
        album.addSongToAlbum("Channa mereya",3.5);
        album.addSongToAlbum("Naina",5.0);

        albums.add(album);

        album= new Album("New Song","Pratek Kuhad");
        album.addSongToAlbum("kasoor",4.5);
        album.addSongToAlbum("tum mile",3.5);
        album.addSongToAlbum("baarishen",4.5);

        albums.add(album);

        LinkedList<Song> playList_1= new LinkedList<>();
        albums.get(0).addSongToPlayList("pathan",playList_1);
        albums.get(0).addSongToPlayList("Naina",playList_1);
        albums.get(1).addSongToPlayList("kasoor",playList_1);
        albums.get(1).addSongToPlayList("baarishen",playList_1);

        play(playList_1);

        }
        public static void play(LinkedList<Song> playList){
        ListIterator<Song> listIterator = playList.listIterator();

        if(playList.size()==0){
            return ;
        }

        Scanner sc= new Scanner(System.in);
        printMenu();
        System.out.println("Now Playing "+listIterator.next());

        boolean forward=true;

        boolean quit=false;
        while(quit==false){
            int choice =sc.nextInt();
            switch(choice){
                case 0:
                    quit=true;
                    break;
                case 1:
                    if(forward==false){
                        listIterator.next();
                        forward=true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println(listIterator.next().toString());
                    }
                    else {
                        System.out.println("You are at the Last");
                    }
                    break;

                case 2:
                    if(forward==true){
                        listIterator.previous();
                        forward=false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println(listIterator.previous().toString());
                    }
                    else {
                        System.out.println("you are already at the first postion of song");
                    }
                    break;
                case 3:
                    //replay
                    if(forward==true){
                        System.out.println(listIterator.previous().toString());
                        forward=false;
                    }
                    else {
                        System.out.println(listIterator.next().toString());
                        forward=true;
                    }
                    break;
                case 4:
                    printAllSong(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:

            }
        }

        }
        private static void printAllSong(LinkedList<Song> Songs){
        ListIterator <Song> listIterator =Songs.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next().toString());

        }

        }

        public static  void printMenu(){
        System.out.println("Available options\n press");
        System.out.println("0 - to quit \n"+
                "1 - to play next Song \n"+
                "2- to play previous song\n"+
                "3 - to replay the current song \n"+
                "4 - list of all songs \n"+
                "5 - print all available options\n"+
                "6 - delete current songs");

        }
    }
