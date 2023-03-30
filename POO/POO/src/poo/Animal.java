
package poo;

import java.util.Scanner;


public abstract class Animal {
    //Atributos 
    private String raca;
    private int petAge;
    private float peso;
    private float tamanho;
    private boolean vacina;

    //Scaner
    public Scanner ler = new Scanner(System.in);

    //Construtor
    public Animal(String raca, int petAge, float peso, float tamanho) {
        this.raca = raca;
        this.petAge = petAge;
        this.peso = peso;
        this.tamanho = tamanho;
    }

    // GET E SET
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getPetAge() {
        return petAge;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public boolean getVacina() {
        return vacina;
    }

    public void setVacina(boolean vacina) {
        this.vacina = vacina;
    }

    public String toString() {
        return "Raça: " + raca + "\nIdade: " + petAge + "\nPeso: " + peso + "\nTamanho: " + tamanho + "\nVacinado: " + vacina;
    }

    public int marcarConsulta() { return 0; }

  
    public void realizarConsulta(int codigo) {}
}
