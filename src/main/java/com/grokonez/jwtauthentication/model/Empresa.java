// nombre,tipo,descripcion,calle,numero,colonia,cp,idestado,estado,idmunicipio,municipio,lat,lng
package com.grokonez.jwtauthentication.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NaturalId;




@Entity
@Table(name = "empresas", uniqueConstraints = {
       /* @UniqueConstraint(columnNames = {
            "idestado"
        }),
        @UniqueConstraint(columnNames = {
            "idmunicipio"
        }) */
       
})
public class Empresa{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idestado;
    private String estado;

    private Long idmunicipio;
    private String municipio;

    private String nombre;
    private String tipo;
    private String descripcion;
    private String calle;
    private String numero;
    private String colonia;
    private String cp;
    private Double lat;
    private Double lng;
 
   
    public Empresa() {}

    public Empresa(String nombre, String tipo, String descripcion,
                    String calle, String numero,String colonia, String cp,
                    Long idestado, String estado, Long idmunicipio, 
                    String municipio, Double lat, Double lng) {
        
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.cp = cp;
        this.idestado = idestado;
        this.estado = estado;
        this.idmunicipio = idmunicipio;
        this.municipio = municipio;
        this.lat = lat;
        this.lng = lng;
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public Long getIdestado() {
        return idestado;
    }

    public void setIdestado(Long idestado) {
        this.idestado = idestado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public Long getIdmunicipio() {
        return idmunicipio;
    }

    public void setIdmunicipio(Long idmunicipio) {
        this.idmunicipio = idmunicipio;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }   

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }   

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }   

   
}