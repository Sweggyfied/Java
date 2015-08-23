public class Constructor2{
    private String petName;

    public Constructor2(String name){
        petName=name;
    }

    public String getName(){
        return petName;
    }
    public void saying(){
        System.out.printf("Your first pet was named %s\n", getName());
    }
}