public class Multiple {
    public static void main(String[] args) {
        int count = 0;
        for (int i=0; i < 1000; i++){
            boolean multiple3 = i%3 == 0;
            boolean multiple5 = i%5 == 0;

            if (multiple3 || multiple5){
                count++;
            }
        }

        System.out.println(count);
    }
}
