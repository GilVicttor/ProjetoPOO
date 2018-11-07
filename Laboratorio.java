public class Laboratorio {
    private String descricao;
    private int capacidade;
    
    public Laboratorio() {
        this.descricao = null;
        this.capacidade = 0;        
    }
    public Laboratorio(String descricao, int capacidade){
        this.capacidade = capacidade;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "Laboratório {" + "descrição: " + this.descricao + ", capacidade: " + this.capacidade + '}';
    }
   
}
