/**
 * Esta clase permite que maniobrar la clase vista y la clase app, generando y desplegando las opciones necesarias
 * para generar publicaciones y filtrar las publicaciones
 * 
 * @author Sebastian Estrada
 * @since 1/11/2021
 * @version 1.0
 */
class Controlador{
    /**
     * Este es el metodo main para poder ejecutar el programa
     * @param args
     */
    public static void main(String[] args) {
        App modelo = new App();
        Vista vistita = new Vista();

        int opcion=0;
        modelo.mostrarTodasLaspublicaciones();
        while (opcion != 5) {
            opcion = vistita.menuPrincipal();
            switch (opcion) {
                case 1:
                    int el = vistita.tipoDePost();
                    if (el == 1){
                        String autor = vistita.nuevoPostA();
                        String texto = vistita.nuevoTexto();
                        String has1 = vistita.nuevoHashTag();
                        String has2 = vistita.nuevoHashTag();
                        modelo.nuevoTexto(autor, texto, has1, has2);
                    }else if(el == 2){
                        String autor = vistita.nuevoPostA();
                        String url  = vistita.nuevoMulti();
                        String w = vistita.nuevoMulti1();
                        String info = vistita.nuevoMulti2();
                        String has1 = vistita.nuevoHashTag();
                        String has2 = vistita.nuevoHashTag();
                        modelo.nuevoMulti(autor, url, w, info, has1, has2);
                    }else if(el == 3){
                        String autor = vistita.nuevoPostA();
                        modelo.mostrarListaDeE();
                        int ind = vistita.nuevoEmote();
                        String has1 = vistita.nuevoHashTag();
                        String has2 = vistita.nuevoHashTag();
                        modelo.nuevoEmote(autor, ind, has1, has2);
                    }else if(el == 4){
                        //Back
                    }else if(el>4){
                        System.out.println("HA OCURRIDO UN ERROR");
                    }
                    break;
                case 2:
                    modelo.mostrarTodasLaspublicaciones();
                    int eleccion = vistita.eleccionDeI();// tipo de accion

                    String pos = vistita.escogerIP();// tipo de post a interactual
                    int indi1 = vistita.escogerElPost();// a quien le va a
                    
                    if (eleccion == 1){
                        modelo.darLike(pos, indi1);
                    }else if(eleccion == 2){
                        String comment = vistita.nuevoComment();
                        modelo.nuevoComentario(comment, pos, indi1);
                    }
                    break;
                case 3:
                    int ele = vistita.eleccionFiltrado();
                    if (ele == 1){
                        String fecha = vistita.filtroF();
                        modelo.filtroF(fecha);
                    }else if(ele == 2){
                        String hash = vistita.filtroHash();
                        modelo.filtroHash(hash);
                    }
                    break;
                case 4:
                    modelo.mostrarTodasLaspublicaciones();
                    break;
                default:
                    // Sale del programa
                    break;
            }
        }
    }
}