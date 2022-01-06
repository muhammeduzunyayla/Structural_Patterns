public class Main {

    public static void main(String[] args) {

        UI uı=new Linux(new Dark());
        uı.sistemle();
        System.out.println("   ----------------   ");
        UI windows=new Windows(new Light());
        windows.sistemle();



    }
}
