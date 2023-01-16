import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class framework implements Comparable{

    String nome = "";
    public static void main(String[] args) {

        //List<Double> notas = List.of(1d, 4., 5d) ====== igualmente imutável
//        List<Double> notas = Arrays.asList(1d, 4., 5d); ====== não pode adicionar nem remover itens novos
//        notas.add(3.);
//        System.out.println(notas); --------------- DA ERRO -------------------

        List<Integer> n = new ArrayList<>();
        n.add(1);
        n.add(5);
        n.add(1, 6);
        System.out.println(Collections.max(n));
        Iterator<Integer> iterator = n.iterator();
        int sum = 0;
        while(iterator.hasNext()) {
            int num = iterator.next();
            sum += num;
        }
        System.out.println(sum);
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        return this.getNome().compareTo(((framework) o).getNome());
    }
}
