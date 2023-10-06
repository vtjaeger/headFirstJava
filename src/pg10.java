public class pg10 {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Antes do loop");
        while (x < 4){
            System.out.println("No loop");
            System.out.println("O valor de x é " + x);
            x++;
        }

        int z = 3;
        if(z == 3){
            System.out.println("x deve ser igual a 3");
        }
        System.out.println("isso sera executado de qualquer forma");

    }
}
