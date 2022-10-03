import java.util.Scanner;

public class CurseWord {
    // Beep Curse Word
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] st = s.split("\\s");
        String[] curse = {"Idiot", "Stupid", "Mad"};
        StringBuilder es = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (String item : curse) {
//            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < item.length(); j++) {
                temp.append('*');
            }
        }

        for (String item : curse){
            int ind = 0;
            for (String str : st) {
                if (str.compareTo(item) == 0) {
                    st[ind] = temp.toString();
                }
                ind++;
            }
        }

        StringBuilder res = new StringBuilder();
        for (String i : st) {
            res.append(i).append(' ');
        }
        System.out.println(res);
    }

}
