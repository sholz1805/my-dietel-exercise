package ChapterNine;

public class Ave extends Animal {

    @Override
    public void breath() {
        System.out.println("I am an Ave and i am breathing"); //overrides the parent breath method
    }

    public void parentBreath(){
        super.breath();  // to call the method breath from the superclass
    }
}
