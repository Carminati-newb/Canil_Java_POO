
package poo;


public class Veterinario implements IFuncionario {
    @Override
    public void realizarConsulta(Animal animal) {
        boolean isVacinado = animal.getVacina();

        if(isVacinado) {
            System.out.println("Não é necessário vacinar seu animal, pois ele já foi vacinado");
            return;
        }

        animal.setVacina(true);
        System.out.println("Animal vacinado com sucesso");
    }
}
