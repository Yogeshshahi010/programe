public class PrintNumbers {
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            for(int j = 0; j <= 9; j++) {
                if(j == 3) {
                    System.out.println(i + "" + j);
                    System.out.println("FOO");
                    continue;
                }

                else if(j == 5){
                    System.out.println(i + "" + j);
                    System.out.println("BAR");
                    continue;
                }
                System.out.println(i + "" + j);
            }
        }
    }
}