import java.util.Random;

class RandomNumberGenerator{
    public static void main(String[] args){
        Random hexagon = new Random();
        int number;

        for(int counter=1; counter<=10;counter++){
        number = hexagon.nextInt(7);
        System.out.println(number + " ");
        }
    }
}