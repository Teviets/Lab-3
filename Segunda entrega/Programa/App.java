import java.util.ArrayList;
/**
 * Esta clase genera que el usuario utilice y maniobre los diversos posts
 * 
 * @author Sebastian Estrada
 * @since 1/11/2021
 * @version 1.0
 */
class App{
    private ArrayList<TXT> textos = new ArrayList<TXT>();// Guarda los textos publicados
    private ArrayList<Multimedia> multi = new ArrayList<Multimedia>();// Guarda los post de multimedia
    private ArrayList<Emote> emoticones = new ArrayList<Emote>();// Guarda los post de emoticones

    /**
     * Este es el metodo constructor de APP
     */
    public App(){
        textos.add(new TXT("Sebastian","Que onda como vas??"));
        textos.get(0).setFecha("1/11/2021");
        textos.get(0).setHora("13:56");
        textos.get(0).nuevoHash("life");
        textos.get(0).nuevoHash("queHayDeNuevoViejo");
        textos.add(new TXT("Juan Pedro", "Si puedera jugar Fut ahorita jugaria como maradona"));
        textos.get(1).setFecha("1/11/2021");
        textos.get(1).setHora("11:56");
        textos.get(1).nuevoHash("Maradoniano");
        textos.get(1).nuevoHash("futbol");
        textos.add(new TXT("Ingrid","Me compre un nuevo carro ¡¡¡AL FIIIIN!!!"));
        textos.get(2).setFecha("30/10/2021");
        textos.get(2).setHora("18:36");
        textos.get(2).nuevoHash("life");
        textos.get(2).nuevoHash("Car");
        multi.add(new Multimedia("Sebastian","https://www.youtube.com/watch?v=Xltvgnl0kYI","5 mb","30fps es MP4"));
        multi.get(0).setFecha("1/11/2021");
        multi.get(0).setHora("13:56");
        multi.get(0).nuevoHash("Progra");
        multi.get(0).nuevoHash("life");
        emoticones.add(new Emote("Oscar",3));
        emoticones.get(0).setFecha("3/9/2021");
        emoticones.get(0).setHora("20:06");
        emoticones.get(0).nuevoHash("futbol");
        emoticones.get(0).nuevoHash("mood");

    }

    /**
     * Este metodo imprime todas las publicaciones de la red social
     */
    public void mostrarTodasLaspublicaciones(){
        for(int i = 0; i<textos.size(); i++){
            System.out.println("Textos: "+i);
            textos.get(i).impresion();
        }
        for (int i=0; i<multi.size(); i++){
            System.out.println("Multimedia: " + i);
            multi.get(i).impresion();
        }
        for (int i = 0; i<emoticones.size(); i++){
            System.out.println("Emoticon: "+i);
            emoticones.get(i).impresion();
        }
    }

    /**
     * Este metodo muestra todos los post de una fecha especifica
     * @param f
     */
    public void filtroF(String f){
        try {
            for(int i = 0; i<textos.size();i++){
                if((textos.get(i).getFecha().equals(f)) == true){
                    textos.get(i).impresion();
                }
            }
            for(int i = 0; i<multi.size();i++){
                if(multi.get(i).getFecha().equals(f) == true){
                    multi.get(i).impresion();
                }
            }
            for(int i = 0; i<emoticones.size();i++){
                if(emoticones.get(i).getFecha().equals(f) == true){
                    emoticones.get(i).impresion();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage() + "\nPudiste ingresar mal la informacion");
        }
        System.out.println("----------------------------------Hasta aqui llegan las publicaciones de "+ f+"--------------------------------------------------------");
        
    }

    /**
     * Este metodo muestra todos los post que tienen un hastag especifico
     * @param hashhash
     */
    public void filtroHash(String hashhash){
        try {
            for(int i = 0; i<textos.size();i++){
                for (int j=0; j<textos.get(i).getHastags().size(); j++){
                    if (textos.get(i).getHastags().get(j).equals(hashhash) == true){
                        textos.get(i).impresion();
                    }
                }
            }
            for(int i = 0; i<multi.size();i++){
                for (int j=0; j<multi.get(i).getHastags().size(); j++){
                    if (multi.get(i).getHastags().get(j).equals(hashhash) == true){
                        multi.get(i).impresion();
                    }
                }
            }
            for(int i = 0; i<emoticones.size();i++){
                for (int j=0; j<emoticones.get(i).getHastags().size(); j++){
                    if (emoticones.get(i).getHastags().get(j).equals(hashhash) == true){
                        emoticones.get(i).impresion();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage()+"\nPuede que no exista este mensaje");
        }
        System.out.println("--------------------------------------------------Hasta aqui llegan las publicacion con el hashtag "+hashhash+"--------------------------------------------------------");
    }

    /**
     * Este metodo establece un nuevo post de txt
     * @param aut
     * @param txt
     * @param has1
     * @param has2
     */
    public void nuevoTexto(String aut,String txt,String has1,String has2){
        try {
            TXT momentum = new TXT(aut,txt);
            momentum.verificadorFecha();
            momentum.verificadorHora();
            momentum.nuevoHash(has1);
            momentum.nuevoHash(has2);
            textos.add(momentum);
        } catch (Exception e) {
            System.out.println(e.getMessage() + "\nNo ingreso bien los datos");
        }
    }
    /**
     * Este metodo establece un nuevo post de multimedia
     * @param aut
     * @param link
     * @param w
     * @param info
     * @param has1
     * @param has2
     */
    public void nuevoMulti(String aut,String link,String w, String info,String has1,String has2){
        try {
            Multimedia momentum = new Multimedia(aut,link,w,info);
            momentum.verificadorFecha();
            momentum.verificadorHora();
            momentum.nuevoHash(has1);
            momentum.nuevoHash(has2);
            multi.add(momentum);
        } catch (Exception e) {
            System.out.println(e.getMessage() + "\nNo has ingresado correctamente los datos");
        }
        
    }
    /**
     * Este metodo establece un nuevo post de emoticono
     * @param auto
     * @param i
     * @param has
     * @param has1
     */
    public void nuevoEmote(String auto,int i,String has,String has1){
        try {
            Emote momentum = new Emote(auto, i);
            momentum.verificadorHora();
            momentum.nuevoHash(has);
            momentum.nuevoHash(has1);
            emoticones.add(momentum);
        } catch (Exception e) {
            System.out.println(e.getMessage()+"\nNo se ha ingresado correctamente la informacion");
        }
        

    }

    /**
     * Este metodo permite asignar comentarios a los post
     * @param comentario
     * @param tipoDePost
     * @param indice
     */
    public void nuevoComentario(String comentario,String tipoDePost,int indice){
        try {
            if (tipoDePost.equals("Multimedia") == true){
                multi.get(indice).nuevoComent(comentario);
            }else if(tipoDePost.equals("Texto") == true){
                textos.get(indice).nuevoComent(comentario);
            }else if(tipoDePost.equals("Emoticon") == true){
                emoticones.get(indice).nuevoComent(comentario);
            }
        } catch (Exception e) {
            System.out.println("No se ingresaron los datos correctamente");
        }
        
    }
    /**
     * Este metodo establece los respectivos likes de las publicaciones
     * @param tipo
     * @param indice
     */
    public void darLike(String tipo, int indice){
        try {
            if (tipo.equals("Multimedia") == true){
                multi.get(indice).nuevoLike();
            }else if(tipo.equals("Texto") == true){
                textos.get(indice).nuevoLike();
            }else if(tipo.equals("Emoticon") == true){
                emoticones.get(indice).nuevoLike();
            }
        } catch (Exception e) {
            System.out.println("No se ingresaron los datos correctamente");
        }
    }

    /**
     * Este metodo muestra todos los emotes disponibles
     */
    public void mostrarListaDeE(){
        emoticones.get(0).mostrarEmotes();
    }

}