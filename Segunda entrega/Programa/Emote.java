import java.util.ArrayList;

/**
 * Esta clase permite maniobrar los post de emotes
 * 
 * @author Sebastian Estrada Tuch
 * @since 1/11/2021
 * @version 1.0
 */
class Emote extends Post{
    private ArrayList<String> emotes = new ArrayList<String>();// Guarda todos los emotes a escoger
    private String eleccion; // Guarda el emote escogido 

    /**
     * Este es el metodo constructor de los post Emotes
     * @param aut
     * @param i
     */
    public Emote(String aut, int i){
        construccionEmotes();
        eleccion = emotes.get(i);
        autor = aut;
    }

    /**
     * Este metodo establece y agrega los emotes pre establecidos
     */
    public void construccionEmotes(){
        emotes.add(":-)");
        emotes.add(":-(");
        emotes.add("|:|");
        emotes.add(":-|");
        emotes.add(";-)");
        emotes.add(":)");
        emotes.add(":(");
        emotes.add("<3");
        emotes.add("(^o^)");
        emotes.add("(^_^)");
        emotes.add("{|_|}");
        emotes.add("{^o^}");
        emotes.add("(0o0)");
        emotes.add("(0-0)");
        emotes.add(";)");
    }
    /**
     * Este metodo imprime todos los emotes disponibles
     */
    public void mostrarEmotes(){
        for (int i = 0; i<emotes.size(); i++){
            System.out.println(i+".- "+emotes.get(i)+"\n");
        }
    }

    /**
     * Este metodo overidea el metodo impresion que es abstracto en post
     */
    public void impresion(){
        System.out.println("\n" +autor+" ha publicado un archivo multimedia: " + eleccion);
        if (hashtags.get(0)!=null){
            for (int i =0; i<hashtags.size(); i++){
                System.out.println("# "+hashtags.get(i)+" ");
            }
        }
        System.out.println("fecha: "+fecha+"    Hora: "+hora);
        System.out.println("Likes: "+likes.size()+"   "+"Comentarios: "+comentarios.size()+"\n"+"Comentarios:\n");
        if (comentarios.size()!=0){
            for (int i = 0; i <comentarios.size(); i++){
                System.out.println("\n"+"("+(i+1)+") "+ comentarios.get(i));
            }
        }
    }
}