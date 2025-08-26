package br.com.leo.exercicio03.Senha;

import br.com.leo.exercicio03.Senha.SenhaInvalidaExceptio;

import java.util.Scanner;

public class SenhaUsuario {
    // Crie um programa que lê uma senha do usuário.
    // Utilize o bloco try/catch para capturar a exceção
    // SenhaInvalidaException, uma classe de exceção personalizada
    // que deve ser lançada caso a senha não atenda a critérios
    // específicos (por exemplo, ter pelo menos 8 caracteres).

    public static void main(String[] args) {
        try {


            Scanner read = new Scanner(System.in);
            System.out.println("Digite uma senha nova: ");
            String senha = read.nextLine();
            if (senha.length() > 8){
                throw new SenhaInvalidaExceptio("Senha com maximo" +
                        " 8 caracteres");
            }
        }

        catch (SenhaInvalidaExceptio e){

            System.out.println(e.getMessage());
        }
        System.out.println("O programa finalizou corretamente");
    }
}
