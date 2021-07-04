import java.util.*;

public class Main {

    public int solution(int[] arr, int k)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum=0;
        int lt=0;
        for(int i=0,j=0;i<arr.length-2;i++)
        {
            for(int n=i+1;n<arr.length-1;n++) {
                for(int m=n+1; m<arr.length;m++) {
                    sum=arr[i]+arr[n]+arr[m];
                    if(!map.containsValue(sum)) map.put(j++,sum);
                    sum=0;
                }
            }
        }

        int[] result = new int[map.size()];
        int m=0;
        for(int x : map.keySet()) result[m++] = map.get(x);
        Arrays.sort(result);

        return result[result.length-k];
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(arr,k));

    }
}

/* 이상적인 답
import java.util.*;

public class Main {

    public int solution(int[] arr, int k)
    {
        TreeSet<Integer> test = new TreeSet<>(Collections.reverseOrder()); // 오름차순정렬

        for(int i=0;i<arr.length-2;i++) {
            for(int j=i+1;j<arr.length-1;j++) {
                for(int l=j+1; l<arr.length;l++) {
                    test.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }
        int index = 0;
        for(int x : test) {
            index++;
            if(index==k) return x;
        }

        return -1;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(arr,k));

    }
}

*/
