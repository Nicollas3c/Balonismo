public class Balao {

    private int id;
    private int registro;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getRegistro() {
        return registro;
    }
    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public Balao() {
        id = 8745;
        registro = 564765790;
    }

    public void voar() {
        System.out.println("Balão Suiu!");
    }

}