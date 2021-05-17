#include <iostream>
using namespace std;
int main()
{
    // 定义相关变量，并为其进行初始化
    int N, row = 0;
    char c;
    cin >> N >> c;

    for (int i = 0; i < N; i++)
    {
        if ((2 * i * (i + 2) + 1) > N)
        {
            row = i - 1; // 计算出遍历打印的行数
            break;
        }
    }

    // 遍历打印倒三角的上面两排，注意最外层 for 循环的起始位置
    for (int i = row; i >= 1; i--)
    {
        for (int k = row - i; k >= 1; k--)
            cout << " "; // 输出空格
        for (int j = i * 2 + 1; j >= 1; j--)
            cout << c; // 输出元素符号
        cout << endl;
    }

    // 打印中间的元素
    for (int i = 0; i < row; i++)
        cout << " ";
    cout << c << endl;

    // 遍历打印正三角的下面两排，注意最外层 for 循环的起始位置
    for (int i = 1; i <= row; i++)
    {
        for (int k = row - i; k >= 1; k--)
            cout << " ";
        for (int j = i * 2 + 1; j >= 1; j--)
            cout << c;
        cout << endl;
    }

    // 输出剩余的符号个数
    cout << (N - (2 * row * (row + 2) + 1));

    return 0;
}
