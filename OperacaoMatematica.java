import java.util.ArrayList;

interface OperacaoMatematicaInterface {

}

public class OperacaoMatematica implements OperacaoMatematicaInterface{
    int id = 0;
    public static void main(String args[]) {
        OperacaoMatematica op = new OperacaoMatematica();
        // int[] numeros = {1, 3, 3};
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(99);
        System.out.println(op.produto(numeros));
        System.out.println(op.soma(numeros));
        System.out.println(numeros);
        int[] arrayQualquer = {4, 6, 2, 44};
        System.out.println(arrayQualquer);
    }

    //OperacaoMatematica() {;}

    public int produto(ArrayList<Integer> numeros) {
        int produto = 1;
        for (int num : numeros) {
            produto *= num;
        }
        return produto;
    }

    public int soma(ArrayList<Integer> numeros) {
        int somaTotal = 0;
        for (int num : numeros) {
            somaTotal += num;
        }
        return somaTotal;
    }

    public int subracao(int num1, int num2) {
        return num1 - num2;
    }

    public int divisão(int num1, int num2) {
        return num1 / num2;
    }
}