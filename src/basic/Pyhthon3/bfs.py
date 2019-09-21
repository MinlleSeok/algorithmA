visited = dict(zip([v for v in G], [False for _ in G])) # 방문 여부를 체크하는 배열

def bfs(v): # 정점 v부터 탐색 시작
  visited[v] = True
  queue = [v]
  while queue:
    now = queue.pop(0)
    for i in G[now]: # 현재 선택한 정점의 모든 자식 정점을 방문.
      if not visited[i]:
        visited[i] = True
        queue.append(i)
