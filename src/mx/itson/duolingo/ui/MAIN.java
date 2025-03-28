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
         
         //Primeramente se le va a pedir que seleccione un nivel al usuario 
         //Para ver en que nivel de ingles se encuentre seleccion un numero del
         //1 al 3
         System.out.println("Seleccione su nivel:");
         System.out.println("1. Principiante");
         System.out.println("2. Intermedio");
         System.out.println("3. Avanzado");
         int opcion = scanner.nextInt();
         scanner.nextLine();
         
         
         //El case se va a encargar de acomodar tu eleccion en el nivel seleccionado
         NIVEL nivelSeleccionado;
         nivelSeleccionado = switch (opcion) {
             case 1 -> NIVEL.PRINCIPIANTE;
             case 2 -> NIVEL.INTERMEDIO;
             default -> NIVEL.AVANZADO;
         };
         
         CURSO curso = new CURSO("Curso de Ingles", nivelSeleccionado);
         
         
         //aqui se guardan cada una de las preguntas que se le seran mostrada 
         //al participante que al responder bien se le daran 20 puntos
         switch (nivelSeleccionado) {
             case PRINCIPIANTE -> {
                 curso.agregarPregunta(new PREGUNTA("¿Como se dice 'manzana' en ingles?", "apple", 20));
                 curso.agregarPregunta(new PREGUNTA("¿Como se dice 'perro' en ingles?", "dog", 20));
                 curso.agregarPregunta(new PREGUNTA("¿Como se dice 'gato' en ingles?", "cat", 20));
                 curso.agregarPregunta(new PREGUNTA("¿Como se dice 'casa' en ingles?", "house", 20));
                 curso.agregarPregunta(new PREGUNTA("¿Como se dice 'agua' en ingles?", "water", 20));
             }
             case INTERMEDIO -> {
                 curso.agregarPregunta(new PREGUNTA("Completa la oracion: 'I ___ to the park every day.'", "go", 20));
                 curso.agregarPregunta(new PREGUNTA("Traduce: 'She is studying English.'", "Ella esta estudiando ingles", 20));
                 curso.agregarPregunta(new PREGUNTA("Sinonimo de 'happy' en inglés.", "joyful", 20));
                 curso.agregarPregunta(new PREGUNTA("Pasado de 'eat'", "ate", 20));
                 curso.agregarPregunta(new PREGUNTA("¿Cual es el comparativo de 'good'?", "better", 20));
             }
             default -> {
                 curso.agregarPregunta(new PREGUNTA("Forma pasiva de 'They built a house'.", "A house was built", 20));
                 curso.agregarPregunta(new PREGUNTA("Traduce: 'If I had studied, I would have passed the exam.'", "Si hubiera estudiado, habria aprobado el examen", 20));
                 curso.agregarPregunta(new PREGUNTA("Significado de la expresión 'break the ice'.", "Romper el hielo", 20));
                 curso.agregarPregunta(new PREGUNTA("¿Cual es el superlativo de 'far'?", "farthest", 20));
                 curso.agregarPregunta(new PREGUNTA("Define el uso del 'Present Perfect'.", "Para acciones pasadas con relevancia en el presente", 20));
             }
         }
         //aqui esta el .examen que es el encargado de reproducir las preguntas 
         System.out.println("Bienvenido al " + nivelSeleccionado + " curso de ingles. Responde las siguientes preguntas:");
         curso.realizarExamen(scanner);
         
         //aqui se dira al finalizar cuanto sacaste en tu examen de ingles
         System.out.println("Puntuación total: " + curso.getPuntuacion());
     }
    }
}
