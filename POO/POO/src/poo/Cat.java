package poo;

import java.util.Scanner;

public class Cat extends Animal {
    public Cat(String raca, int petAge, float peso, float tamanho) {
        super(raca, petAge, peso, tamanho);
    }

    // Lista as consultas disponíveis para esta espécie e retorna o código da consulta selecionado.
    public int marcarConsulta() {
        try{
        Scanner ler = new Scanner(System.in);
        Recepcionista.listarConsultaGato();

        int consulta = ler.nextInt();
        return consulta;
        }
        catch(Exception e){
            System.out.println("ERRO!\n");
            return 0;
        }
    }

    // Decide qual funcionário chamar baseando-ne no código e realiza a consulta.
    public void realizarConsulta(int codigo) {
        switch(codigo) {
            case 1:
                Veterinario veterinario = new Veterinario();
                veterinario.realizarConsulta(this);
                break;
            case 3:
                Auxiliar auxiliar = new Auxiliar();
                auxiliar.realizarConsulta(this);
                break;
            default:
                System.out.println("Esse tipo de consulta não existe");
        }
    }
}
