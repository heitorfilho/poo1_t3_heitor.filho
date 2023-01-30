public class Main {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Joao", "123456789", 1000f);

        try{
            f1.aumentarSalario(100f);
        }
        catch(ValorInvalidoException e){
            System.out.println(e.getMessage());
        }

        f1.setTeto(100000f);

        try{
            f1.aumentarSalario(100f);
        }
        catch(ValorInvalidoException e){
            System.out.println(e.getMessage());
        }
    }
}
