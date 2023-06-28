public class Piloto extends Pessoa {

    private int registro;

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public Piloto() {
        registro = 876875656;
        setNome("Zé");
        setCpf("767.867.963-63");
    }
}
