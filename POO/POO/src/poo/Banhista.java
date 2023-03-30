package poo;

public class Banhista implements IFuncionario{
    @Override
    public void realizarConsulta(Animal animal) {
        System.out.println("Seu cachorro está limpinho!");
    }
}
