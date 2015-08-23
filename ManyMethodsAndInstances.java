
import java.util.Scanner;
class ManyMethodsAndInstances{
    public static void main(String args []){
    
        Scanner Nameinput = new Scanner(System.in);
        ManyMethodsAndInstances2 classObject = new ManyMethodsAndInstances2();
        System.out.println("Enter the name of your first pet here: ");
        String temp = Nameinput.nextLine();
        classObject.setName(temp);
        classObject.SayName();
        
    }
}