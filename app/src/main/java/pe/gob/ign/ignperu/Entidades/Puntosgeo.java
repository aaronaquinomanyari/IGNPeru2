package pe.gob.ign.ignperu.Entidades;

import java.util.Date;

/**
 * Created by prueba on 15/11/2016.
 */
public class Puntosgeo {
    private String id, nombre, tipo, longitud, latitud, departamento;
    private Boolean estado;
    private Date fecha;

    public Puntosgeo(String id, String nombre, String tipo, String longitud, String latitud, String departamento, Boolean estado, Date fecha) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.longitud = longitud;
        this.latitud = latitud;
        this.departamento = departamento;
        this.estado = estado;
        this.fecha = fecha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
