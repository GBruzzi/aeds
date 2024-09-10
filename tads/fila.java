package tads;

public class fila {
  int[] arr;
  int cont = 0;

  public fila() {
    arr = new int[10];
  }

  public fila(int n) {
    arr = new int[n];
  }

  void inserirFim(int n) {
    if (cont >= arr.length) {
      System.out.println("Fila cheia !");
      return;
    }

    arr[cont] = n;
    cont++;
  }

  int removerInicio() {
    if (cont == 0) {
      System.out.println("Fila vazia !");
      return -1;
    }

    int res = arr[0];
    for (int i = 0; i < cont - 1; i++) {
      arr[i] = arr[i + 1];
    }

    cont--;
    return res;
  }

  void mostrar() {
    for (int i = 0; i < cont; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) {
    fila fl = new fila(4);

    for (int i = 1; i <= 4; i++) {
      fl.inserirFim(i * 5);
    }

    System.out.println("Numero removido : " + fl.removerInicio());

    fl.mostrar();
  }
}
