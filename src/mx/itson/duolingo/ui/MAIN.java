/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.duolingo.ui;



import java.util.Scanner;
import mx.itson.duolingo.entidades.CURSO;
import mx.itson.duolingo.entidades.PREGUNTA;
import mx.itson.duolingo.enums.NIVEL;

/**
 *
 * @author MASTER1
 */
public class MAIN {
    
 public static void main(String[] args) {
     try (Scanner scanner = new Scanner(System.in)) {
         System.out.println("Seleccione su nivel:");
         System.out.println("1. Principiante");
         System.out.println("2. Intermedio");
         System.out.println("3. Avanzado");
         int opcion = scanner.nextInt();
         scanner.nextLine();
         
         NIVEL nivelSeleccionado;
         nivelSeleccionado = switch (opcion) {
             case 1 -> NIVEL.PRINCIPIANTE;
             case 2 -> NIVEL.INTERMEDIO;
             default -> NIVEL.AVANZADO;
         };
         
         CURSO curso = new CURSO("Curso de Inglés", nivelSeleccionado);
         
         switch (nivelSeleccionado) {
             case PRINCIPIANTE -> {
                 curso.agregarPregunta(new PREGUNTA("¿Cómo se dice 'manzana' en inglés?", "apple", 20));
                 curso.agregarPregunta(new PREGUNTA("¿Cómo se dice 'perro' en inglés?", "dog", 20));
                 curso.agregarPregunta(new PREGUNTA("¿Cómo se dice 'gato' en inglés?", "cat", 20));
                 curso.agregarPregunta(new PREGUNTA("¿Cómo se dice 'casa' en inglés?", "house", 20));
                 curso.agregarPregunta(new PREGUNTA("¿Cómo se dice 'agua' en inglés?", "water", 20));
             }
             case INTERMEDIO -> {
                 curso.agregarPregunta(new PREGUNTA("Completa la oración: 'I ___ to the park every day.'", "go", 20));
                 curso.agregarPregunta(new PREGUNTA("Traduce: 'She is studying English.'", "Ella está estudiando inglés", 20));
                 curso.agregarPregunta(new PREGUNTA("Sinónimo de 'happy' en inglés.", "joyful", 20));
                 curso.agregarPregunta(new PREGUNTA("Pasado de 'eat'", "ate", 20));
                 curso.agregarPregunta(new PREGUNTA("¿Cuál es el comparativo de 'good'?", "better", 20));
             }
             default -> {
                 curso.agregarPregunta(new PREGUNTA("Forma pasiva de 'They built a house'.", "A house was built", 20));
                 curso.agregarPregunta(new PREGUNTA("Traduce: 'If I had studied, I would have passed the exam.'", "Si hubiera estudiado, habría aprobado el examen", 20));
                 curso.agregarPregunta(new PREGUNTA("Significado de la expresión 'break the ice'.", "Romper el hielo", 20));
                 curso.agregarPregunta(new PREGUNTA("¿Cuál es el superlativo de 'far'?", "farthest", 20));
                 curso.agregarPregunta(new PREGUNTA("Define el uso del 'Present Perfect'.", "Para acciones pasadas con relevancia en el presente", 20));
             }
         }
         
         System.out.println("Bienvenido al " + nivelSeleccionado + " curso de inglés. Responde las siguientes preguntas:");
         curso.realizarExamen(scanner);
         
         System.out.println("Puntuación total: " + curso.getPuntuacion());
     }
    }
}
