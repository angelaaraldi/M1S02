import entidades.Paciente;
import repositorio.Lista;

import java.util.Scanner;

public class Main {
    //Exercício 4
    static Scanner scanner = new Scanner(System.in);
    static int opcao, id;

    private static void selecionar() {
        System.out.println("Escolha uma opção:\n1 - Cadastrar um novo paciente\n2 - Listar todos os pacientes\n3 - Alterar informações do paciente\n4 - Mostrar informações de um paciente\n5 - Registrar atividade física para um paciente\n6 - Remover paciente");
        opcao = scanner.nextInt();
        scanner.nextLine();
        switch (opcao) {
            case 1:
                //Exercício 5
                Lista.adicionar();
                selecionar();
                break;
            case 2:
                //Exercício 6
                Lista.listar();
                selecionar();
                break;
            case 3:
                //Exercício 7
                System.out.print("Digite o ID do paciente: ");
                id = scanner.nextInt();
                scanner.nextLine();
                for (Paciente paciente : Lista.lista) {
                    if (id == Lista.lista.indexOf(paciente) + 1) {
                        Lista.alterar(id);
                    }
                }
                selecionar();
                break;
            case 4:
                //Exercício 8
                System.out.print("Digite o ID do paciente: ");
                id = scanner.nextInt();
                scanner.nextLine();
                for (Paciente paciente : Lista.lista) {
                    if (id == Lista.lista.indexOf(paciente) + 1) {
                        Lista.buscarPorId(id);
                    }
                }
                selecionar();
                break;
            case 5:
                //Exercício 9
                System.out.print("Digite o ID do paciente: ");
                id = scanner.nextInt();
                scanner.nextLine();
                Paciente.registrarAtividadeFisica(id);
                selecionar();
                break;
            case 6:
                //Exercício 10
                System.out.print("Digite o ID do paciente: ");
                id = scanner.nextInt();
                scanner.nextLine();
                for (Paciente paciente : Lista.lista) {
                    if (id == Lista.lista.indexOf(paciente) + 1) {
                        Lista.remover(id);
                        break;
                    }
                }
                selecionar();
                break;
            default:
                System.out.println("Opção inválida");
                selecionar();
        }
    }

    public static void main(String[] args) {
        selecionar();
    }
}
