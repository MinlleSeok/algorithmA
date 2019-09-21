#define STACK_SIZE 500
int arr[STACK_SIZE]; // 스택의최대 크기는 500
int top = 0; // 스택의 현재 크기는 0

int push(int n)
{
  if (top >= STACK_SIZE) return -1;
  arr[top++] = n;
  return 0;
}

int pop()
{
  if (top <= 0) return -1;
  return arr[--top];
}
