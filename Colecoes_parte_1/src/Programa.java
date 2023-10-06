package application;

import java.util.*;

import static java.util.Collections.*;

public class Programa {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        List list = new ArrayList<String>();

        System.out.print("Digite o nome das pessoas separados por virgula seguido de um espaço: ");
        String nome = sc.nextLine();
        String[] nomes = nome.split(", ");

        for(int i=0; i<nomes.length; i++) {
            list.add(nomes[i]);
        }

        System.out.println("Sem ordenação: " + list);
        Collections.sort(list);
        System.out.println("Com ordenação: " + list);

        sc.close();
    }
}
