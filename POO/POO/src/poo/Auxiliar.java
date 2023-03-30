package poo;

public class Auxiliar implements IFuncionario {
    @Override
    public void realizarConsulta(Animal animal) {
        System.out.println("Cortamos as unhas do seu gato.");
    }
}
