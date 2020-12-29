/* 
stdin:
TTATGTTTTAAGGATGGGGCGTTAGTT
GGTATGATGGGTTGA
ATGTGA
ATGTTTGTAA
TGGATGTATATA
quit

stdout:
TTT
GGGCGT
GGT
No gene.
No gene.
No gene.

*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String s = sc.nextLine();
            if (s.equals("quit")) break;
            if (!s.contains("ATG") || (!s.contains("TAG") && !s.contains("TAA") && !s.contains("TGA"))){
                System.out.println("No gene.");
                continue;
            }
            boolean hasGene = false;
            int start = s.indexOf("ATG");
            int n = s.length();
            while(start < n - 6 && start != -1){
                String res = "";
                for(int i=start+3; i<=n-3; i+=3){
                    if (matchedEnding(s.substring(i,i+3)) && qualified(res)){
                        System.out.println(res);
                        hasGene = true;
                        break;
                    }else if (s.substring(i, i+3).equals("ATG")){
                        break;
                    }else res += s.substring(i,i+3);
                }
                start = s.indexOf("ATG", start+3);
            }
            if (!hasGene) System.out.println("No gene.");
        }
    }
    public static boolean matchedEnding(String s){
        return s.equals("TAG") || s.equals("TAA") || s.equals("TGA");
    }
    public static boolean qualified(String s){
        return s.length() >= 3 && s.length() % 3 == 0 && !s.contains("ATG") && !s.contains("TAG") && !s.contains("TAA") && !s.contains("TGA");
    }
    
}
