import javax.xml.namespace.QName;

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie filme1 = new Movie();

        filme1.titulo = "O Homem do Castelo Alto";
        filme1.genero = "Ficcao";
        filme1.avaliacao = -2;
        filme1.playIt();

        Movie filme2 = new Movie();
        filme2.titulo = "Lupin";
        filme2.genero = "Acao";
        filme2.avaliacao = 5;
        filme2.playIt();


        Movie filme3 = new Movie();
        filme3.titulo = "American Pie";
        filme3.genero = "Comedia";
        filme3.avaliacao = 127;
        filme3.playIt();
    }
}

class Movie {
    String titulo;
    String genero;
    int avaliacao;

    void playIt(){
        System.out.println("Tocando o filme " + titulo);
    }
}
