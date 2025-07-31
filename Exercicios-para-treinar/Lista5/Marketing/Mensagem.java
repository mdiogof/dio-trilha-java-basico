/* ------ Código Original ------
public class Mensagem {
    public static void main(String[] args) {
        Celular app1 = new WhatsApp();
        Celular app2 = new SMS();
        Celular app3 = new Email();
        Celular app4 = new RedesSociais();

        String mensagem = "Esta é uma mensagem de marketing via ";

        app1.enviarMensagem(mensagem);
        app2.enviarMensagem(mensagem);
        app3.enviarMensagem(mensagem);
        app4.enviarMensagem(mensagem);
    }
}*/


// ----- Melhoria -------
import java.util.List;

public class Mensagem {
    public static void main(String[] args) {
        List<Celular> canais = List.of(
            new WhatsApp(),
            new SMS(),
            new Email(),
            new RedesSociais()
        );

        String mensagem = "Esta é uma mensagem de marketing via ";

        for (Celular canal : canais) {
            canal.enviarMensagem(mensagem);
        }
    }
}

