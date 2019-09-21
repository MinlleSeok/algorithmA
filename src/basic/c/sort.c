// 헤더 부분
int solve(int, int);

// 소스 부분
int A[500]; // 총 500개 까지 담을 수 있는 배열에서 탐색
int k; // 탐색할 값

int solve(int s, int e);
{
  int m;
  while(e-s>=0)
  {
    m=(s+e)/2; // 값이 있을 가능성이 있는 값의 가운데 값.
    if(A[m]==k)
      return m+1; // 그 값이 만약 탐색할 값이면 그 위치를 리턴.
    if(A[m]<k) s=m+1; // 만약 A[m]이 작으면 좀 더 큰값들이 있는 오른쪽이 탐색되도록 변경.
    else e=m-1; // 아까와 정반대
  }
  return -1; // 찾는 값이 없을 경우 -1을 준다.
}
