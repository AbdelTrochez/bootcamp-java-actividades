
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Cancion[] canciones = new Cancion[20];
    static List<Cancion> playList = new ArrayList<>();
    static int cancionActual = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarMenu();
    }

    static{
        canciones[0] = new Cancion(1, "Shape of My Heart", "Sting", "Pop", "4:39");
        canciones[1] = new Cancion(2, "Bohemian Rhapsody", "Queen", "Rock", "5:55");
        canciones[2] = new Cancion(3, "Yesterday", "The Beatles", "Rock", "2:04");
        canciones[3] = new Cancion(4, "Like a Rolling Stone", "Bob Dylan", "Rock", "6:13");
        canciones[4] = new Cancion(5, "Smells Like Teen Spirit", "Nirvana", "Grunge", "5:01");
        canciones[5] = new Cancion(6, "Hotel California", "Eagles", "Rock", "6:30");
        canciones[6] = new Cancion(7, "Sweet Child o' Mine", "Guns N' Roses", "Rock", "5:55");
        canciones[7] = new Cancion(8, "Imagine", "John Lennon", "Rock", "3:04");
        canciones[8] = new Cancion(9, "Despacito", "Luis Fonsi", "Pop", "3:47");
        canciones[9] = new Cancion(10, "Rolling in the Deep", "Adele", "Pop", "3:48");
        canciones[10] = new Cancion(11, "Hey Jude", "The Beatles", "Rock", "7:11");
        canciones[11] = new Cancion(12, "Billie Jean", "Michael Jackson", "Pop", "4:54");
        canciones[12] = new Cancion(13, "Thunderstruck", "AC/DC", "Rock", "4:52");
        canciones[13] = new Cancion(14, "Stairway to Heaven", "Led Zeppelin", "Rock", "8:02");
        canciones[14] = new Cancion(15, "Wonderwall", "Oasis", "Rock", "4:18");
        canciones[15] = new Cancion(16,"Uptown Funk", "Mark Ronson ft. Bruno Mars", "Pop", "4:30");
        canciones[16] = new Cancion(17, "Livin' on a Prayer", "Bon Jovi", "Rock", "4:10");
        canciones[17] = new Cancion(18, "Wish You Were Here", "Pink Floyd", "Rock", "5:34");
        canciones[18] = new Cancion(19, "Hallelujah", "Leonard Cohen", "Pop", "4:39");
        canciones[19] = new Cancion(20, "Paint It Black", "The Rolling Stones", "Rock", "3:22");
    }

    private  static void mostrarMenu(){
        System.out.println("*************** SPOTIFY ***************");
        System.out.println("1) Ver Canciones Disponibles");
        System.out.println("2) Administrar mi PlayList");
        System.out.println("3) Mostrar mi PlayList");
        System.out.println("4) Reproducir mi PlayList");
        System.out.println("5) Salir");

        System.out.print("Número de la opción que quieres: ");
        int respuesta = scanner.nextInt();

        if(respuesta == 1) listarCanciones();
        if(respuesta == 2) mostrarMenuPlaylist();
        if(respuesta == 3) mostrarPlaylist();
        if(respuesta == 4) reproducirPlaylist(cancionActual);
        if(respuesta == 5) System.exit(0);
    }
    private static void listarCanciones(){
        System.out.println();
        System.out.println("*************** CANCIONES DISPONIBLES ***************");
        for(Cancion cancion : canciones){
            System.out.println(cancion.toString());
        }

        System.out.println();
        mostrarMenu();
    }

    private static void mostrarMenuPlaylist(){
        System.out.println();
        System.out.println("******* ADMINISTRAR MI PLAYLIST *******");

        System.out.println("1) Ver Canciones Disponibles");
        System.out.println("2) Agregar Canción");
        System.out.println("3) Eliminar Canción");
        System.out.println("4) Ver Mi PlayList");
        System.out.println("5) Reproducir Playlist");
        System.out.println("6) Ir a Menú");
        System.out.print("Número de la opción que quieres: ");
        int respuesta = scanner.nextInt();

        if(respuesta == 1) listarCanciones();
        if (respuesta == 2) agregarCancion();
        if (respuesta == 3) eliminarCancion();
        if (respuesta == 4) mostrarPlaylist();
        if (respuesta == 5) reproducirPlaylist(cancionActual);
        if (respuesta == 6) System.out.println(); mostrarMenu();
    }
    private static void agregarCancion(){
        System.out.println();
        System.out.println("******* AGREGAR CANCIÓN A MI PLAYLIST *******");
        System.out.print("Código de Canción: ");
        int codigo = scanner.nextInt();

        if(codigo <= canciones.length && codigo > 0){
            if(playList.contains(canciones[codigo-1])){
                System.out.println("Esta canción ya existe en la PlayList");
            }else{
                playList.add(canciones[codigo-1]);
                System.out.println("Canción Agregada");
            }
        }else{
            System.out.println("No se encuentra una canción con ese código");
        }

        mostrarMenuPlaylist();
    }
    private static void eliminarCancion(){
        System.out.println();
        System.out.println("******* EIMINAR CANCIÓN DE MI PLAYLIST *******");
        System.out.print("Código de Canción: ");
        int codigo = scanner.nextInt();

        if(playList.contains(canciones[codigo-1])){
            playList.remove(canciones[codigo-1]);
            System.out.println("Canción Eliminada");
        }else{
            System.out.println("No se encuentra la canción en la PlayList");
        }

        mostrarMenuPlaylist();
    }
    private static void mostrarPlaylist(){
        System.out.println();
        System.out.println("*************** MI PLAYLIST ***************");

        if (playList.isEmpty()) System.out.println("PlayList Vacía");

        for(Cancion cancion : playList){
            System.out.println(cancion.toString());
        }

        System.out.println();

        mostrarMenu();
    }
    private static void reproducirPlaylist(int reproduciendo){
        System.out.println();
        System.out.println("*************** REPRODUCIR PLAYLIST ***************");

        if (playList.isEmpty()) {
            System.out.println("PlayList Vacía");
            System.out.println();
            mostrarMenu();
        }
        else {
            System.out.println("Reproduciendo " + playList.get(reproduciendo).toString());
            mostrarMenuReproductor();
        }

    }
    private static void mostrarMenuReproductor(){
        System.out.println();
        System.out.println("1) Anterior");
        System.out.println("2) Siguiente");
        System.out.println("3) Detener Reproducción");
        System.out.print("Número de la opción que quieres: ");
        int respuesta = scanner.nextInt();

        if(respuesta == 1) reproducirAnterior();
        if(respuesta == 2) reproducirSiguiente();
        if(respuesta == 3) cancionActual=0; System.out.println(); mostrarMenu();
    }
    private static void reproducirAnterior(){

            if (cancionActual-1 >= 0){
                cancionActual--;
                reproducirPlaylist(cancionActual);
            }else{
                System.out.println("Esta es la primera canción de la PlayList");
                reproducirPlaylist(cancionActual);
            }

        mostrarMenuReproductor();
    }
    private static void reproducirSiguiente(){

            if (cancionActual+1 < playList.size()){
                cancionActual++;
                reproducirPlaylist(cancionActual);
            }else{
                System.out.println("Esta es la última canción de la PlayList");
                reproducirPlaylist(cancionActual);
            }

        mostrarMenuReproductor();
    }
}
