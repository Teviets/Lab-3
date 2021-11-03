/**
 * Esta clase muestra la informacion de un post txt
 * 
 * @author Sebastian Estrada Tuch
 * @since 1/11/2021
 * @version 1.0
 */
class TXT extends Post{
    public String texto;// Guarda el texto a publicar

    /**
     * Este es el metodo constructor de Post
     * @param aut
     * @param textito
     */
    public TXT(String aut, String textito){
        autor = aut;
        texto = textito;
    }

    /**
     * Este metodo overidea el metodo impresion que es abstracto en post
     */
    public void impresion(){
        System.out.println("\n" +autor+" ha dicho: " + texto);
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