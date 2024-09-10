package sorts;

public class sortAlg {
  public static void main(String[] args) {
    int[] vet = { 10, 5, 2, 99, 13, 56, 33, 9090, 3, 2 };

    // selection(vet);
    // insertion(vet);
    // insertionModified(vet);
    //bubbleSort(vet);
    //binaryInsertionSort(vet);

    for (int i = 0; i < vet.length; i++) {
      System.out.println(vet[i]);
    }
  }

  public static void selection(int[] vet) {
    for (int i = 0; i < vet.length - 1; i++) {
      int menor = i;
      for (int j = i + 1; j < vet.length; j++) {
        if (vet[j] < vet[menor]) {
          menor = j;
        }
      }

      int temp = vet[i];
      vet[i] = vet[menor];
      vet[menor] = temp;
    }
  }

  public static void insertion(int[] vet) {
    for (int i = 1; i < vet.length; i++) {
      int atual = vet[i];
      int j = i - 1;
      while (j >= 0 && vet[j] > atual) {
        vet[j + 1] = vet[j];
        j--;
      }

      vet[j + 1] = atual;
    }
  }

  public static void bubbleSort(int[] vet) {
    for (int i = 0; i < vet.length - 1; i++) {
      for (int j = 0; j < vet.length - 1 - i; j++) {
        if (vet[j + 1] < vet[j]) {
          int temp = vet[j];
          vet[j] = vet[j + 1];
          vet[j + 1] = temp;
        }
      }
    }
  }

  // prova passada, pares ordenados primeiro, depois impares na ordem que aparecem
  public static void insertionModified(int[] vet) {
    for (int i = 1; i < vet.length; i++) {
      int atual = vet[i];
      int j = i - 1;

      if ((vet[j] % 2 == 0 && vet[i] % 2 == 1) || (vet[j] % 2 == 1 && vet[i] % 2 == 1)) {
        continue;
      }

      while (j >= 0 && vet[j] > atual) {
        vet[j + 1] = vet[j];
        j--;
      }

      vet[j + 1] = atual;
    }
  }

  public static int binarySearch(int[] array, int valor, int esq, int dir) {
    while (esq < dir) {
      int meio = (esq + dir) / 2;
      if (valor > array[meio]) {
        esq = meio + 1;
      } else {
        dir = meio;
      }
    }
    return esq;
  }

  // binary search no insertion sort
  public static void binaryInsertionSort(int[] vet) {
    for (int i = 1; i < vet.length; i++) {
      int key = vet[i];
      int j = binarySearch(vet, key, 0, i);
      int k = i;

      while (k > j) {
        vet[k] = vet[k - 1];
        k--;
      }
      vet[j] = key;

    }
  }
}