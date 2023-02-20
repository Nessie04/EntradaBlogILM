/*@author Ines Llopis Martinez
 * fecha 20/02
 * @param recibe datos de entrada de un articulo
 * @return datos del articulo
*/
public class EntradaBlogILM {

        public static char separador = ':';
        private int id;
        private String texto;
        private String autor;

        public EntradaBlogILM(int id, String autor, String texto) throws IllegalArgumentException {
                if (id <= 0) throw new IllegalArgumentException("El id no puede ser negativo");
                this.id = id;
                this.autor = autor;
                this.texto = texto;
        }

        @Override
        public String toString() {
                String cad = "";
                cad += "\nENTRADA DE" + separador + autor;
                cad += "\n " + texto;
                return cad;
        }

        public int getId() {
                return this.id;
        }

        public String getTexto() {
                return this.texto;
        }

        public String getAutor() {
                return this.autor.toUpperCase();
        }

        public String devuelveAutor() {
                return this.autor;
        }

        public static void main(String[] args) {
                EntradaBlogILM e1 = new EntradaBlogILM(3, "ana", "Últimas noticias, está disponible BixBy 2.0");
                System.out.println(e1);
        }
}