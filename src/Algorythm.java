public class Algorythm {

    public void start() {
        Console console = new Console("Введите текст: ");
        String line = console.readLine();

        int shiftValue = 4;
        Cipher cipher = new Cipher();
        String str = cipher.encoder(line, shiftValue);
        System.out.println(str);
    }
}
