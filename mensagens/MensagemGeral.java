package mensagens;

public class MensagemGeral extends Mensagem{
    public String destino;
    
    public MensagemGeral() {
    }

    public MensagemGeral(MensagemGeral target) {
        super(target);
        if (target != null) {
            this.destino = target.destino;
        }
    }

    @Override
    public Mensagem clone() {
        return new MensagemGeral(this);
    }

    @Override
    public String toString() {
        return "Destino: " + destino + ". Mensagem: " + mensagem;
    }
}
