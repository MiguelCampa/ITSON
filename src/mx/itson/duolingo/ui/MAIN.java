/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.duolingo.ui;



import mx.itson.duolingo.entidades.CURSO;
import mx.itson.duolingo.entidades.PREGUNTA;
import mx.itson.duolingo.enums.NIVEL;

/**
 *
 * @author MASTER1
 */
public class MAIN {
    
 public static void main(String[] args) {
        CURSO curso = new CURSO("Inglés Básico", NIVEL.PRINCIPIANTE);

        curso.agregarPregunta(new PREGUNTA ("¿Cómo se dice 'manzana' en inglés?", "apple", 20));
        curso.agregarPregunta(new PREGUNTA("¿Cómo se dice 'perro' en inglés?", "dog", 20));
        curso.agregarPregunta(new PREGUNTA("¿Cómo se dice 'gato' en inglés?", "cat", 20));
        curso.agregarPregunta(new PREGUNTA("¿Cómo se dice 'casa' en inglés?", "house", 20));
        curso.agregarPregunta(new PREGUNTA("¿Cómo se dice 'agua' en inglés?", "water", 20));

        curso.responderPregunta(0, "apple");
        curso.responderPregunta(1, "dog");
        curso.responderPregunta(2, "cat");
        curso.responderPregunta(3, "house");
        curso.responderPregunta(4, "water");

        System.out.println("Puntuación total: " + curso.getPuntuacion());
    }
}
