/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.duolingo.entidades;

/**
 *
 * @author MASTER1
 */
public class PREGUNTA {

    /**
     * @param enunciado the enunciado to set
     */
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    /**
     * @return the respuestaCorrecta
     */
    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    /**
     * @param respuestaCorrecta the respuestaCorrecta to set
     */
    public void setRespuestaCorrecta(String respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }

    /**
     * @return the puntos
     */
    public int getPuntos() {
        return puntos;
    }

    /**
     * @param puntos the puntos to set
     */
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    private String enunciado;
    private String respuestaCorrecta;
    private int puntos;

    public PREGUNTA(String enunciado, String respuestaCorrecta, int puntos) {
        this.enunciado = enunciado;
        this.respuestaCorrecta = respuestaCorrecta;
        this.puntos = puntos;
    }

    public int verificarRespuesta(String respuesta) {
    return respuesta.equalsIgnoreCase(getRespuestaCorrecta()) ? getPuntos(): 0;
    }

    public String getEnunciado() {
        return enunciado;
    }
}
