#include<stdio.h>

int m,g[101][101]; // 정점은 최대 100개

int main()
{
  scanf("%d", &m); // 간선의 개수
  for(int i=0; i<m; i++)
  {
    int a, b, w; // a와 b는 간선이 연결된 곳, w는 가중치
    scanf("%d %d %d", &a, &b, &w);
    g[a][b]=g[b][a]=w;
    
    /*
    #include<vector>
    std::vector<int> G[101];
    // 소스 부분
    G[i].push_back (x); // i와 x는 연결된 그래프이다.
    */
