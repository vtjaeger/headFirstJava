public class pg9 {
    public static void main(String[] args) {
        int x = 10;
        while(x > 3){
            x -= 1;
            System.out.println(x);
        }
        int z = 27;
        while (z == 27){
            System.out.println("z = " + z);
            // loop eterno
            z -= z;
        }

        //while (z){
            // erro pq int e bool nao sao compativeis
        //}
    }
}
