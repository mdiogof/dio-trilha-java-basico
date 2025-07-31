
import java.util.ArrayList;
import java.util.Scanner;

public class iPhone implements ReprodutorMusical, Telefone, NavegadorDeInternet {
    static Scanner scanner = new Scanner(System.in);
    private static final String[] listaDeMusicas = {
        "Payphone", "Animals", "Sugar", "Girls Like You", "Maps"
    };
    private static final String[] listaDeContatos = {
        "Mãe", "Pai", "Tia", "Avô", "Amigo"
    };
    private static final String[] listaDeRecados = {
        "Mãe: oi filho", "Pai: tudo bem?", "Tia: quando você vem me ver?", "Avô: comprei um presente para você", "Amigo: tem uma festa para irmos"
    };

    public static void main(String[] args) {
        boolean bloquear = true;
        do { 
            System.out.print("""
                1 - Reprodutor Musical
                2 - Telefone
                3 - Navegador de Internet
                0 - Desligar
                Escolha o aplicativo que deseja acessar: 
                """);
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1 -> reprodutorMusical();
                case 2 -> telefone();
                case 3 -> navegadorInternet();
                case 0 -> {
                    System.out.println("Desligando...");
                    bloquear = false;
                }
                default -> System.out.println("Opção inválida.");
            }
        } while (bloquear);
    }

    ////////////////// Reprodutor Musical ///////////////////////
    private static boolean tocando = false;
    
    public static void reprodutorMusical() {
        ReprodutorMusical ipod = new iPhone();
        int musicaSelecionada = -1;

        while (true) {
            System.out.print("""
                    
                    Reprodutor Musical:
                    1 - Selecionar Música
                    2 - Tocar
                    3 - Pausar
                    0 - Sair
                    Escolha uma função: 
                    """);
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1 -> musicaSelecionada = ipod.selecionarMusica();
                case 2 -> {
                    if (musicaSelecionada != -1) {
                        String musica = listaDeMusicas[musicaSelecionada];
                        ipod.tocar(musica);
                    } else {
                        System.out.println("Nenhuma música selecionada.");
                    }
                }
                case 3 -> {
                    if (tocando) {
                        ipod.pausar();
                    } else {
                        System.out.println("Não há músicas tocando.");
                    }
                }
                case 0 -> {
                    return;
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }

    public String listarMusicas() {
        StringBuilder sb = new StringBuilder("----- Músicas disponíveis -----\n");
        for (int i = 0; i < listaDeMusicas.length; i++) {
            sb.append(i).append(" - ").append(listaDeMusicas[i]).append("\n");
        }
        return sb.toString();
    }

    @Override
    public void tocar(String musica) {
        System.out.println("Tocando a música: " + musica);
        tocando = true;
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public int selecionarMusica() {
        System.out.println(listarMusicas() + "Escolha o número da música:");
        int escolha = scanner.nextInt();
        scanner.nextLine();

        if (escolha >= 0 && escolha < listaDeMusicas.length) {
            System.out.println("Você selecionou: " + listaDeMusicas[escolha]);
            return escolha;
        } else {
            System.out.println("Opção inválida.");
            return -1;
        }
    }

    ////////////////////// Telefone ///////////////////////////
    public static void telefone() {
        Telefone telefone = new iPhone();
        boolean recados = true;

        while (true) { 
            System.out.print("""
                
                1 - Lista de contatos
                2 - Ligar
                3 - Atender
                4 - Iniciar Correio de Voz
                0 - Sair
                Escolha uma função:
                """);
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1 -> System.out.println(telefone.listarContatos());
                case 2 -> telefone.ligar();
                case 3 -> telefone.atender();
                case 4 -> {
                    if (recados) {
                        System.out.print(telefone.iniciarCorreioVoz());
                        System.out.println("Deseja exluir seu correio de voz? (s/n)");
                        boolean excluir = scanner.nextLine().equalsIgnoreCase("s");

                        if (excluir) {
                            recados = false;
                            System.out.println("Lista de recados excluída.");
                        }
                    } else {
                        System.out.println("Você não tem recados novos.");
                    }
                }
                case 0 -> {
                    return;
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }

    @Override
    public String listarContatos() {
        StringBuilder sb = new StringBuilder("-------- Contatos ---------\n");
        for (int i = 0; i < listaDeContatos.length; i++) {
            sb.append(i).append(" - ").append(listaDeContatos[i]).append("\n");
        }
        return sb.toString();
    }

    @Override
    public void ligar() {
        System.out.println("Digite o número para o qual deseja ligar: ");
        int contato = scanner.nextInt();
        scanner.nextLine();

        if (contato < listaDeContatos.length) {
            System.out.println("Ligando para " + listaDeContatos[contato] + "...");
        } else {
            System.out.println("Esse contato não está cadastrado.");
        }
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação...");
    }

    @Override
    public String iniciarCorreioVoz() {
        StringBuilder sb = new StringBuilder("-------- Recados ---------\n");
        for (String listaDeRecado : listaDeRecados) {
            sb.append("- ").append(listaDeRecado).append("\n");
        }
        return sb.toString();
    }

    ////////////////////// Navegador de Internet ////////////////////////
    private final static ArrayList<String> listaDeAbas = new ArrayList<>();
    private static int numeroAbas = 1;
    private static boolean pagina = false;

    public static void navegadorInternet() {
        NavegadorDeInternet safari = new iPhone();
        listaDeAbas.add("Aba 0");

        while (true) { 
            System.out.print("""
                
                1 - Exibir página
                2 - Atualizar página
                3 - Adicionar nova aba
                4 - Excluir aba
                5 - Listar abas
                0 - Sair
                Escolha uma função:
                """);
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1 -> safari.exibirPagina();
                case 2 -> safari.atualizarPagina();
                case 3 -> safari.adicionarNovaAba();
                case 4 -> safari.excluirAba();
                case 5 -> safari.listarAbas();
                case 0 -> {
                    return;
                }
            }
        }
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo a página web...");
        pagina = true;
    }

    @Override
    public void adicionarNovaAba() {
        StringBuilder sb = new StringBuilder();
        sb.append("Aba ").append(numeroAbas);
        listaDeAbas.add(sb.toString());
        System.out.println("Aba " + numeroAbas + " adicionada.");
        numeroAbas++;
    }

    @Override
    public void atualizarPagina() {
        if (pagina) {
            System.out.println("Atualizando a página web...");
        } else {
            System.out.println("Você não acessou nenhuma página.");
        }
    }

    @Override
    public void excluirAba() {
        System.out.print("Digite o número da aba que deseja excluir: ");
        int aba = scanner.nextInt();
        scanner.nextLine();

        String remover = "Aba " + aba;

        if (listaDeAbas.contains(remover)) {
            listaDeAbas.remove(remover);
            System.out.printf("%s excluída com sucesso.\n", remover);
        } else {
            System.out.println("Número de aba inválido.");
        }
    }


    @Override
    public void listarAbas() {
        StringBuilder sb = new StringBuilder("------ Lista de Abas ------\n");
        for (int i = 0; i < listaDeAbas.size(); i++) {
            sb.append("- ").append(listaDeAbas.get(i)).append("\n");
        }
        System.out.println(sb.toString());
    }
}

