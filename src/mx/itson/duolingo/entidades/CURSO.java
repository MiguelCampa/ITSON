/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.duolingo.entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mx.itson.duolingo.enums.NIVEL;

/**
 *
 * @author MASTER1
 */
public class CURSO {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the nivel
     */
    public NIVEL getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(NIVEL nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the preguntas
     */
    public List<PREGUNTA> getPreguntas() {
        return preguntas;
    }

    /**
     * @param preguntas the preguntas to set
     */
    public void setPreguntas(List<PREGUNTA> preguntas) {
        this.preguntas = preguntas;
    }

    /**
     * @param puntuacion the puntuacion to set
     */
    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    
    private String nombre;
    private NIVEL nivel;
    private List<PREGUNTA> preguntas;
    private int puntuacion;

    public CURSO(String nombre, NIVEL nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.preguntas = new ArrayList<>();
        this.puntuacion = 0;
    }

        public void realizarExamen(Scanner scanner) {
        for (PREGUNTA pregunta : preguntas) {
            System.out.println(pregunta.getEnunciado());
            System.out.print("Tu respuesta: ");
            String respuesta = scanner.nextLine();
            int puntosObtenidos = pregunta.verificarRespuesta(respuesta);
            puntuacion += puntosObtenidos;
            
            if (puntosObtenidos > 0) {
                System.out.println(" Correcto! Ganaste " + puntosObtenidos + " puntos.\n");
            } else {
                System.out.println(" Incorrecto! La respuesta correcta es: " + pregunta.getRespuestaCorrecta() + "\n");
            }
        }
    }    
        
    public void agregarPregunta(PREGUNTA pregunta) {
        getPreguntas().add(pregunta);
    }

    public void responderPregunta(int indice, String respuesta) {
        if (indice >= 0 && indice < getPreguntas().size()) {
            setPuntuacion(getPuntuacion() + getPreguntas().get(indice).verificarRespuesta(respuesta));
        }
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void realizarExamen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
