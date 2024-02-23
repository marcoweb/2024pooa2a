package primeiro_exemplo;

import modelos.Pessoa;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Funciona!!!");

        Pessoa p1 = new Pessoa();
        p1.setNome("Marco");
        

        System.out.println(p1.getNome());
    }
}