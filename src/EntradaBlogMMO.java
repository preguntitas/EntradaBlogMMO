/** Clase para manejar las entradas de un blog.
 * @author Mariano Murcia Ortuño
 * @version 1.0
 * @since 14/02/2023
 */
public class EntradaBlogMMO {
    /** separador es el carácter que separa ENTRADA DE del
     * nombre del autor
     */
    public static char separador = ':';
    private int id;
    private String texto;
    private String autor;

    /**
     * Constructor de la clase. recibe el número de entrada, el nombre del autor
     * de la entrada y el texto que contiene la entrada. Si el número de entrada
     * es negativo, lanza una excepción.
     * @param id numero de la entrada en el blog
     * @param autor Nombre autor de la entrada en el blog
     * @param texto Contenido de la entrada
     * @throws IllegalArgumentException El id no puede ser negativo
     */
    public EntradaBlogMMO(int id, String autor, String texto) throws IllegalArgumentException {
        if (id <= 0) throw new IllegalArgumentException("El id no puede ser negativo");
        this.id = id;
        this.autor = autor;
        this.texto = texto;
    }

    /**
     * Devuelve la entrada del blog con el formato adecuado
     * @return cad
     */
    @Override
    public String toString() {
        String cad = "";
        cad += "\nENTRADA DE" + separador + autor;
        cad += "\n " + texto;
        return cad;
    }

    /** Devuelve el número de la entrada
     * @return id
     */
    public int getId() {
        return this.id;
    }

    /** devuelve el texto completo de la entrada
     * @return texto
     */
    public String getTexto() {
        return this.texto;
    }

    /** devuelve el nombre del autor de la entrada en mayúsculas
     * @return autor
     */
    public String getAutor() {
        return this.autor.toUpperCase();
    }

    /* devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
    public String devuelveAutor() {
        return this.autor;
    }
     */

    /** No tiene porqué tener argumentos.
     * @param args argumentos de entrada
     */
    public static void main(String[] args) {
        EntradaBlogMMO e1 = new EntradaBlogMMO(3, "ana", "Últimas noticias, está disponible BixBy 2.0");
        System.out.println(e1);
    }
}