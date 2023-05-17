import java.util.ArrayList;

public class Playlist{

  public static void main(String[] args){

    ArrayList<String> desertIslandPlaylist = new ArrayList<>();

    desertIslandPlaylist.add("cancion1");
    desertIslandPlaylist.add("cancion2");
    desertIslandPlaylist.add("cancion3");
    desertIslandPlaylist.add("cancion4");
    desertIslandPlaylist.add("cancion5");
    desertIslandPlaylist.add("cancion6");

    System.out.println(desertIslandPlaylist);

    System.out.println(desertIslandPlaylist.size());
    System.out.println(desertIslandPlaylist.remove(5));
    System.out.println(desertIslandPlaylist.size());
    System.out.println(desertIslandPlaylist);

    //para cambiar el orden de algunas canciones
    String temporal = desertIslandPlaylist.get(3);
    desertIslandPlaylist.set(3,  desertIslandPlaylist.get(4));
    desertIslandPlaylist.set(4, temporal);

    System.out.println(desertIslandPlaylist);
  }
}
