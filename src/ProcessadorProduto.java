import java.lang.reflect.Array;
import java.util.*;

public class ProcessadorProduto {

    private NavigableSet<Produto> list = new TreeSet<>();

    public ProcessadorProduto(ArrayList<Produto> listProduto){
        list.addAll(listProduto);
    }

    public void pegarGrafico(){
        double primeiro = 0;
        int segundo = 0;

        String cont1 = "";
        String cont2 = "";
        String cont3 = "";
        String cont4 = "";
        String cont5 = "";
        String cont6 = "";
        String cont7 = "";
        String cont8 = "";
        String cont9 = "";
        String cont10 = "";
        String cont11 = "";

        for(Produto obj : list){
            primeiro += obj.getPreço();
            segundo += 1;
            if (obj.getPreço() >= 0 && obj.getPreço() <= 9){
                cont1 += "+ ";
            } else if (obj.getPreço() >= 10 && obj.getPreço() <=19) {
                cont2 += "+ ";
            } else if (obj.getPreço() >= 20 && obj.getPreço() <= 29) {
                cont3 += "+ ";
            } else if (obj.getPreço() >= 30 && obj.getPreço() <= 39) {
                cont4 += "+ ";
            } else if (obj.getPreço() >= 40 && obj.getPreço() <= 49) {
                cont5 += "+ ";
            } else if (obj.getPreço() >= 50 && obj.getPreço() <= 59) {
                cont6 += "+ ";
            } else if (obj.getPreço() >= 60 && obj.getPreço() <= 69) {
                cont7 += "+ ";
            } else if (obj.getPreço() >= 70 && obj.getPreço() <= 79) {
                cont8 += "+ ";
            } else if (obj.getPreço() >= 80 && obj.getPreço() <= 89) {
                cont9 += "+ ";
            } else if (obj.getPreço() >= 90 && obj.getPreço() <= 99){
                cont10 += "+ ";
            } else if (obj.getPreço() >= 100){
                cont11 += "+ ";
            }


        }
        System.out.println("00-09:" + cont1 + "\n" +
                "10-19:" + cont2 + "\n" +
                "20-29:" + cont3 + "\n" +
                "30-39:" + cont4 + "\n" +
                "40-49:" + cont5+ "\n" +
                "50-59:" + cont6 + "\n" +
                "60-69:" + cont7 + "\n" +
                "70-79:" + cont8 + "\n" +
                "80-89:" + cont9 + "\n" +
                "90-99:" + cont10 + "\n" +
                "  100:" + cont11 + "\n" +

                "Menor preço:" + String.format("%.0f",list.first().getPreço()) + "\n" +
                "Maior preço:" + String.format("%.0f", list.last().getPreço()) + "\n" +
                "Média dos preços: " + String.format("%.2f",list.stream().mapToDouble( a -> a.getPreço()).average().orElse(0)));


    }

}
