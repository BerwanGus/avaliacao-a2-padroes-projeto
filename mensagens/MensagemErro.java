package mensagens;

public class MensagemErro extends Mensagem{
    public Integer statusCode;
    public String datetime;
    
    public MensagemErro() {
    }

    public MensagemErro(MensagemErro target) {
        super(target);
        if (target != null) {
            this.statusCode = target.statusCode;
            this.datetime = target.datetime;
        }
    }

    @Override
    public Mensagem clone() {
        return new MensagemErro(this);
    }

    @Override
    public String toString() {
        return "Erro: " + statusCode + ". Mensagem: " + mensagem + ". Data: " + datetime;
    }
}
