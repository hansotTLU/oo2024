public class T2htiFailis {
    public static int loeKordi(String rida, char t2ht) {
        int korrad = 0;
        for (int i = 0; i < rida.length(); i++) {
            if (rida.charAt(i) == t2ht) {
                korrad++;
            }
        }
        return korrad;
    }
}
