public class Docente {
    private String nome;
    private String apelido;
    private String email;
    private String matricula;
    private String area_lotacao;
    private String vinculo;
    
    @Override
    public String toString() {
        return "Docente{" + "nome: " + this.nome + ", apelido: " + this.apelido + ", email: " + this.email + ", matrícula: " + this.matricula + '}';
    }
    
    
    public Docente(){
        this.nome = null;
        this.apelido = null;
        this.matricula = null;
        this.email = null;
        this.area_lotacao = null;
        this.vinculo = null;
    }
    public Docente(String nom, String apeli, String mail, String matricula, String area_lotacao, String vinculo){

        this.nome = nome;
        this.apelido = apelido;
        this.email = email;
        this.matricula = matricula;
        this.area_lotacao = area_lot;
        this.vinculo = vinculo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return this.apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
