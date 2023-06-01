public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Piloto piloto = new Piloto();
        Balao balao = new Balao();

        p1.nome = "Gerivaldo";
        p1.rg = 412646936;
        p1.cpf = "792.548.840-90";
        p1.tel = 40028922;
        p1.telFam = 978246379;
        p1.endereço = "Rua dos Loucos, Número 0";

        p2.nome = "Gerivalda";
        p2.rg = 112973358;
        p2.cpf = "795.901.400-09";
        p2.tel = 963916846;
        p2.telFam = 979866870;
        p2.endereço = p1.endereço;

        piloto.nome = "Gertrude";
        piloto.cpf = "068.342.000-37";
        piloto.regAnac = 4625;
    }
}