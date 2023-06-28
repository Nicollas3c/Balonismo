import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Balao balao = new Balao();

        if (p1.isAssinaturaTermo() == true && p2.isAssinaturaTermo() == true) {
            balao.voar();
        }
        else {
            System.out.println("Não vai voar hoje!");
        }

    }
}