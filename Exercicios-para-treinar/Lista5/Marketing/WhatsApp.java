public class WhatsApp implements Celular{
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println(mensagem + "WhatsApp");
    }
}
