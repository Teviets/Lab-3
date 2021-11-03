import java.util.ArrayList;
import java.util.Calendar;

/**
 * Esta clase permite generar todo lo que puede realizar un post en general, establecer propiedades, setear las mismas, retornar 
 * ciertas propiedades importantess para el programa.
 * 
 * @author Sebastian Estrada Tuch
 * @since 1/11/2021
 * @version 1.0
 */
abstract class Post{
    public String autor;// Guarda el nombre del autor
    public String fecha;// Guarda la fecha en que se publico
    public String hora;// Guarda la hora a la que se publico
    public ArrayList<String> comentarios = new ArrayList<String>();// Guarda todos los comentarios 
    public ArrayList<String> hashtags = new ArrayList<String>();// Guarda los hashtags
    public ArrayList<Integer> likes = new ArrayList<Integer>();// Guarda los likes que tiene 

    /**
     * Este es el metodo abstracto
     */
    public abstract void impresion();

    /**
     * Este metodo settea la fecha actual de en la que se publica el post
     */
    public void verificadorFecha(){
        Calendar calendario = Calendar.getInstance();

        fecha = calendario.get(Calendar.DAY_OF_MONTH)+"/"+calendario.get(Calendar.MONTH)+"/"+calendario.get(Calendar.YEAR);
    }

    /**
     * Este metodo settea la hora actual en la que se publica el post
     */
    public void verificadorHora(){
        Calendar calendario = Calendar.getInstance();

        if (calendario.get(Calendar.MINUTE)<10){
            hora = calendario.get(Calendar.HOUR_OF_DAY)+":0"+calendario.get(Calendar.MINUTE);
        }else{
            hora = calendario.get(Calendar.HOUR_OF_DAY)+":"+calendario.get(Calendar.MINUTE);
        }  
    }

    /**
     * Este metodo permite settear una fecha especifica deseada
     * @param fech
     */
    public void setFecha(String fech){
        fecha = fech;
    }

    /**
     * Este metodo permite que se settee una hora especifica
     * @param hor
     */
    public void setHora(String hor){
        hora = hor;
    }

    /**
     * Este metodo agrega un comentario de una publicacion
     * @param opinion
     */
    public void nuevoComent(String opinion){
        comentarios.add(opinion);
    }
    /**
     * Este metodo permite agregar un hastag a la publicacion
     * @param hashti
     */
    public void nuevoHash(String hashti){
        hashtags.add(hashti);
    }
    /**
     * Este metodo permite que el post reciva un like
     */
    public void nuevoLike(){
        likes.add(1);
    }

    /**
     * Este metodo imprime todos los comentarios
     */
    public void mostrarComments(){
        for (int i = 0; i<comentarios.size(); i++){
            System.out.println("\n"+comentarios.get(i));
        }
    }

    /**
     * Este es un metodo getter de la fecha 
     * @return retorna un String
     */
    public String getFecha(){
        return fecha;
    }
    /**
     * Este es un metodo getter de los hashtags del post
     * @return retorna un ArrayList de String
     */
    public ArrayList<String> getHastags(){
        return hashtags;
    }
}