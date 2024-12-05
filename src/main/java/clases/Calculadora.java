package clases;
import java.util.Stack;
public class Calculadora {

    private int pilarehacer;
    private int piladesahcer;
    private int contenido;
    private int pilaresultado;
    private int Nodo;
    private int cima;
    private int n1;
    private int n2;

    public Calculadora() {
        piladesahcer = 0;
        pilarehacer = 0;
        contenido = 0;

    }

    
    public void deshacer(String texto) {

        if (!piladesahcer.isEmpty()) {

            piladesahcer.push(contenido);
            contenido = piladesahcer.pop();// elimino en desahacer 
            System.out.println("Deshaser: " + contenido);

        } else {

            System.out.println("No hay accaiones para deshacer");
        }

    }
    public void rehacer() {

        if (!pilaRehacer.isEmpty()) {

            pilaDeshaser.push(contenido);//guarada el contenido deshacer en el rehacer o el ctrol + Y
            contenido = pilaRehacer.pop();// elimino en desahacer 
            System.out.println("Rehacer: " + contenido);

        } else {

            System.out.println("No hay accaiones para rehacer");
        }

    }

    public void mostraresultadoactual() {
        Nodo nodoactual = cima;

        if (nodoactual == null) {
            System.out.println(" La pila esta vacia ");

        }

        System.out.println("El resultado de la pila es:  ");
        while (nodoactual != null) {

            System.out.println(nodoactual.dato);
            nodoactual = nodoactual.siguiente;

        }

    }

    public int suma() {

        return n1 + n2;
    }
}
