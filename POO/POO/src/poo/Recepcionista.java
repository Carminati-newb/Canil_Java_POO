package poo;

import java.util.Scanner;

public class Recepcionista {
    static final String CONSULTA_TODOS = "1 - Vacinar";
    static final String CONSULTAS_CACHORRO = CONSULTA_TODOS + "\n2 - Banho";
    static final String CONSULTAS_GATO  = CONSULTA_TODOS + "\n3 - Cortar garras";

    // Cadastra o animal baseando-se em sua espécie e o retorna.
    public static Animal cadastrarAnimal() {
        try{
        Scanner ler = new Scanner(System.in);
        int tipoEspecie;

        System.out.println("Qual a espécie?\n1 - Gato\n2 - Cachorro");
                    tipoEspecie = ler.nextInt();
             
        return tipoEspecie == 1 ? cadastrarGato() : cadastrarCachorro();
        }
        catch(Exception e){
            
            System.out.println("Falha na seleção da espécie cadastrando cachorro por padrão");
            return cadastrarCachorro();
        }
    }

    private static Cat cadastrarGato() {
        try{
        Scanner ler = new Scanner(System.in);
        String r;
        int i;
        float p;
        float t;

        System.out.println("Olá, qual a raca :");
        r = ler.next();
        System.out.println("Olá, qual Idade :");
        i = ler.nextInt();
        System.out.println("Olá, qual peso :");
        p = ler.nextFloat();
        System.out.println("Olá, qual tamanho :");
        t = ler.nextFloat();

        return new Cat(r, i, p, t);
        }
        catch(Exception e){
        
            System.out.println("Algo foi digitado errado e por preucação  todos os valores foram setados em 0(zero)");
            return new Cat("0",0,0,0);
        }
    }


    private static Dog cadastrarCachorro() {
        try{
        Scanner ler = new Scanner(System.in);
        String r;
        int i;
        float p;
        float t;

        System.out.println("Olá, qual a raca :");
        r = ler.next();
        System.out.println("Olá, qual Idade :");
        i = ler.nextInt();
        System.out.println("Olá, qual peso :");
        p = ler.nextFloat();
        System.out.println("Olá, qual tamanho :");
        t = ler.nextFloat();
        
        return new Dog(r, i, p, t);
        }
        catch(Exception e){
            System.out.println("Algo foi digitado errado e por preucação  todos os valores foram setados em 0(zero)");
            return new Dog("0",0,0,0);
        }
    }

    // Lista as consultas disponíveis para cachorros.
    static void listarConsultaCachorro() {
        System.out.println(CONSULTAS_CACHORRO);
    }

    // Lista as consultas disponíveis para gatos.
    static void listarConsultaGato() {
        System.out.println(CONSULTAS_GATO);
    }
}
