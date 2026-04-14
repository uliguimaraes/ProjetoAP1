//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Bateria bateria = new Bateria(60, 4000);
        Celular celular = new Celular("Xiaomi", "Japones", bateria);

        celular.carregarCelular();
        celular.usarCelular(100);

        celular.carregarCelular();
        celular.usarCelular(20);

        celular.usarCelular(-20);

        celular.usarCelular(90);

        System.out.println(celular);
    }
}






