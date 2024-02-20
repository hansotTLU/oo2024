public class Info {
    String nimetus;
    int ram;
    String gpu;

    public Info(String nimetus, int ram, String gpu) {
        this.nimetus = nimetus;
        this.ram = ram;
        this.gpu = gpu;
    }

    public void muudaNimetus(String uusNimetus) {
        nimetus = uusNimetus;
    }
}
