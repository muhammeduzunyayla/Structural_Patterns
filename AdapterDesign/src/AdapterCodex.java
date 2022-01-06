public class AdapterCodex implements Crypt{

    private Codex codex;
    public AdapterCodex(Codex codex){
        this.codex=codex;
    }
    @Override
    public void crypt(String text) {
        codex.textToCode(text);

    }

    @Override
    public void dectypt(String text) {
      codex.codeToText(text);
    }
}
