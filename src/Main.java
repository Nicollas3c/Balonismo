import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        p1.nome = JOptionPane.showInputDialog(null, "Digite seu Nome");
        p1.cpf = JOptionPane.showInputDialog(null, "Digite seu CPF" + "\n" +"000.000.000-00");
        p1.rg = JOptionPane.showInputDialog(null, "Digite seu rg" + "\n" +"00.000.000-0");
        p1.tel = JOptionPane.showInputDialog(null, "Digite seu Telefone" + "\n" +"(00) 00000-0000");

        p2.nome = JOptionPane.showInputDialog(null, "Digite o Nome de seu Companheiro(a)");
        p2.cpf = JOptionPane.showInputDialog(null, "Digite o CPF de seu Companheiro(a)" + "\n" +"000.000.000-00");
        p2.rg = JOptionPane.showInputDialog(null, "Digite o RG de seu Companheiro(a)" + "\n" +"00.000.000-0");
        p2.tel = JOptionPane.showInputDialog(null, "Digite o Telefone de seu Companheiro(a)" + "\n" +"(00) 00000-0000");
        p2.telFam = p1.tel;
        p1.telFam = p2.tel;


        Piloto piloto = new Piloto();
        piloto.nome = "Claudio";
        piloto.cpf = "865.762.287-97";
        piloto.registro = 6429;

        Balao balao = new Balao();
        balao.id = 8629;
        balao.reg = 97630972;

        System.out.println("Suas Informações" +
                "\n Seu Nome: " + p1.nome +
                "\n Seu CPF: " + p1.cpf +
                "\n Seu RG: " + p1.rg +
                "\n Seu Telefone: " + p1.tel +
                "\n Seu Telefone Familiar: " + p1.telFam +
                "\n Nome: " + p2.nome +
                "\n CPF: " + p2.cpf +
                "\n RG: " + p2.rg +
                "\n Telefone: " + p2.tel +
                "\n Telefone Familiar: " + p2.telFam);

        int opc1;
        opc1 = Integer.parseInt(JOptionPane.showInputDialog(null, p1.nome + " e " + p2.nome +" assine aqui:" +
                                                                                        "\n" + "1 - Assinar" +
                                                                                        "\n" + "2 - Não Assinar"));
        if (opc1 == 1) {
            JOptionPane.showMessageDialog(null, "Pode Passar");
        }
        else {
            JOptionPane.showMessageDialog(null, "VAI EMBORAAAA!!!!");
            System.exit(0);
        }

        int opc2;
        opc2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja voar?" +
                                                                                        "\n" + "1 - Sim" +
                                                                                        "\n" + "2 - Não"));
        if (opc2 == 1) {
            JOptionPane.showMessageDialog(null, "Balão Está Voando");
        }
        else {
            JOptionPane.showMessageDialog(null, "Então porque veio aqui?");
            System.exit(0);
        }
    }
}