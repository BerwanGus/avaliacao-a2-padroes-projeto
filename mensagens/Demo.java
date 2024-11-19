package mensagens;

import java.util.ArrayList;
import java.util.List;


public class Demo {
    public static void main(String[] args) {
        List<Mensagem> mensagens = new ArrayList<>();

        MensagemErro erro = new MensagemErro();
        erro.mensagem = "Página não encontrada";
        erro.statusCode = 404;
        erro.datetime = "12:23";
        mensagens.add(erro);

        MensagemErro outroErro = (MensagemErro) erro.clone();
        mensagens.add(outroErro);

        MensagemAviso aviso = new MensagemAviso();
        aviso.mensagem = "Sua senha é: 123";
        aviso.encript = true;
        mensagens.add(aviso);

        MensagemAviso outroAviso = (MensagemAviso) aviso.clone();
        mensagens.add(outroAviso);

        MensagemGeral geral = new MensagemGeral();
        geral.mensagem = "Servidor iniciado";
        geral.destino = "servidor0";
        mensagens.add(geral);

        MensagemGeral outroGeral = (MensagemGeral) geral.clone();
        mensagens.add(outroGeral);

        for (Mensagem mensagem : mensagens) {
            System.out.println(mensagem);
        }
    }    
}
