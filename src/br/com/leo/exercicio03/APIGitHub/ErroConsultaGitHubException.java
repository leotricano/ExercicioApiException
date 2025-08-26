package br.com.leo.exercicio03.APIGitHub;

public class ErroConsultaGitHubException extends RuntimeException {

    public ErroConsultaGitHubException(String mensagem){
        super("Erro na procura de usuario, por favor tente novamente");
    }

}
