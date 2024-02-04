/**
 * 3. segmentQuries
 */
public class longestOR {
    public static void main(String[] args) {
        int res = 0;
        int min = 1;
        int max = 2;

        int[] arg = new int[] { 0, 3, 4, 1 ,5};
        int left = 0;
        int curOr = 0;
        int curBit = 0;

        for (int i = 0; i < arg.length; i++) {
            
            // System.out.println(left + "  " + i);

            curOr |= arg[i];
            curBit = getBites(curOr);
            // System.out.println(curBit + "kk");

            if (curBit >= min && curBit <= max) {
                res = Math.max(res, i - left + 1);
            }

            while (curBit > max) {
                curOr = curOr & ~arg[left++];
                curBit = getBites(curOr);
                // System.out.println(left + "  " + i + "in max");
            }
        }
        System.out.println(res);
    }
    
    public static int getBites(int curOrtemp){
        int ress = 0;
        while (curOrtemp > 0) {
            ress += curOrtemp & 1;
            curOrtemp = curOrtemp >> 1;
        }
        return ress;
    }
}