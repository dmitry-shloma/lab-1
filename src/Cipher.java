public class Cipher {
    private String abc;

    public Cipher() {
        this.abc = "АБВГД";
    }

    public Character shift(Character ch, int value) {
        // TODO:
        return ch;
    }

    public String encoder(String inText, int shiftValue) {
        String outText = "";
        int length = inText.length();
        for (int i = 0; i < length; ++i) {
            Character ch = inText.charAt(i);
            if (Character.isLetter(ch)) {
                outText += shift(ch, shiftValue);
            } else {
                outText += ch;
            }
        }

        return outText;
    }
}
