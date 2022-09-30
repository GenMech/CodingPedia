import java.util.Scanner;

public class CurseWord {
    // Beep Curse Word
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] st = s.split("//s");
        String[] curse = {"Idiot", "Stupid", "Mad"};
        StringBuilder res = new StringBuilder();

        StringBuilder temp = new StringBuilder();
        for (String item : curse) {
            for (int j = 0; j < item.length(); j++) {
                temp.append('*');
            }
        }

        int ind = 0;
        for (String value : curse){
            for(String str: st){
                if (str.compareTo(value) == 0) {
                    st[ind] = temp.toString();
                    ind++;
                }
            }
        }

        for(String i: st){
            res.append(i).append(' ');
        }
        System.out.println(res);
    }

}
