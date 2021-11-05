from collections import deque
import sys
input = sys.stdin.readline
n, m = map(int, input().split())
graph = {}
w = {}
for i in range(1, n+1):
    w[i] = float('inf')
for _ in range(m):
    a, b, c = map(int, input().split())
    graph[a] = graph.get(a, []) + [(b, c)]
    graph[b] = graph.get(b, []) + [(a, c)]
s, t = map(int, input().split())
w[s] = 0
que = deque([s])
while que:
    cur = que.popleft()
    for nxt, d in graph[cur]:
        if w[nxt] > w[cur] + d:
            w[nxt] = w[cur] + d
            que.append(nxt)
print(w[t])