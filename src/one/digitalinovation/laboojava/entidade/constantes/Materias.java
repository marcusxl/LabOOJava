package one.digitalinovation.laboojava.entidade.constantes;

public enum Materias{

    DUAS(2),
    CINCO(5),
    DEZ(10);

    private double fator;

    Materias(double fator){
        this.fator = fator / 10;
    }
    public double getFator(){
        return fator;
    }
}