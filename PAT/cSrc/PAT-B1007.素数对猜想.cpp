#include<iostream>
#include<math.h>
using namespace std;
bool isPrimeNumber( int N )
    // 定义一个判断是否为素数的函数

{
    if (N <= 1) return false; 
    int sqrNumber = (int)sqrt(1.0 * N);
    // 利用sqrt函数给数开平方，并将值赋给sqrtNumber
        for(int i = 2;i <= sqrNumber;i++)
            if(N % i == 0)  return false;
            return true;       
}       
int main ()
{
    int count = 0;
    // 初始化素数对为0
    int N;
    cin >> N;
    for (int i = 3 ; i + 2 < N ; i += 2)
    {
        if(isPrimeNumber(i) && isPrimeNumber(i+2))
            count++;
         // 分别判断某个数和与他相差为2的数是否都为素数
    }
      cout << count << endl;
      // 输出素数的对数
      return 0;
}
