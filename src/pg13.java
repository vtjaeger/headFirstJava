public class pg13 {
    public static void main(String[] args) {
        String[] wordListOne = { "maçã", "banana", "laranja", "pera", "uva", "morango", "abacaxi"
                , "mamão", "pêssego", "kiwi",  "limão", "cereja", "melancia" };
        String[] wordListTwo = { "carro", "moto", "ônibus", "bicicleta", "avião",
                "trem", "caminhão", "barco", "patinete", "helicóptero", "metrô", "táxi", "triciclo" };
        String[] wordListThree = { "computador", "teclado", "mouse", "monitor", "impressora",
                "notebook", "tablet", "smartphone", "roteador", "caixa de som", "webcam", "projetor", "scanner" };


        // descobrir quantas palavras tem em cada lista
        int listaUm = wordListOne.length;
        int listaDois = wordListTwo.length;
        int listaTres = wordListThree.length;

        // gerar 3 numeros aletorios
                        // (int) forca o numero aleatorio a ser inteiro

        int random1 = (int) (Math.random() * listaUm);
        int random2 = (int) (Math.random() * listaDois);
        int random3 = (int) (Math.random() * listaTres);
        // * lista para ser de [0 até valor de ListaUm] -> valor maximo aleatorio deve ser entre 0 e listaUm;

        String phrase = wordListOne[random1] + " " + wordListTwo[random2] + " " + wordListThree[random3];

        System.out.println(phrase);
    }
}
