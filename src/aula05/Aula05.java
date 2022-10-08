package aula05;

public class Aula05 {
    public static void main(String[] args) {
        ContaBanco contaJubileu = new ContaBanco("CC","Jubileu",300.0f);
        ContaBanco contaCreuza = new ContaBanco("CP", "Creuza", 500.0f);
        contaCreuza.retirarDinheiro(100.0f);
        contaJubileu.status();
        contaCreuza.status();
    }
}
