# learn-algorithm

## Baekjoon judge
--------
[1463](https://boj.kr/1463) : [BOJ1463.java](baekjoon/src/BOJ1463.java) : 2018-09-10

- DP로 풀기
- 역산으로 하면 되네
- 순서대로 할려다가 안됐음...

[11726](https://boj.kr/11726) : [BOJ11726.java](baekjoon/src/BOJ11726.java) : 2018-09-11

- DP
- 피보나치네... 30분동안 삽질함

[11727](https://boj.kr/11727) : [BOJ11727.java](baekjoon/src/BOJ11727.java) : 2018-09-12

- DP
- 피보나치에 좀 더 장난친거
- 비슷한 문제 풀어놓고 이해를 잘못해서 이상하게 접근하고 있었다

[9095](https://boj.kr/9095) : [BOJ9095.java](baekjoon/src/BOJ9095.java) : 2018-09-13

- DP
- 피보나치 활용
- 얘는 3개 전까지 다 더함
- 1, 2, 3, 4를 이용하여 수를 만든다면 4개 전까지 다 더하면 될 것 같다.

[10844](https://boj.kr/10844) : [BOJ10844.java](baekjoon/src/BOJ10844.java) : 2018-09-13

- DP
- 오버플로우 잘 처리해야함
- 프로그램 로직은 맞는데 오버플로우 때문에 40분정도 씀

[11057](https://boj.kr/11057) : [BOJ11057.java](baekjoon/src/BOJ11057.java) : 2018-09-13

- DP
- 3항 계산이 우연으로 다른 방법으로 맞아떨어져 전혀 다르게 접근(...)
- 1\*10 + 2\*9 + 3\*8 + 4\*7 + 5\*6 + 6\*5 + 7\*4 + 8\*3 + 9\*2 + 10\*1 = 220이 왜 나와가지고 ㅠㅠ
- 경우의 수를 잘 따지자

[2193](https://boj.kr/2193) : [BOJ2193.java](baekjoon/src/BOJ2193.java) : 2018-09-14

- DP
- 얘는 뭐 나누라는 소리가 없네
- 우려대로 그냥 int 쓰면 오버플로우...
- BigInteger를 썼다

[9465](https://boj.kr/9465) : [BOJ9465.java](baekjoon/src/BOJ9465.java) : 2018-09-14

- DP
- DP로 할랬는데 왜 그리디로 짜졌을까...
- 갈아엎었다
- 재귀적 관계를 잘 생각하자

[2156](https://boj.kr/9465) : [BOJ2156.java](baekjoon/src/BOJ2156.java) : 2018-09-15

- DP
- 점화식은 잘 짰는데 두 개 이상 뛰어넘어야 하는 애가 안됨
- 0항을 이전 항 중 가장 큰 걸로 해줬어야 했음
- 예제는 우연히 2항이 가장 큰값이라서 그냥 2항을 0항에 넣었었음

[1003](https://boj.kr/1003) : [BOJ1003.java](baekjoon/src/BOJ1003.java) : 2018-09-15

- DP
- 4년 전에 풀다가 실패(...)
- 그 땐 DP도 제대로 몰랐던거 같다.
- 지금 푸니 쉽게 풀었다.

[11053](https://boj.kr/11053) : [BOJ11053.java](baekjoon/src/BOJ11053.java) : 2018-09-16

- DP
- 조금만 더 해보면 이런 식의 문제는 금방 풀 것 같다.

[11055](https://boj.kr/11055) : [BOJ11055.java](baekjoon/src/BOJ11055.java) : 2018-09-16

- DP
- 11053번을 조금 더 활용
- DP 배열을 하나 더 썼다.

[11722](https://boj.kr/11722) : [BOJ11722.java](baekjoon/src/BOJ11722.java) : 2018-09-17

- DP
- 11053 활용
- 조건 하나만 반대로

[11054](https://boj.kr/11054) : [BOJ11054.java](baekjoon/src/BOJ11054.java) : 2018-09-17

- DP
- 11053 + 11722
- 생각보다 오래 걸렸다. 왜 조금 응용 시켜놓으면 잘 안보일까 ㅠㅠ

[1912](https://boj.kr/1912) : [BOJ1912.java](baekjoon/src/BOJ1912.java) : 2018-09-18

- DP
- 음수 조건이 있어서 answer 초기화를 0으로 해줘서 계속 틀렸다.
