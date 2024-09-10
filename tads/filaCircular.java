package tads;

public class filaCircular {
  int[] arr;
  int cont = 0, start = 0, end = 0;

  public filaCircular() {
    arr = new int[10];
  }
  
  public filaCircular(int n) {
    arr = new int[n];
  }

  void inserirFim(int n) {
    if (cont >= arr.length) {
      System.out.println("Fila cheia !");
      return;
    }

    arr[cont] = n;
    cont++;
    end++;
  }

  int removerInicio() {
    if (cont == 0) {
      System.out.println("Fila vazia !");
      return -1;
    }

    int res = arr[start];
    start++;

    return res;
  }

  void mostrar() {
    for (int i = 0; i < cont; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) {
    filaCircular fl = new filaCircular(5);
  }
}
