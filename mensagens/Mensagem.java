package mensagens;

public abstract class Mensagem {
    String mensagem;

    public Mensagem() {
    }

    public Mensagem(Mensagem target) {
        if (target != null) {
            this.mensagem = target.mensagem;
        }
    }

    public abstract Mensagem clone();

    @Override
    public String toString() {
        return mensagem;
    }
}
