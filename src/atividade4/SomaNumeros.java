package atividade4;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public int calcularSoma() {
        int n = 0;
        for (Integer numero : numeros) {
            n += numero;
        }
        return n;
    }

    public int encontrarMaiorNumero() {
        int maior = -1;

        for (Integer numero : numeros) {
            if (numero > maior)
                maior = numero;
        }
        return maior;
    }

    public int encontrarMenorNumero() {
        int menor = numeros.get(0);

        for (Integer numero : numeros) {
            if (numero < menor)
                menor = numero;
        }
        return menor;
    }
}
