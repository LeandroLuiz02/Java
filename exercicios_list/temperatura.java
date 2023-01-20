package exercicios_list;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* ============== AVISO DE CÓDIGO EM PORTUGLÊS ===================
Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
Após isso, calcule a média semestral das temperaturas e mostre todas as temp. acima dessa média e em que 
mês que ocorreram (mostrar o mês por extenso).
*/
public class temperatura {
    int totalElements = 6;
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        List<Double> lista = new ArrayList<>();
        for (int i = 0; i < 6; i++) { //insert all temperatures inside list
            System.out.println("digite a temp. do mês " + (i + 1));
            double temp = scan.nextDouble();
            System.out.println("Valor inserido: " + temp);
            lista.add(temp);
        }
        System.out.println("Media: " + temperatura.mediaSemestral(lista));
        temperatura.printTemperaturasOverMedia(lista);
        scan.close();
    }

    public static double mediaSemestral(List<Double> lista) {
        double total = 0d;
        int nElements = 0;
        for (double num : lista) {
            nElements++;
            total += num;
        }
        return total / nElements;
    }

    public static void printTemperaturasOverMedia(List<Double> lista) {
        double media = temperatura.mediaSemestral(lista);
        int mes = 1;
        for (double n : lista) {
            if (n > media) {
                System.out.println("Mes de " + temperatura.respectivoMes(mes) + ": " + n);
            }
        }
    }

    public static String respectivoMes(int m) {
        switch (m + 1) {
            case 1:
                return "Janeiro";
            case 2:
                return "Fevereiro";
            case 3:
                return "Março";
            case 4:
                return "Abril";
            case 5:
                return "Maio";
            case 6:
                return "Junho";
            case 7:
                return "Julho";
            case 8:
                return "Agosto";
            case 9:
                return "Setembro";
            case 10:
                return "Outubro";
            case 11:
                return "Novembro";
            case 12:
                return "Dezembro";
            default:
                return null; 
        }
    }
}
