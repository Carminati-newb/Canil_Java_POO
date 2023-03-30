package poo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class POO {
    public static void main(String[] args) {
        List<Animal> pets = new ArrayList<Animal>(100);
        Scanner ler = new Scanner(System.in);
        int option = 0;


        // Um loop com o menu inicial possibilitando o usuário de cadastrar um animal, checar ou alterar seus dados e marcar uma consulta.
        while (true) {
            
            try{
            System.out.println("-----------------------------------------------------------");
            System.out.println("1-Cadastro\n2-Status\n3-Alterar\n4-Marcas Consulta\n5-SAIR");
            System.out.println("-----------------------------------------------------------");
            option = ler.nextInt();
                        
            }
            catch(Exception e){
                System.out.println("ERRO!\nDIGITE 1(UM) NUMERO");
            }
            switch (option) {
                // Cadastra o animal.
                case 1: {
                    Animal novoAnimal = Recepcionista.cadastrarAnimal();
                    pets.add(novoAnimal);
                    System.out.println("Cadastro Concluido\nGUARDE SUA SENHA : " + pets.size());
                    break;
                }
                // Consulta o animal dado a senha. Caso a senha não exista, retorna senha inválida.
                case 2: {
                    
                    try{
                        System.out.println("Qual a senha :");
                        int senha = ler.nextInt();
                    
                      
                   
                    if (senha > pets.size() || senha < 1) {
                        System.out.println("Senha inválida!");
                        break;
                    }else{

                    System.out.println(pets.get(senha - 1));
                    break;
                    }     
                    }
                    catch(Exception e){
                        System.out.println("ERRO!\nA SENHA É INVÁLIDA E POR MOTIVOS DE SEGURANÇA O PROGRAMA SERA FECHADO");
                        return;
                    }
                }
                
                // Altera os dados para o animal dado sua senha. Caso a senha não exista, retorna senha inválida.
                case 3: {
                    
                    try{
                    System.out.println("Qual a senha :");
                    int senha = ler.nextInt();

                    if (senha > pets.size() || senha < 1) {
                        System.out.println("Senha inválida!");
                        break;
                    }

                    Animal animalModificado = Recepcionista.cadastrarAnimal();
                    pets.set(senha - 1, animalModificado);
                    break;
                    }
                    catch(Exception e){
                        System.out.println("ERRO!\nA SENHA É INVÁLIDA E POR MOTIVOS DE SEGURANÇA O PROGRAMA SERA FECHADO");
                        return;
                        
                    }
                    
                }
                // Lista as consultas disponíveis para a espécie do animal dado sua senha e a realiza.
                case 4: {
                    try{
                    System.out.println("Qual a senha :");
                    int senha = ler.nextInt();
                    
                    if (senha > pets.size() || senha < 1) {
                        System.out.println("Senha inválida!");
                        break;
                    }
                    Animal animal = pets.get(senha - 1);
                    int codigo = animal.marcarConsulta();
                    animal.realizarConsulta(codigo);
                    break;
                    }
                    catch(Exception e){
                        System.out.println("ERRO!\nA SENHA É INVÁLIDA E POR MOTIVOS DE SEGURANÇA O PROGRAMA SERA FECHADO");
                        return;
                        
                    }
                    
                }
                case 5:
                    return;
                case 6:
                    break;
            }

        }
    }
}
