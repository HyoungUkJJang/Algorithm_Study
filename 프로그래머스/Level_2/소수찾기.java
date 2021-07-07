package codingtest;

import java.util.Arrays;

public class Cote {
    static int[] ch;
    static int answer=0;
    static String[] arr;

    public boolean sosoo(int n){
        int cnt=0;
        for(int i=2;i<=n;i++) {
               if(n%i==0) cnt++;
               if(cnt>1)  break;
        }
        if(cnt==1) {
            System.out.println("sosoo : "+ n);
            return true;
        }
        else{
            System.out.println("Not sosoo :"+n);
            return false;
        }
    }

    public void DFS(int L,String str) {
        if(sosoo(Integer.parseInt(str))){
            answer+=1;
            return;
        }
        else{
            for(int i=0;i<arr.length;i++) {
                if(ch[i] == 0) {
                    ch[i] = 1;
                    DFS(L+1,str+arr[i]); // L을더해서 보낸다.
                    ch[i] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        String s = "011";
        arr = s.split("");
       // for(String ss : arr) System.out.print(ss+" ");
        ch = new int[arr.length];

        Cote t = new Cote();
        t.DFS(0,new String("0"));
        System.out.println("answer  = "+ answer);

    }
}
