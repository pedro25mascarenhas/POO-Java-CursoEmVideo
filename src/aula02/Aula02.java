package aula02;

public class Aula02 {
    public static void main(String[] args) {
        CanetaAula02 c1 = new CanetaAula02();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.carga = 100;
        c1.status();

        CanetaAula02 c2 = new CanetaAula02();
        c2.modelo = "Hostnet";
        c2.cor = "preta";
    }

}
