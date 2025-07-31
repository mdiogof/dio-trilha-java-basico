public class Email implements Celular{
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println(mensagem + "Email");
    }
}
