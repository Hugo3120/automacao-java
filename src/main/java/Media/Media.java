package Media;

class CalculoMedia {
    private double nota1;
    private double nota2;

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public CalculoMedia(double nota1, double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public CalculoMedia() {

    }
    public String getSituacao() {
        double soma = this.nota1 + this.nota2;
        if (soma < 12) {
            return "Reprovado";

        } else {
            return "Aprovado";
        }
    }

}
