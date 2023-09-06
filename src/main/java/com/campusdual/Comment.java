package com.campusdual;

import java.time.LocalDateTime;
import java.util.Date;

public class Comment {

    private String texto;
    private LocalDateTime fechaCom;
    private User propietario;

    public Comment(String texto, LocalDateTime fechaCom, User propietario) {
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

    public LocalDateTime getFechaCom() {
        return fechaCom;
    }

    public void setFechaCom(LocalDateTime fechaCom) {
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
