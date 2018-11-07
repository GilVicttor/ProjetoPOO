public class Horario {
    private String descricao; 
    private int aula;
    private String disciplina;
    private String professor;
    private String laboratorio;
    
    
    public Horario(){
        this.desc = null;
    	this.disc = null;
        this.prof = null;
        this.laboratorio = null;  
        this.aula = 0;
    }
    public Horario(String descricao,  int aula, String disciplina, String professor, String laboratorio){
        this.desc = descricao;
    	this.disc = disciplina;
        this.prof = professor;
        this.laboratorio = laboratorio;
        this.aula = aula;
    }
    public String getDescricao(){
    	return this.desc;
    }
    public void setDescricao(String descricao){
    	this.descricao = descricao;
    }
    public int getAula() {
        return this.aula;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }

    public String getDisciplina() {
        return this.disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getProfessor() {
        return this.professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getLaboratorio() {
        return this.laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
}
    
}
