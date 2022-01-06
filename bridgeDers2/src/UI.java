import jdk.swing.interop.SwingInterOpUtils;

public abstract class UI {
    Irenk irenk;

    public UI(Irenk renk){
        irenk=renk;

    }
    public UI(){

    }
    public void sistemle(){
        irenk.renklendir();
    }
}
