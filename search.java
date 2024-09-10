// algoritmos de busca linear e busca binária

public class search {
  static void linearSearch(int[] vet, int n) {
    boolean find = false;
    int pos = -1;
    for (int i = 0; i < vet.length; i++) {
      if (vet[i] == n) {
        find = true;
        pos = i;
        break;
      }
    }

    if (find) {
      System.out.println("O elemento foi achado na posição : " + pos);
    } else {
      System.out.println("O elemento não foi encontrado");
    }
  }

  static void binarySearch(int vet[], int n) {
    int left = 0;
    int right = vet.length - 1;
    int cont = 0;
    boolean find = false;
    while (left <= right && !find) {
      int middle = left + (right - left) / 2;
      cont++;

      int pos = vet[middle];

      if (pos == n) {
        System.out.println("O numero foi encontrado com " + cont + " iterações");
        find = true;
      } else if (pos < n) {
        left = ++middle;
      } else  {
        right = --middle;
      }

    }

    if (!find) {
      System.out.println("O numero não foi encontrado");
    }
  }

  public static void main(String[] args) {
    // int[] vet = { 4, 6, 1, 55, 23, 4566, 1, 3 };
    // linearSearch(vet, 200);

    int[] orderVet = {1,2,3,4,5,6,7,8,9,10};
    binarySearch(orderVet, 2);
  }
}
