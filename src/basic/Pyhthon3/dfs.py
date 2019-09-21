visited = dict(zip([v for v G], [False for _ in G]))

def dfs(v):
  for i in G[v]:
    if not visited[i]:
      visited[i] = True
      dfs(i)
