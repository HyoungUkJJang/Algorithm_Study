### 너비 우선 탐색(BFS)
* 정점들과 같은 레벨에 있는 노드들을 먼저 탐색하는 방법

```java
    public ArrayList<String> BFS(HashMap<String, ArrayList<String>> data, String startNode) {

        ArrayList<String> visited = new ArrayList<>();
        ArrayList<String> needVisited = new ArrayList<>();

        needVisited.add(startNode);

        while (needVisited.size() > 0) {
            String node = needVisited.remove(0);
            if(!visited.contains(node)) {
                visited.add(node);
                needVisited.addAll(data.get(node));
            }
        }
        return visited;
    }
```

### 깊이 우선 탐색(DFS)
* 정점의 자식들을 먼저 탐색하는 방식
```java
    public ArrayList<String> DFS(HashMap<String, ArrayList<String>> data, String startNode) {

        ArrayList<String> visited = new ArrayList<>();
        ArrayList<String> needVisited = new ArrayList<>();

        needVisited.add(startNode);

        while (needVisited.size() > 0) {
            String node = needVisited.remove(needVisited.size()-1);
            if(!visited.contains(node)) {
                visited.add(node);
                needVisited.addAll(data.get(node));
            }
        }
        return visited;
    }
```
