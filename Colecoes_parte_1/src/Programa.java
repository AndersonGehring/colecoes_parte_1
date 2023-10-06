package application;

import java.util.*;

import static java.util.Collections.*;

public class Programa {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        List list = new ArrayList<String>();
        List listM = new ArrayList<String>();
        List listF = new ArrayList<String>();

        System.out.print("Digite o nome das pessoas separados por virgula seguido de um espaço: ");
        String nome = sc.nextLine();
        String[] nomes = nome.split(", ");

        for(int i=0; i< nomes.length; i++) {
            System.out.print("Qual o sexo de: " + nomes[i] + " (f/m)");
            char sexo = sc.nextLine().charAt(0);
            if(sexo == 'f'){
                listF.add(nomes[i]);
            }
            else{
                listM.add(nomes[i]);
            }
        }

        for(int i=0; i<nomes.length; i++) {
            list.add(nomes[i]);
        }

        System.out.println();
        System.out.println("Sem ordenação: " + list);
        Collections.sort(list);
        System.out.println("Com ordenação: " + list);
        System.out.println();

        System.out.println("Pessoas do sexo Feminino: " + listF);
        System.out.println("Pessoas do sexo Masculino: " + listM);


        sc.close();
    }
}
