void enqueue(int);
int dequeue();

struct linkedList
{
  int value;
  struct linkedList *next;
};
struct linkedList *front; // 큐의 맨 앞을 가리킨다
struct linkedList *back; // 큐의 맨 뒤를 가리킨다.

void enqueue(int n) // 큐에 자료를 넣는 함수
{
  if(front == NULL) // 큐가 비어 있을 경우
  {
    *front = {n, NULL}; // 맨 앞에 자료를 넣고
    back = front; // 맨 뒤와 맨 앞을 같게 한다.
  }
  else
  {
    back -> *next = {n, NULL}; // 맨 뒤 다음에 자료를 넣는다.
    back = back -> next; // 넣은 자료를 맨 뒤로 한다.
   }
 }
 
int dequeue() // 큐에서 자료를 빼는 함수
{
  int res = front -> value;
  front = front -> next;
  return res;
}
