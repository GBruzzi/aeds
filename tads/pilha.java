// implementação de uma pilha para inteiros

package tads;

public class pilha {
  int[] arr;
  int cont = 0;

  public pilha() {
    arr = new int[10];
  }

  public pilha(int n) {
    arr = new int[n];
  }

  void inserirFim(int n) {
    if (cont >= arr.length) {
      System.out.println("Pilha cheia, não é possível inserir " + n);
      return;
    }

    arr[cont] = n;
    cont++;
  }

  int removerFim() {
    if (cont == 0) {
      System.out.println("Pilha vazia, não há elementos para remover.");
      return -1;
    }

    return arr[--cont];
  }

  void mostrar() {
    for (int i = 0; i < cont; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) {
    pilha pi = new pilha(5);
    pi.inserirFim(5);
    pi.inserirFim(10);
    pi.inserirFim(12);
    pi.inserirFim(40);
    System.out.println("Elemento removido: " + pi.removerFim());

    pi.mostrar();
  }
}