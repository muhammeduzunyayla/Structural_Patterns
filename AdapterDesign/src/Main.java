public class Main {

    public static void main(String[] args) {
        Crypt crypt = new CryptA();
        crypt.crypt("Yusuf");
        crypt.dectypt("Metin");

        System.out.println("-------------");

        crypt = new CryptB();
        crypt.crypt("Dilek");
        crypt.dectypt("Mehmet");

        System.out.println("-------------");

        Codex codeX = new Codex();

        crypt = new AdapterCodex(codeX);
        crypt.crypt("Ahmet");
        crypt.dectypt("Acar");
    }
}
