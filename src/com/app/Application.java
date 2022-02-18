package com.app;

/**
 *
 * @author Nelio Chume
 */

import com.model.Cliente;
import com.model.ContaCorrente;
import com.model.ContaPoupanca;

import java.util.Scanner;

public class Application {
    static Scanner ler = new Scanner(System.in);
    static Cliente cliente = new Cliente();
    static ContaPoupanca contaPoupanca = new ContaPoupanca(cliente);
    static ContaCorrente contaCorrente = new ContaCorrente(cliente);

    public static void main(String[] args) {
        System.out.println("Digite o nome do Cliente");
        String nome = ler.nextLine();
        cliente.setNome(nome);

        System.out.println("Digite o email do Cliente");
        String email = ler.nextLine();
        cliente.setEmail(email);

        System.out.println("Digite o contacto do Cliente");
        String contacto = ler.nextLine();
        cliente.setContacto(contacto);

        int opcaoMenu = 0;
        do{
            opcaoMenu = menu();

            switch(opcaoMenu){
                case 1: depositarContaPoupanca(); break;
                case 2: depositarContaCorrente(); break;
                case 3: levantarContaPoupanca(); break;
                case 4: levantarContaCorrente(); break;
                case 5: transferPopancaCorrente(); break;
                case 6: transferCorrentePoupanca(); break;
                case 7: imprimirContaCorrente(); break;
                case 8: imprimirContaPoupanca(); break;
                case 9: System.out.println("\n*** Terminado ***"); break;
                default: System.out.println("Opcaão invalida");
            }
        }while( opcaoMenu!= 9);
    }

    /*
    Este metodo exibe o menu para poder efectuar as operacoes
     */
    public static int menu(){
        System.out.println("\n========== [MENU] =========");
        System.out.println("1. Depositar na Conta Poupanca");
        System.out.println("2. Depositar na Conta Corrente");
        System.out.println("3. Levantar na Conta Poupanca");
        System.out.println("4. Levantar na Conta Corrente");
        System.out.println("5. Transferir da Conta Poupanca para Conta Corrente");
        System.out.println("6. Transferir da Conta Corrente para Conta Poupanca");
        System.out.println("7. Imprimir Conta Corrente");
        System.out.println("8. Imprimir Conta Poupanca");
        System.out.println("9. Sair");
        System.out.print("Digite a opcao desejada: ");

        return ler.nextInt();
    }

     /*
    Este metodo permite efectuar o levantamento na Conta Poupanca
     */
    static String levantarContaPoupanca(){
        System.out.println("Digite o valor que queira levantar");
        double valor = ler.nextDouble();
         return contaPoupanca.sacar(valor);
    }

     /*
    Este metodo permite efectuar o deposito na Conta Poupanca
     */
    static String depositarContaPoupanca(){
        System.out.println("Digite o valor que queira depositar");
        double valor = ler.nextDouble();
        return contaPoupanca.depositar(valor);
    }

     /*
    Este metodo permite efectuar a transferencia da Conta Poupanca para Conta Corrente
     */
    static String transferPopancaCorrente(){
        System.out.println("Digite o valor que queira transferir para a Conta Corrente");
        double valor = ler.nextDouble();
        return contaPoupanca.transferir(valor, contaCorrente);
    }

    /*
    Este metodo permite visualizar a Conta Poupanca
     */
    static void imprimirContaPoupanca(){
        contaPoupanca.imprimirExtrato();
    }

     /*
    Este metodo permite efectuaar o levantamento na Conta Corrente
     */
    static String levantarContaCorrente(){
        System.out.println("Digite o valor que queira levantar");
        double valor = ler.nextDouble();
        return contaCorrente.sacar(valor);
    }

    /*
    Este metodo permite efectuar o deposito na Conta Corrente
     */
    static String depositarContaCorrente(){
        System.out.println("Digite o valor que queira depositar");
        double valor = ler.nextDouble();
        return contaCorrente.depositar(valor);
    }

     /*
    Este metodo permite efectuar a transferencia da Conta Corrente para Conta Poupanca
     */
    static String transferCorrentePoupanca(){
        System.out.println("Digite o valor que queira transferir para a Conta Poupanca");
        double valor = ler.nextDouble();
        return contaPoupanca.transferir(valor, contaPoupanca);
    }

    /*
    Este metodo permite visualizar a Conta Corrente
     */
    static void imprimirContaCorrente(){
        contaCorrente.imprimirExtrato();
    }
}
