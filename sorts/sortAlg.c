#include <stdio.h>


void selection(int vet[], int tam) {
  for (int i = 0; i < tam - 1; i ++) {
    int menor = i;
    for (int j = i + 1; j < tam; j ++) {
      if (vet[j] < vet[menor]) {
        menor = j;
      }
    }

    int temp = vet[i];
    vet[i] = vet[menor];
    vet[menor] = temp;
  }
}


void insertion(int vet[], int tam) {
  for (int i = 1; i < tam; i ++) {
    int j = i - 1;
    int key = vet[i];

    while (j >= 0 && vet[j] > key) {
      vet[j + 1] = vet[j];
      j--;
    }

    vet[j + 1] = key;
  }
}


void bubble(int vet[], int tam) {
  int mov = 1;
  for (int i = 0; i < tam - 1 && mov; i ++) {
    mov = 0;
    for (int j = 0; j < tam - 1 - i; j ++) {
      if (vet[j + 1] < vet[j]) {
        int temp = vet[j];
        vet[j] = vet[j + 1];
        vet[j + 1] = temp;
        mov = 1;
      }
    }
  }
}


int main() {
  int vet[] = {5,63,234,345,341,4,42,2,7,56,234,3};
  int tam = sizeof(vet) / sizeof(vet[0]);

  //selection(vet, tam);
  //insertion(vet, tam);
  bubble(vet, tam);

  for (int i = 0; i < tam; i ++) {
    printf("%i\n", vet[i]);
  }

  return 0;
}

