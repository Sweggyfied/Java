import java.util.Scanner;
class UseMethodsWithParameters{
    public static void main(String args[]){
    
        Scanner NameInput = new Scanner(System.in);
        UseMethodsWithParameters2 nameinputObject = new UseMethodsWithParameters2();
        
        System.out.println("Enter your name here: ");
        String name = NameInput.nextLine();
        
        nameinputObject.simpleMessage(name);

    }
}
