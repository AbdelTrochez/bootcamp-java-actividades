import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer respuesta;

        System.out.println("Bienvenido a esta Aventura");

        System.out.println( "Es una noche estrellada, te encuentras en un bosque misterioso:\n" +
                            "1) Exploras la oscuridad en busca de la fuente de un susurro escalofriante\n" +
                            "2) Sigues el sendero iluminado hacia una pequeña cabaña acogedora");

        System.out.println("Elige 1 o 2 para continuar");
        respuesta = scanner.nextInt();

        if (respuesta == 1){
            System.out.println( "Sigues el sonido hasta encontrar un viejo pozo abandonado.\n" +
                                "1) Decides asomarte al pozo para investigar su origen.\n" +
                                "2) Te alejas rápidamente, sintiendo que algo siniestro acecha en la oscuridad del bosque.");

            System.out.println("Elige 1 o 2 para continuar");
            respuesta = scanner.nextInt();

            if (respuesta == 1){
                System.out.println("Decides asomarte al pozo para investigar su origen. \n" +
                        "Al asomarte, una fría mano emerge repentinamente y te arrastra hacia abajo. \n" +
                        "Nunca más vuelves a ser visto en el bosque misterioso.");
            }else{
                System.out.println("Te alejas rápidamente, sintiendo que algo siniestro acecha en la oscuridad del bosque.\n" +
                        "Mientras te alejas, una misteriosa figura se materializa a tus espaldas. \n" +
                        "Sigues corriendo sin mirar atrás, prometiéndote nunca más aventurarte en ese bosque encantado.");
            }
        }else{
            System.out.println( "Decides seguir el sendero iluminado hacia la pequeña cabaña acogedora. Al llegar a la cabaña, te das cuenta de que hay dos puertas: \n" +
                                "1) Entras por la puerta de la izquierda \n" +
                                "2) Optas por la puerta de la derecha\n");

            System.out.println("Elige 1 o 2 para continuar");
            respuesta = scanner.nextInt();

            if (respuesta == 1){
                System.out.println("Al abrir la puerta de la izquierda, te encuentras con una habitación llena de tesoros\n" +
                        "brillantes y mágicos. Te maravillas con las joyas y los objetos preciosos que llenan la sala. \n" +
                        "Te das cuenta de que has encontrado el legendario tesoro perdido del bosque. \n" +
                        "Con tu corazón lleno de emoción y riquezas, decides regresar a casa para compartir tu \n" +
                        "increíble aventura con el mundo. ¡Felicidades, has tenido un final exitoso en tu búsqueda!\n");
            }else{
                System.out.println("Optas por la puerta de la derecha y entras a la cabaña. Una vez dentro, \n" +
                        "te encuentras en una habitación llena de libros antiguos y estanterías cubiertas de polvo. \n" +
                        "Mientras exploras, descubres un libro peculiar con extraños símbolos en la portada. \n" +
                        "Sin pensarlo, abres el libro y de repente, una ráfaga de luz te envuelve, transportándote a un\n" +
                        "mundo de fantasía lleno de aventuras y magia. Te conviertes en el protagonista de tu propia \n" +
                        "historia épica en este nuevo mundo desconocido.");
            }
        }

    }
}
