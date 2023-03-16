package one.digitalinnovation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);


        List<Double> temperaturas = new ArrayList<>();
        int count = 0;
        double temperetura = 0d;

        System.out.println("Informe a cidade em que se encontra: ");

        String cidade = sc2.nextLine();

        System.out.println("------\tDigite aqui a temperatura média referente a cada mês\t------");
        while (true){
            if (count == 6) break;
            double temp = sc.nextDouble();
            temperaturas.add(temp);
            count++;
            temperetura += temp;

        }



        double mediaTemp = temperetura/temperaturas.size();




        System.out.println("------\tTemperaturas\t------");

        System.out.println("Janeiro: " + temperaturas.get(0) + "°C");
        System.out.println("Fevereiro: " + temperaturas.get(1) + "°C");
        System.out.println("Março: " + temperaturas.get(2) + "°C");
        System.out.println("Abril: " + temperaturas.get(3) + "°C");
        System.out.println("Maio: " + temperaturas.get(4) + "°C");
        System.out.println("Junho: " + temperaturas.get(5) + "°C");

        System.out.println("A média semestral da temperatura de " + cidade + " é: " + mediaTemp);

        System.out.println("-------\tMeses acima da média\t-------");

        Iterator<Double> iterator = temperaturas.iterator();
        count = 0;
        while (iterator.hasNext()) {
            double temp = iterator.next();

            if (temp > mediaTemp) {
                switch (count){
                    case (0):
                        System.out.println("Janeiro: " + temp);break;
                    case (1):
                        System.out.println("Fevereiro: " + temp);break;
                    case (2):
                        System.out.println("Março: " + temp);break;
                    case(3):
                        System.out.println("Abril: " + temp);break;
                    case(4):
                        System.out.println("Maio: " + temp);break;
                    case(5):
                        System.out.println("Julho: " + temp);break;
                    default:
                        System.out.println("Não houve temperatura acima da média!");


                }

            }
            count++;
        }


        System.out.println("------------------------------------");


        System.out.println("Deseja ver a temperatura de um mês específico? (Responda com 's' ou 'n') ");
        String resposta = sc2.nextLine();
        if (resposta.contains("s")){
            System.out.println("Diga o mês que deseja saber: ");
            String mes = sc3.next();
            switch (mes){
                case "janeiro":
                    System.out.println(temperaturas.get(0)); break;
                case "fevereiro":
                    System.out.println(temperaturas.get(1)); break;
                case "março":
                    System.out.println(temperaturas.get(2)); break;
                case "abril":
                    System.out.println(temperaturas.get(3)); break;
                case "maio":
                    System.out.println(temperaturas.get(4)); break;
                case "julho":
                    System.out.println(temperaturas.get(5)); break;
                default:
                    System.out.println("Mês inválido");

            }
        }else {
            System.out.println("-------------------------------------");
            System.out.println("Obrigado pela atenção!");
        }

        System.out.println("-------------------------------------");
        System.out.println("Obrigado pela atenção!");



    }
}
