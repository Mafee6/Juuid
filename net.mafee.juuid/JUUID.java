package net.mafee.juuid;

/**
 * JUUID
 * A Library to generate UUIDs!
 */
public class JUUID {
    /*
    * Generate UUIDs!
    * */
    public static String UUID(int length){
        String o = "";
        char[] ltrs = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder sb = new StringBuilder(o);
        for(int i = 0; i < length; i++) {
            if((int) Math.floor(Math.random() * 2) == 0) {
                sb.append((int) Math.floor(Math.random() * 10));
            } else {
                char l = ltrs[(int) Math.floor(Math.random() * ltrs.length)];
                if((int) Math.floor(Math.random() * 2) == 0){
                    sb.append(String.valueOf(l).toLowerCase());
                } else {
                    sb.append(String.valueOf(l).toLowerCase());
                }
            }
        }

        return sb.toString();
    }
}
