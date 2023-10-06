public class pg11 {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles"; // plural

       /* while(beerNum > 0){

            if(beerNum == 1){
                word = "bottle"; // singular
            }
            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer");
            System.out.println("take one down");
            System.out.println("pass it around");
            beerNum--;

            if(beerNum > 0){
                System.out.println(beerNum + " " + word + " of beer on the wall");
            } else {
                System.out.println("no more bottles of beer on the wall");
            }
        } */

        // outro exemplo

        int x = 1;
        while (x < 3){
            System.out.print("Doo"); //print imprime mesma linha, ln na nova linha
            System.out.print("Bee");
            x++;

            if(x == 3){
                System.out.print("Do");
            }
        }
    }
}
