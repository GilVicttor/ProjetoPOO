import java.util.ArrayList;

public class Curso{
  private String descricao;
  private String codigo;
  private int duracao;
  private ArrayList<Docente> professor;
  private ArrayList<Turma> turma;
  private ArrayList<Disciplina> disciplina;
  private ArrayList<Laboratorio> laboratorio;
  

  public Curso(){
    this.descricao = null;
    this.codigo = null;
    this.duracao = 0;
  }
 public Curso(String desc, String codigo, int duracao){
   this.descricao = desc;
   this.codigo = codigo;
   this.duracao = duracao;
   this.professor= new ArrayList<Docente>();
   this.turma= new ArrayList<Turma>();
   this.disciplina= new ArrayList<Disciplina>();
 }
 public String getDescricao(){
   return this.descricao;
 }
 public void setDescricao(String descricao){
   this.descricao = descricao;
 }
 public String getCodigo(){
   return this.codigo;
 }
 public void setCodigo(String codigo){
   this.codigo = codigo;
 }
 public int getDuracao(int duracao){
   return this.duracao;
 }
 public void setDuracao(int duracao){
   this.duracao = duracao;
 }

    public ArrayList<Docente> getProfessor() {
        return this.professor;
    }

    public void setProfessor(ArrayList<Docente> professor) {
        this.professor = professor;
    }

    public ArrayList<Turma> getTurma() {
        return this.turma;
    }

    public void setTurma(ArrayList<Turma> turma) {
        this.turma = turma;
    }

    public ArrayList<Disciplina> getDisciplina() {
        return this.disciplina;
    }

    public void setDisciplina(ArrayList<Disciplina> disciplina) {
        this.disciplina = disciplina;
    }
    public void addDocente(Docente doc) {
        this.professor.add(doc);
    }

    public void removeDocente(int doc) {
        this.professor.remove(doc);
    }
    public void addLaboratorio(Laboratorio lab) {
        this.laboratorio.add(lab);
    }
    
    public void addDisciplina(Disciplina disc) {
        this.disciplina.add(dsc);
    }

    public void removeDisciplina(int disc) {
        this.disciplina.remove(disc);
    }

    public void addTurma(Turma tr) {
        this.turma.add(tr);
    }

    public void removeTurma(int tr) {
        this.turma.remove(tr);
    }

    @Override
    public String toString() {
        return "Curso {" + "descrição:" + descricao + ", código:" + codigo + ", duração:" + duracao + ", professor:" + professor + ", turma:" + turma + ", disciplina:" + disciplina + '}';
    }
    
    
 

   

}
