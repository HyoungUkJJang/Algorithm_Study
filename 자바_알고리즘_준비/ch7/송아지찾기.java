class Node{
    int data;
    Node back,move,five;
    public Node(int val) {
        data=val;
        back=move=five=null;

    }
}
public class Main {
    Node root;

    public int BFS(Node root, int k) {
        Queue<Node> node = new LinkedList<>();
        node.offer(root);
        int level=0;
        while (!node.isEmpty()) {
            int size = node.size();
            for(int i=0;i<size;i++) {
                Node poll = node.poll();
                if(poll.data==k) return level;
                else {
                    poll.back = new Node(poll.data - 1);
                    poll.move = new Node(poll.data +1);
                    poll.five = new Node(poll.data + 5);
                    node.offer(poll.back);
                    node.offer(poll.move);
                    node.offer(poll.five);
                }
            }
            level++;
        }
        return level;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        T.root = new Node(n);
        int result = T.BFS(T.root, k);
        System.out.print(result);

    }
}
/* 모범답
import java.util.*;
class Main {
	int answer=0;
	int[] dis={1, -1, 5};
	int[] ch;
	Queue<Integer> Q = new LinkedList<>();
	public int BFS(int s, int e){
		ch=new int[10001];
		ch[s]=1;
		Q.offer(s);
		int L=0;
		while(!Q.isEmpty()){
			int len=Q.size();
			for(int i=0; i<len; i++){
				int x = Q.poll();
				for(int j=0; j<3; j++){
					int nx=x+dis[j];
					if(nx==e){
						return L+1;
					}
					if(nx>=1 && nx<=10000 && ch[nx]==0){
						ch[nx]=1;
						Q.offer(nx);
					}
				}
			}
			L++;
		}
		return 0;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int s=kb.nextInt();
		int e=kb.nextInt();
		System.out.println(T.BFS(s, e));
	}	
}
*/
