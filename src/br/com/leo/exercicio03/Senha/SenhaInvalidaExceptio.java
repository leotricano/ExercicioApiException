package br.com.leo.exercicio03.Senha;

public class SenhaInvalidaExceptio extends RuntimeException {
    private String mensagem;
    public SenhaInvalidaExceptio(String mensagem) {


        this.mensagem = mensagem;

    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }


}
