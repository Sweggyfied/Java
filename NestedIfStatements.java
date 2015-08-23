class NestedIfStateMents{
    public static void main(String args[]){
        int age = 9001;

        if (age < 55){
            System.out.println("You are young");
        }else{
            System.out.println("You are old");
            if(age > 9000){
                System.out.println("You are ACIENT!!");
            }else{
                System.out.println("dont worry you arent really thta old");
            }
        }
    }
}