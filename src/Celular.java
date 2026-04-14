public class Celular {

    private String marca;
    private String modelo;
    private Bateria bateria; // ✔ agora é objeto, não String

    public Celular() {
    }

    public Celular(String marca, String modelo, Bateria bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", bateria=" + bateria +
                '}';
    }

    public void usarCelular(int consumo) {
        bateria.gastarBateria(consumo);
    }

    public void carregarCelular() {
        bateria.carregarBateria();
        System.out.println("Carga completa");
    }
}