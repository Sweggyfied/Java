class ElseIfStatement{
    public static void main(String args[]){
        int age = 21;

        if (age >= 15)
            System.out.println("You are a Teenager");
        else if (age >= 20)
            System.out.println("You are in your 20s");
        else if (age >= 30)
            System.out.println("You are in your 30s");
        else
            System.out.println("You are a young buck");

    }
}