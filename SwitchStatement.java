public class SwitchStatement {
    public static void main(String args[]){
        int kiwis;
        kiwis = 3;
        
        switch (kiwis){
        case 1:
            System.out.println("You have 1 Kiwi");
            break;
        case 2:
            System.out.println("You have 2 Kiwis");
            break;
        case 3:
            System.out.println("You have 3 Kiwis");
            break;
        default:
            System.out.println("I don't know how many kiwis you have");
            break;
        }
    }
}