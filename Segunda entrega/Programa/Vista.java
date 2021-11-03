import java.util.Scanner;
/**
 * Esta clase muestra los menus y permite al usuario interaccionar con el programa
 * 
 * @author Sebastian Estrada Tuch
 * @since 1/11/2021
 * @version 1.0
 */
class Vista{
    private int num;// Guarda los ints que escoja el usuario
    private String txt;// Guarda los Strings que escoja el usuario
    private Scanner scan;// Permite que el usuario pueda colocar sus decisiones

    /**
     * Este es el metodo constructor de la Vista
     */
    public Vista(){
        scan = new Scanner(System.in);
    }

    /**
     * Este metodo permite que el usuario escoja una accion, ya sea publicar, interartuar o filtrar posts
     * o simplemente salir del programa
     * @return retorna un Int
     */
    public int menuPrincipal(){
        try {
            System.out.println("\n1. Publicar un post\n"+
                           "2. Interactuar con un post\n"+
                           "3. Filtrar\n"+
                           "4. Mostrar todas las publicaciones\n"+
                           "5. Salir\n");
            scan = new Scanner(System.in);
            num = scan.nextInt();
            return num;
        } catch (Exception e) {
            System.out.println("HA OCURRIDO UN ERROR");
            return -150;
        }
        
    }
    /**
     * Este metodo permite que el usuario escoga el tipo de post a publicar
     * @return retorna un Int
     */
    public int tipoDePost(){
        try {
            System.out.println("\nIngrese el indice del tipo de post que desea realizar:\n"+
                           "1. Texto\n"+
                           "2. Multimedia\n"+
                           "3. Emoticon\n"+
                           "4. Back\n");
            scan = new Scanner(System.in);
            num = scan.nextInt();
            return num;
        } catch (Exception e) {
            System.out.println("HA OCURRIDO UN ERROR");
            return -150;
        }
        
    }
    /**
     * Este metodo permite al usuario designar un autor 
     * @return retorna un String
     */
    public String nuevoPostA(){
        System.out.println("\nIngrese su nombre\n");
        scan = new Scanner(System.in);
        txt = scan.nextLine();
        return txt;
    }
    /**
     * Este metodo permite que el usuario pueda generar un texto
     * @return retorna un string
     */
    public String nuevoTexto(){
        System.out.println("\nCual va a ser su texto\n");
        scan = new Scanner(System.in);
        txt = scan.nextLine();
        return txt;
    }
    /**
     * Este metodo permite que el usuario ingrese el link del archivo multimedia
     * @return retorna una String
     */
    public String nuevoMulti(){
        System.out.println("\nIngrese el link del archivo multimedia\n");
        scan = new Scanner(System.in);
        txt = scan.nextLine();
        return txt;
    }
    /**
     * Este metodo permite que el usuario ingrese el peso del archivo multimedia
     * @return retorna un String
     */
    public String nuevoMulti1(){
        System.out.println("\nIngrese el peso del archivo, ejemplo: 15kb, 20mg, 30gb, etc\n");
        scan = new Scanner(System.in);
        txt = scan.nextLine();
        return txt;
    }
    /**
     * Este metodo permite que el usuario coloque informacion relevante sobre un archivo multimedia
     * @return retorna un String 
     */
    public String nuevoMulti2(){
        System.out.println("Ingrese la siguiente informacion:\ntipo de archivo y framerate(Si es video),frecuencia(si es audio) o resolucion(Si es imagen)\n");
        scan = new Scanner(System.in);
        txt = scan.nextLine();
        return txt;
    }
    /**
     * Este metodo permite que el usuario escoja un emote para publicar
     * @return retorna un int
     */
    public int nuevoEmote(){
        try {
            System.out.println("\nIngrese el indice del emoticono que desea publicar \n");
            scan = new Scanner(System.in);
            num = scan.nextInt();
            return num;
        } catch (Exception e) {
            System.out.println("HA OCURRIDO UN ERROR");
            return -150;
        }
        
    }
    /**
     * Este metodo permite crear un hashtag o asignarle un hastag preexistente 
     * @return retorna un String 
     */
    public String nuevoHashTag(){
        try {
            System.out.println("\nIngrese el nombre del hastag\nEjemplo: life, futbol (No colocar el simbolo #)\n ");
            scan = new Scanner(System.in);
            txt = scan.nextLine();
            return txt;
        } catch (Exception e) {
            System.out.println("HA OCURRIDO UN ERROR");
            return "";
        }
        
    }

    /**
     * Este metodo permite al usuario escoger el tipo de post con el que va a interactuar
     * @return retorna un String
     */
    public String escogerIP(){
        System.out.println("\n¿Con que tipo de post va a interactuar?\nColocar de la siguiente forma: Texto, Multimedia o Emoticon\n");
        scan = new Scanner(System.in);
        txt = scan.nextLine();
        return txt;
    }
    /**
     * Este metodo permite que el usuario escoja el indice del post con el que va a interactuar
     * @return retorna un int
     */
    public int escogerElPost(){
        try {
            System.out.println("\nIngrese el indice del comentario al con el que desea interactual\n");
            scan = new Scanner(System.in);
            num = scan.nextInt();
            return num;
        } catch (Exception e) {
            System.out.println("HA OCURRIDO UN ERRROR");
            return -150;
        }
        
    }
    /**
     * Este metodo pregunta al usuario que acciones quiere realizar con un publicacion
     * @return retorna un int
     */
    public int eleccionDeI(){
        try{
            System.out.println("\n1. Dar Like\n2. Comentar\n");
            scan = new Scanner(System.in);
            num = scan.nextInt();
            return num;
        }catch(Exception e){
            System.out.println("HA OCURRIDO UN ERROR");
            return -150;
        }
    }
    /**
     * Este metodo permite al usuario que ingrese un comentario
     * @return retorna un string
     */
    public String nuevoComment(){
        System.out.println("\nIngrese su comentario:\n");
        scan = new Scanner(System.in);
        txt = scan.nextLine();
        return txt;
    }

    /**
     * Este metodo pregunta al usuario por que me todo desea filtrar las publicaciones
     * @return retorna un int
     */
    public int eleccionFiltrado(){
        try{
            System.out.println("\n1. Filtrar por fecha\n2. Filtrar por Hashtag\n");
            scan = new Scanner(System.in);
            num = scan.nextInt();
            return num;
        }catch (Exception e){
            System.out.println("HA OCURRIDO UN ERROR");
            return -150;
        }
    }
    /**
     * Este metodo pregunta al usuario que fecha desea buscar entre todas las publicaciones
     * @return retorna un  String
     */
    public String filtroF(){
        System.out.println("\nIngresa que desea buscar con el siguiente formato: dia/mes/año SIN ESPACIOS\n");
        scan = new Scanner(System.in);
        txt = scan.nextLine();
        return txt;
    }
    /**
     * Este metodo pregunta al usuario que Hashtag desea buscar entre todas las publicaciones
     * @return retorna un String
     */
    public String filtroHash(){
        System.out.println("\nIngrese el nombre del hastag que desea buscar\nCon el siguiente formato: life, futbol SIN EL SIMBOLO #");
        scan = new Scanner(System.in);
        txt = scan.nextLine();
        return txt;
    }
}