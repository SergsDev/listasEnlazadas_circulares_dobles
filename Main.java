import java.util.Scanner;

/**
 * Main
 */
public class Main {

  public static void main(String[] args){

    Lista lista = new Lista();
    Nodo nodo = new Nodo();
    Scanner scanner = new Scanner(System.in);
    nodo.siguienteNodo = null;
    nodo.informacion = 12;
    int opcion = 0;

    lista.primero = nodo;
    Nodo puntero = lista.primero;

    while (opcion != 2) {
      nodo = new Nodo();
      nodo.siguienteNodo = null;
      System.out.println("Ingrese un numero");
      nodo.informacion = scanner.nextInt();
      puntero.siguienteNodo = nodo; 

      puntero = puntero.siguienteNodo;
      System.out.println("Desea seguir, 1.si, 2.no");
      opcion = scanner.nextInt();
    }

    puntero = lista.primero;

    while (puntero != null){
      System.out.println(puntero.informacion);
      puntero = puntero.siguienteNodo;
    }
  }

  public static class Nodo {
    int informacion;
    Nodo siguienteNodo;

  }

  public static class Lista{
    Nodo primero;
  }

}
