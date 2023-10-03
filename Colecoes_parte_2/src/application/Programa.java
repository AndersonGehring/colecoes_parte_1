package application;

import java.util.*;

import static java.util.Collections.*;

public class Programa {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        List list = new ArrayList<String>();

        System.out.print("Digite o número de pessoas que você ira cadastrar: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i=1; i<=n; i++){
            System.out.print("Digite o " + i + "º nome: ");
            String nome = sc.nextLine();
            list.add(nome);
        }
        System.out.println("Sem ordenação: " + list);
        Collections.sort(list);
        System.out.println("Com ordenação: " + list);
    }
}
