package Ejercicio1;

public class Matricula {
    private int  año;
    private Semestre[]  semestre;
    private Cursos[] cursos;
    private int contador;

    public Matricula(int  año) {

        this.año = año;
        this.semestre = new Semestre[1];
        this.cursos = new Cursos[3];
        this.contador = 0;
    }
    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Semestre[] getSemestre() {
        return semestre;
    }

    public void setSemestre(Semestre semestre) {
        this.semestre[this.contador] = semestre;
        this.contador++;
    }

    public Cursos[] getCursos() {
        return cursos;
    }

    public void setCursos(Cursos cursos) {
        this.cursos[this.contador] = cursos;
        this.contador++;
    }

}
