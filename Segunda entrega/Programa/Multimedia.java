/**
 * Esta clase permite generar un post Multimedia
 * 
 * @author Sebastian Estrada 
 * @since  1/11/2021
 * @version 1.0
 */
class Multimedia extends Post{
    private String url;// Guarda el enlace del archivo multimedia
    private String peso;// Guarda el peso del archivo
    private String infoEx;// Guarda el tipo de archivo o cualquier informacion extra

    /**
     * Este es el metodo constructor de un post multimedia
     * @param aut
     * @param link
     * @param w
     * @param info
     */
    public Multimedia(String aut, String link,String w,String info){
        autor = aut;
        url = link;
        peso = w;
        infoEx = info;
    }
    /**
     * Este metodo overidea el metodo impresion que es abstracto en post
     */
    public void impresion(){
        System.out.println("\n" +autor+" ha publicado un archivo multimedia: " + url+"\n"+
                           "Tiene un peso de: "+ peso+"   Tiene la siguiente informacion: "+ infoEx);
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