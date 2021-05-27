#include <iostream>
#include <vector>
using namespace std;
int main()
{
    int n;
    scanf("%d", &n);
    vector<int> dis(n + 1); // dis 数组用于存放 i 号 和 i + 1 号顶点距离
    int sum = 0, left, right, query;
    for (int i = 1; i <= n; i++)
    {
        int temp;
        scanf("%d", &temp);
        sum += temp;  // 累加 sum
        dis[i] = sum; // 预处理 dis 数组
    }
    scanf("%d", &query);
    for (int i = 0; i < query; i++) // query 个查询
    {
        scanf("%d %d", &left, &right); // left -> right
        if (left > right)              // 当 left > right 时交换
            swap(left, right);
        int temp = dis[right - 1] - dis[left - 1];
        printf("%d\n", min(temp, sum - temp));
    }
    return 0;
}
