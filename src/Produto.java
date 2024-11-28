import java.util.Objects;
import java.util.Comparator;

public class Produto implements Comparable<Produto>{
    private int codigo;
    private String nome;
    private double preço;

    public Produto(int codigo, String nome, double preço){
        setCodigo(codigo);
        setNome(nome);
        setPreço(preço);

    }

    public Produto() {
        this.codigo = 1;
        this.nome = "--Nome--";
        this.preço = 1;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public double getPreço() {
        return preço;
    }

    @Override
    public int compareTo( Produto comparar )
    {
        return Double.compare( this.preço, comparar.preço );
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", preço=" + preço +
                '}';
    }
}
