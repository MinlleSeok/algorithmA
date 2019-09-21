// 헤더
#include<algorithm>
// .h는 붙이지 않는다.
// 소스, A가 배열이고 배열의 데이터 개수는 n개, 찾는 데이터는 k.
std::lower_bound(A,A+n,k,[compare])
std::upper_bound(A,A+n,k,[compare])
// [compare]는 비교 기준이며, 이게 생략된 경우 오름차순이라고 간주한다.

