package br.com.leo.exercicio03.APIGitHub;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ApiGithub {
    public static void main(String[] args) throws IOException, InterruptedException {


        try {
            Scanner ler = new Scanner(System.in);
            System.out.println("Digite nome de um perfil Git: ");
            String perfil = ler.nextLine();

            String endereco = "https://api.github.com/users/" + perfil;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());


            if (response.statusCode() == 404) {
                throw new ErroConsultaGitHubException("Usuário não encontrado no GitHub.");
            }

            String json = response.body();
            System.out.println(json);

                // Adicione aqui o código para processar o JSON e exibir as informações desejadas
            } catch (IOException | InterruptedException e) {
                System.out.println("Opss… Houve um erro durante a consulta à API do GitHub.");
                e.printStackTrace();
            } catch (ErroConsultaGitHubException e) {
                System.out.println(e.getMessage());
            }
    }
}
