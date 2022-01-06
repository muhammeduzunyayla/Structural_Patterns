public class CryptA implements Crypt{
    @Override
    public void crypt(String text) {
        System.out.println("CryptA şifrelendi");
    }

    @Override
    public void dectypt(String text) {
        System.out.println("CryptA deşifrelendi");


    }
}
