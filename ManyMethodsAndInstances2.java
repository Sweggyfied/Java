public class ManyMethodsAndInstances2 {
    private String petName;
    public void setName(String name){
        petName=name;
    }
    public String getName(){
        return petName;
    }
    public void SayName(){
        System.out.printf("Your first pet was named: %s", getName());
    }
}