package Listenify;

public class Song {
    public String name;
    private double duration;

    public Song(String name, double duration) {
        this.name = name;
        this.duration = duration;
    }


        public String toString(){
            return "Printing Song{" +
                    "name='" + name + '\'' +
                    ", duration=" + duration +
                    '}';
        }

    }

