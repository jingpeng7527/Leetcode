import java.util.*;

public class LexicographicallyGreatestString {
    public static List<String> findLexicographicallyGreatestString(List<String> strList) {
        List<String> lgs = new ArrayList<>();
        for (String s : strList) {
            char minChar = 'z';
            char cur = minChar;
            boolean flag =false;
            // Find the smallest character in the string
            char[] cc = s.toCharArray();
            
            for (int i =0; i < cc.length;i++) {
                if(!flag){
                    if (minChar - cc[i] > 1) {
                        cur = cc[i];
                        System.out.println(minChar);
                        flag = true;
                        minChar-=1;
                        cc[i] = minChar;
                    }else if(minChar - cc[i]==1){
                        minChar-=1;
                    }
                }else{
                    // System.out.println(minChar+ " "+cur+". "+i);
                    if(cc[i] == cur){
                        cc[i] = minChar;
                    }
                    else if(cc[i] == minChar){
                        // System.out.println(minChar);

                        cc[i] = cur;
                    }
                }
            }
            // Perform the OPT operation with 'z' and the smallest character
            // StringBuilder sb = new StringBuilder();
            // for (char c : s.toCharArray()) {
            //     if (c == minChar) {
            //         sb.append('z');
            //     } else {
            //         sb.append(c);
            //     }
            // }
            lgs.add(String.valueOf(cc));
        }
        return lgs;
    }

    public static void main(String[] args) {
        List<String> strList = Arrays.asList( "zzzyyabxa");
        List<String> result = findLexicographicallyGreatestString(strList);
        for (String s : result) {
            System.out.println(s);
        }
    }
}
