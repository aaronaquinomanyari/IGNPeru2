package pe.gob.ign.ignperu.Entidades;

/**
 * Created by prueba on 11/11/2016.
 */
public class Producto {

        private int imagen;
        private String nombre;
        private String descripcion;

        public Producto(int imagen, String nombre, String descripcion) {
            this.imagen = imagen;
            this.nombre = nombre;
            this.descripcion = descripcion;
        }

        public int getImagen() {
            return imagen;
        }

        public String getNombre() {
            return nombre;
        }

        public String getDescripcion() {
            return descripcion;
        }


}
