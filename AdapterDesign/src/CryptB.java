public class CryptB implements Crypt{
    @Override
    public void crypt(String text) {
        System.out.println("CryptB şifrelendi");

    }

    @Override
    public void dectypt(String text) {
        System.out.println("CryptB deşifrelendi");

    }
}
