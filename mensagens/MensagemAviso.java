package mensagens;

public class MensagemAviso extends Mensagem{
    public Boolean encript;
    
    public MensagemAviso() {
    }

    public MensagemAviso(MensagemAviso target) {
        super(target);
        if (target != null) {
            this.encript = target.encript;
        }
    }

    @Override
    public Mensagem clone() {
        return new MensagemAviso(this);
    }

    @Override
    public String toString() {
        if (encript) {
            mensagem = encript();
        }
        return "Mensagem: " + mensagem;
    }

    public String encript() {
        return "Mensagem encriptada";
    }
}
