public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        while(i <= 1000){
            if(findMultiples(i)){
                count++;
            }
            i++;
        }
        System.out.println(count);
    }

    private static boolean findMultiples(int i){
        boolean divisibleBy3 =  i%3 == 0;
        boolean divisibleBy5 = i%5 == 0;
        return divisibleBy3 || divisibleBy5;
    }
}
