package repositorio;

import entidades.Paciente;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Lista {
    //Exercício 2
    public static ArrayList<Paciente> lista = new ArrayList<>();

    public static void listar() {
        for (Paciente paciente : lista) {
            System.out.println(lista.indexOf(paciente) + 1 + " - " + paciente.nome);
        }
    }

    public static void buscarPorId(int id) {
        for (Paciente paciente : lista) {
            if (id == lista.indexOf(paciente) + 1) {
                paciente.monitorar();
            }
        }
    }

    public static void adicionar() {
        Scanner scanner = new Scanner(System.in);
        String nome, dietaAlimentar, atividadesFisicasString;
        int idade;
        double peso, altura, pressaoArterial, frequenciaCardiaca;
        System.out.print("Nome: ");
        nome = scanner.nextLine();
        System.out.print("Idade: ");
        idade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Peso: ");
        peso = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Altura: ");
        altura = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Pressão arterial: ");
        pressaoArterial = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Frequência cardíaca: ");
        frequenciaCardiaca = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Dieta alimentar: ");
        dietaAlimentar = scanner.nextLine();
        System.out.print("Atividades físicas: ");
        atividadesFisicasString = scanner.nextLine();
        ArrayList<String> atividadesFisicas = new ArrayList<>();
        atividadesFisicas.add(atividadesFisicasString);
        Paciente paciente = new Paciente();
        paciente.nome = nome;
        paciente.idade = idade;
        paciente.peso = peso;
        paciente.altura = altura;
        paciente.pressaoArterial = pressaoArterial;
        paciente.frequenciaCardiaca = frequenciaCardiaca;
        paciente.dietaAlimentar = dietaAlimentar;
        paciente.atividadesFisicas = atividadesFisicas;
        lista.add(paciente);
    }

    public static void remover(int id) {
        ArrayList<Paciente> listaAposRemocao = new ArrayList<>();
        for (Paciente paciente : lista) {
            if (id != lista.indexOf(paciente) + 1) {
                listaAposRemocao.add(paciente);
            }
        }
        lista = listaAposRemocao;
    }

    public static void alterar(int id) {
        for (Paciente paciente : lista) {
            if (id == lista.indexOf(paciente) + 1) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Peso: ");
                paciente.peso = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Altura: ");
                paciente.altura = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Pressão arterial: ");
                paciente.pressaoArterial = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Frequência cardíaca: ");
                paciente.frequenciaCardiaca = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Dieta alimentar: ");
                paciente.dietaAlimentar = scanner.nextLine();
            }
        }
    }
}
