package arrays1;

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        String[] estados = {"AC","AL","AP","AM","BA","CE","ES","GO","MA","MT","MS","MG","PA","PB","PR","PE","PI","RJ","RN","RS","RO","RR","RC","SP","SE","TO","DF"};

        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual sigla de estado você quer buscar?");
        String siglaBusca = leitor.nextLine();

        //Busca linear
        boolean encontrou = false;
            for (String elemento : estados) {
                if (elemento.equalsIgnoreCase(siglaBusca)){
                    encontrou = true;
                    break;
                }
            }
        if (encontrou == true){
            System.out.println("Encontrouuu :) ");
        }else{
            System.out.println("Não encontrou :( ");
        }
    }
}
