package entidades;

import repositorio.Lista;

import java.util.ArrayList;
import java.util.Scanner;

public class Paciente {
    //Exercício 1
    public String nome;
    public String dietaAlimentar;
    public int idade;
    public double peso;
    public double altura;
    public double pressaoArterial;
    public double frequenciaCardiaca;
    public ArrayList<String> atividadesFisicas = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    //Exercício 3
    double calcularImc() {
        return peso / (altura * altura);
    }

    public void monitorar() {
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nPeso: " + peso + "\nAltura: " + altura + "\nPressão arterial: " + pressaoArterial + "\nFrequência cardíaca: " + frequenciaCardiaca + "\nDieta alimentar: " + dietaAlimentar + "\nAtividades físicas: " + atividadesFisicas + "\nIMC: " + calcularImc());
    }

    public static void registrarAtividadeFisica(int id) {
        for (Paciente paciente : Lista.lista) {
            if (id == Lista.lista.indexOf(paciente)+1) {
                String atividadeFisica;
                System.out.print("Digite a atividade física: ");
                atividadeFisica = scanner.nextLine();
                paciente.atividadesFisicas.add(atividadeFisica);
            }
        }
    }
}
