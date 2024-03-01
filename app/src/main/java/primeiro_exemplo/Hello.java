package primeiro_exemplo;

import javax.sound.midi.SysexMessage;

import modelos.Pessoa;
import modelos.PessoaFisica;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Funciona!!!");

        Pessoa p1 = new Pessoa();
        p1.setNome("Marco");
        System.out.println(p1.getNome());

        PessoaFisica p2 = new PessoaFisica();
        p2.setNome("Fulano");
        System.out.println(p2.getNome());

        Pessoa.addCount();
        System.out.println(Pessoa.getCount());
    }
}