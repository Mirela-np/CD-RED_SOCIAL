package com.campusdual;

import java.util.Date;

public class Comment {

    private String texto;
    private Date fechaCom;
    private User propietario;

    public Comment(String texto, Date fechaCom, User propietario) {
        this.texto = texto;
        this.fechaCom = fechaCom;
        this.propietario = propietario;
    }

    public Comment() {
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getFechaCom() {
        return fechaCom;
    }

    public void setFechaCom(Date fechaCom) {
        this.fechaCom = fechaCom;
    }

    public User getPropietario() {
        return propietario;
    }

    public void setPropietario(User propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "texto='" + texto + '\'' +
                ", fechaCom=" + fechaCom +
                ", propietario=" + propietario +
                '}';
    }
}
