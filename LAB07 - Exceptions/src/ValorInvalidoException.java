public class ValorInvalidoException extends IllegalStateException{ //Podendo ser extendida de Exception, caso seja necessario tratar a excecao

    ValorInvalidoException(String msg){
        super(msg);
    }
}
