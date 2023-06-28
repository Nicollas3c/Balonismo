import javax.swing.*;

public class Pessoa {

    private String nome;
    private String cpf;
    private String rg;
    private String telefone;
    private String emergencia;
    private String endereço;
    private boolean assinaturaTermo;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public boolean isAssinaturaTermo() {
        return assinaturaTermo;
    }
    public void setAssinaturaTermo(boolean assinaturaTermo) {
        this.assinaturaTermo = assinaturaTermo;
    }
    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    public String getEmergencia() {
        return emergencia;
    }
    public void setEmergencia(String emergencia) {
        this.emergencia = emergencia;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Pessoa() {
        nome = JOptionPane.showInputDialog(null, "Digite seu Nome");
        cpf = JOptionPane.showInputDialog(null, "Digite seu CPF");
        rg = JOptionPane.showInputDialog(null, "Digite seu RG");
        telefone = JOptionPane.showInputDialog(null, "Digite seu Telefone");
        emergencia = JOptionPane.showInputDialog(null, "Digite seu Telefone de Emergência");
        endereço = JOptionPane.showInputDialog(null, "Digite seu Endereço");
        assinaturaTermo = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "Assine Aqui: " + "\n" + "true - Assinar" + "\n" + "false - Não Assinar"));
    }
}
