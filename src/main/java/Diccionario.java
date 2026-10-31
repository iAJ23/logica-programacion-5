
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Diccionario {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        HashMap<String, String> diccionario = new HashMap<>();

        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("casa", "house");
        diccionario.put("libro", "book");
        diccionario.put("agua", "water");
        diccionario.put("manzana", "apple");
        diccionario.put("escuela", "school");
        diccionario.put("mesa", "table");
        diccionario.put("silla", "chair");
        diccionario.put("ventana", "window");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("arbol", "tree");
        diccionario.put("flor", "flower");
        diccionario.put("comida", "food");
        diccionario.put("amigo", "friend");
        diccionario.put("coche", "car");
        diccionario.put("puerta", "door");
        diccionario.put("zapato", "shoe");
        diccionario.put("leche", "milk");

        ArrayList<String> palabras = new ArrayList<>(diccionario.keySet());

        Collections.shuffle(palabras);

        int correctas = 0;
        int incorrectas = 0;

        System.out.println("================================");
        System.out.println("   DICCIONARIO ESPAÑOL-INGLÉS");
        System.out.println("================================");
        System.out.println("Traduce las siguientes 5 palabras:");

        for (int i = 0; i < 5; i++) {

            String palabra = palabras.get(i);

            System.out.print("\nTraduce '" + palabra + "' al inglés: ");
            String respuesta = entrada.nextLine();

            // 5. Comprobar si la respuesta es correcta
            String traduccion = diccionario.get(palabra);

            if (respuesta.trim().equalsIgnoreCase(traduccion)) {
                System.out.println("¡Correcto!");
                correctas++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta es: "
                        + traduccion);
                incorrectas++;
            }
        }

        System.out.println("\n================================");
        System.out.println("       RESULTADOS FINALES");
        System.out.println("================================");
        System.out.println("Respuestas correctas: " + correctas);
        System.out.println("Respuestas incorrectas: " + incorrectas);
        System.out.println("Total de preguntas: " + (correctas + incorrectas));

        entrada.close();
    }
}
