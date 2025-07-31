public class SMS implements Celular{
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println(mensagem + "SMS");
    }
}
