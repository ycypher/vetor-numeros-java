package vetores.app;

import javax.swing.JOptionPane;
import vetores.services.VetorService;

public class ProgramaVetor {

    public static void main(String[] args) {

        int[] numeros = new int[5];
        VetorService servico = new VetorService();

        for (int i = 0; i < numeros.length; i++) {
            boolean entradaValida = false;
            while (!entradaValida) {
                String entrada = JOptionPane.showInputDialog(null,
                        "Digite o " + (i + 1) + "º número inteiro:");

                if (entrada == null) {
                    JOptionPane.showMessageDialog(null, "Programa encerrado.");
                    System.exit(0);
                }

                try {
                    numeros[i] = Integer.parseInt(entrada.trim());
                    entradaValida = true;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null,
                            "Valor inválido! Digite apenas números inteiros.",
                            "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        Integer maiorPar = servico.maiorPar(numeros);
        Integer menorImpar = servico.menorImpar(numeros);
        int soma = servico.somatorio(numeros);
        double media = servico.media(numeros);

        StringBuilder resultado = new StringBuilder();
        resultado.append("=== Resultado ===\n");

        if (maiorPar != null) {
            resultado.append("Maior número par: ").append(maiorPar).append("\n");
        } else {
            resultado.append("Maior número par: nenhum número par encontrado\n");
        }

        if (menorImpar != null) {
            resultado.append("Menor número ímpar: ").append(menorImpar).append("\n");
        } else {
            resultado.append("Menor número ímpar: nenhum número ímpar encontrado\n");
        }

        resultado.append("Soma: ").append(soma).append("\n");
        resultado.append(String.format("Média: %.2f", media));

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
