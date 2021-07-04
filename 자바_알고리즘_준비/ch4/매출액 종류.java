import java.util.*;

public class Main {

    public void solution(int[] arr,int m)
    {

       int googan = 1;

       HashMap<Integer,Integer> map = new HashMap<>();
       HashMap<Integer,Integer> map2 = new HashMap<>();
        for(int i=0;i<m;i++){
            if(!map2.containsKey(arr[i])) map2.put(arr[i],map2.getOrDefault(arr[i],0)+1);
        }
        map.put(googan++,map2.size());
        for(int i=m;i<arr.length;i++)
        {
            System.out.println("----BEFORE--------");

            for(int x : map2.keySet()) {
                System.out.println("x = "+x);
            }

            System.out.println("---------------------------");

            System.out.println("----------AFTER--------------");

            if(map2.get(arr[i-m])>1)
                map2.put(arr[i-m],map.get(arr[i-m]-1));
            else
                map2.remove(arr[i-m]);

            map2.put(arr[i],map2.getOrDefault(arr[i],0)+1);
            for(int x : map2.keySet()) {
                System.out.println("x = "+x);
            }

            System.out.println("------------------------------------------");
            map.put(googan++,map2.size());
        }

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt(),m = kb.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = kb.nextInt();
        }
        T.solution(arr,m);
    }
}
/* 답안

import java.util.*;
class Main {	
	public ArrayList<Integer> solution(int n, int k, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> HM = new HashMap<>();
		for(int i=0; i<k-1; i++){
			HM.put(arr[i], HM.getOrDefault(arr[i], 0)+1);
		}
		int lt=0;
		for(int rt=k-1; rt<n; rt++){
			HM.put(arr[rt], HM.getOrDefault(arr[rt], 0)+1);
			answer.add(HM.size());
			HM.put(arr[lt], HM.get(arr[lt])-1);
            		if(HM.get(arr[lt])==0) HM.remove(arr[lt]);
            		lt++;
		}
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int k=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		for(int x : T.solution(n, k, arr)) System.out.print(x+" ");
	}
}
*/
