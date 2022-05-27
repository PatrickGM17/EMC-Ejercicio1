package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------------------");

        Docente Juan = new Docente("Juan Manuel Huapalla");
        Docente Maria = new Docente("Maria del Pilar");
        Docente Carlos = new Docente("Caros Enrique Suarez");

        Docente Lizbardo = new Docente("Lizbardo Rivera Duenias");
        Docente Ricardo = new Docente("Ricardo Sachun Garcia");
        Docente Jose = new Docente("Jose Antonio Vicente");

        Docente Freddy = new Docente("Freddy Clayderman Vigilio");
        Docente Fabio = new Docente("Fabio Rodriguez Melendez");
        Docente Ethel = new Docente("Ethel Jhovani Mnzano");

        Cursos cursoEstadistica = new Cursos("Estadistica");
        cursoEstadistica.setDocente(Juan);
        cursoEstadistica.setDocente(Maria);
        cursoEstadistica.setDocente(Carlos);

        Cursos cursoCalculo3 = new Cursos("Calculo 3");
        cursoCalculo3.setDocente(Lizbardo);
        cursoCalculo3.setDocente(Ricardo);
        cursoCalculo3.setDocente(Jose);

        Cursos cursoProgramacion = new Cursos("Programacion");
        cursoProgramacion.setDocente(Freddy);
        cursoProgramacion.setDocente(Fabio);
        cursoProgramacion.setDocente(Ethel);

        Semestre semestreIV = new Semestre("7mo");

        Matricula matricula2022 = new Matricula(2022);

        Estudiante estudiante = new Estudiante("Gomez Montero Patrick Fernando");
        System.out.println();
        System.out.println("Estudiante: "+estudiante.getNombre());
        System.out.println();
        System.out.println("Anio de Matricula: "+matricula2022.getAño());
        System.out.println();
        System.out.println("Semestre: "+semestreIV.getNumero());
        System.out.println();
        System.out.println("Cursos Matriculado: ");
        System.out.println();
        matricula2022.setCursos(cursoProgramacion);
        matricula2022.setCursos(cursoCalculo3);
        matricula2022.setCursos(cursoEstadistica);

        for(Cursos c: matricula2022.getCursos()){

            System.out.println("Cursos: "+c.getNombre());

            for(Docente d: c.getDocente()){

                System.out.println("Docente: "+d.getNombre());
            }
            System.out.println("--------------------------------------");
        }
    }

}
