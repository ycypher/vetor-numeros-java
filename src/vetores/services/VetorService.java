package vetores.services;

public class VetorService {

    public Integer maiorPar(int[] numeros) {
        Integer maior = null;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                if (maior == null || numeros[i] > maior) {
                    maior = numeros[i];
                }
            }
        }
        return maior;
    }

    public Integer menorImpar(int[] numeros) {
        Integer menor = null;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                if (menor == null || numeros[i] < menor) {
                    menor = numeros[i];
                }
            }
        }
        return menor;
    }

    public int somatorio(int[] numeros) {
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        return soma;
    }

    public double media(int[] numeros) {
        return (double) somatorio(numeros) / numeros.length;
    }
}