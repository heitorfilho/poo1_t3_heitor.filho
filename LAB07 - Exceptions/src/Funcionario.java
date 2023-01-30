public class Funcionario{

    private String nome;
    private String cpf;
    private float salario;
    private float teto;

    public Funcionario(String nome, String cpf, float salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.teto = 40000f;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public float getSalario(){
        return this.salario;
    }
    
    public void setSalario(float salario){
        this.salario = salario;
    }

    public float getTeto(){
        return this.teto;
    }

    public void setTeto(float teto){
        this.teto = teto;
    }

    public void aumentarSalario(float percentual) throws ValorInvalidoException{

        try {
            if(percentual < 0){
                throw new ValorInvalidoException("Valor invalido de salario");
            }
            else if(this.getSalario() * percentual > this.getTeto()){
                throw new ValorInvalidoException("Valor ultrapassa o teto");
            }
            else{
                this.setSalario(this.getSalario() * percentual + this.getSalario());
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally{
            System.out.println("Salario: " + this.getSalario());
        }
    }
}