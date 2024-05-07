import interfaces.*;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void tocar() {
        System.out.println("Música tocando...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    @Override
    public void ligar() {
        System.out.println("Telefone ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando nova aba: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        System.out.println("----- Reprodutor Musical -----");
        iphone.selecionarMusica("Nome da música");
        iphone.tocar();
        iphone.pausar();

        System.out.println("\n----- Aparelho Telefônico -----");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("\n----- Navegador na Internet -----");
        iphone.exibirPagina("www.dio.me");
        iphone.adicionarNovaAba("www.google.com");
        iphone.atualizarPagina();
    }
}