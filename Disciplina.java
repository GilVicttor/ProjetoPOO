public class Disciplina {
    private String nome;
	private String descricao;
    private String sigla;
    private int periodo;
    private int quantidade_creditos;

    @Override
    public String toString() {
        return "Disciplina {"+ "nome: "+ this.nome + ", descrição: " + this.descricao + ", sigla: " + this.sigla + ", período: " + this.periodo + ", quantidade de créditos= " + this.quantidade_creditos + '}';
    }

    
    public Disciplina(){
        this.nome= null;
    	this.descricao = null;
        this.periodo = 00;
        this.sigla = null;
        this.quantidade_creditos = 00;
    }
    public Disciplina(String nome, String descricao, String sigla, int periodo,int qtd_c){
        this.nome= nome;
    	this.descricao = descricao;
        this.sigla = sigla;
        this.periodo = periodo;
        this.quantidade_creditos = qtd_c;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSigla() {
        return this.sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getPeriodo() {
        return this.periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getQuantidade_creditos() {
        return this.qtd_creditos;
    }

    public void setQuatidade_creditos(int qtd_creditos) {
        this.quantidade_creditos = quantidade_creditos;
    }
    
}
