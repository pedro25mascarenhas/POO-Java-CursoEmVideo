package aula02;

public class CanetaAula02 {
    public String modelo;
    public String cor;
    public float ponta;
    protected int carga;
    protected boolean tampada;
    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.print("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.print("Tampada: " + this.tampada);
    }

    public void rabiscar() {
        this.carga--;
    };

   private void tampar() {
        this.tampada = true;
    };

    private void destampar() {
        this.tampada = false;
    };
}
