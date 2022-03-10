import java.util.Scanner;

/**
 * Doblemente
 */
public class Doblemente {

  public static void main(String[] args){
    Lista lista = new Lista();
    Nodo nodo = new Nodo();
    Scanner scanner = new Scanner(System.in);
    int opcion = 0, aux = 0;
    Nodo puntero = new Nodo();

    while (opcion != 2) {
      if (aux != 1) {
        nodo = new Nodo();
        System.out.println("Ingrese el numero");
        nodo.informacion = scanner.nextInt();
        lista.primero = nodo;
        aux = 1;
      } else {
        puntero = nodo;
        nodo = new Nodo();
        System.out.println("Ingrese el numero");
        nodo.informacion = scanner.nextInt();
        nodo.anteriorNodo = puntero;
        puntero.siguienteNodo = nodo;

        System.out.println("Seguir? 1.Si 2.No");
        opcion = scanner.nextInt();
      }
    }

    puntero = lista.primero;

    while (puntero != null){
      System.out.println(puntero.informacion);
      puntero = puntero.siguienteNodo;
    }

  }

  public static class Nodo {

    int informacion;
    Nodo anteriorNodo;
    Nodo siguienteNodo;

    Nodo() {
      this.informacion = 0;
      this.siguienteNodo = null;
      this.anteriorNodo = null;
    }
  }

  public static class Lista{
    Nodo primero;

    Lista() {
      this.primero = null;
    }
  }
  
}
