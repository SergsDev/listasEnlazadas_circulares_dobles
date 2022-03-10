import java.util.Scanner;

/**
 * Circular
 */
public class Circular {
public static void main(String[] args){
    Lista lista = new Lista();
    Nodo nodo = new Nodo();
    Scanner scanner = new Scanner(System.in);
    int opcion = 0, aux = 0;
    Nodo puntero = new Nodo();

    while (opcion != 2){
      if (aux == 0) {
        nodo = new Nodo();
        nodo.siguienteNodo = nodo;
        System.out.println("Ingrese el numero");
        nodo.informacion = scanner.nextInt();
        lista.primero = nodo;
        ++lista.tamaño;
        aux = 1;

      } else {

        puntero = nodo;
        nodo = new Nodo();
        System.out.println("Ingrese el numero");
        nodo.informacion = scanner.nextInt();
        nodo.siguienteNodo = lista.primero;
        puntero.siguienteNodo = nodo;
        puntero = puntero.siguienteNodo;

        ++lista.tamaño;
        System.out.println("Seguir? 1.Si 2.No");
        opcion = scanner.nextInt();

      }
    }

    aux = 0;

    while (aux < lista.tamaño) {
      System.out.println(puntero.informacion);
      puntero = puntero.siguienteNodo;
      ++aux;
    }

  }

  public static class Nodo {

    int informacion;
    Nodo siguienteNodo;

    Nodo() {
      this.informacion = 0;
      this.siguienteNodo = null;
    }
  }

  public static class Lista{
    Nodo primero;
    int tamaño;

    Lista() {
      this.primero = null;
      this.tamaño = 0;
    }
  }
}
